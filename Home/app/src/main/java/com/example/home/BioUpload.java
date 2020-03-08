package com.example.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

public class BioUpload extends AppCompatActivity {

    private Button Btn_Choosefile, btn_upload;
    private EditText Et_Filename,Et_mobile,Et_vara;
    private TextView tv_showdata;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private ImageView imge;
    private Uri ImageUri;
   // private ProgressBar progressBar;
    private static final int IMAGE_REQUEST = 1; //Check for the galary image



    //Firebase Database using for Storage image and data
    private StorageReference mstorgeRef,storageReference2;
    private DatabaseReference databaseReference,databaseReference2;
    private StorageTask muploadtask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_upload);

       // Toolbar toolbar=findViewById(R.id.my_toolbar);
        //setSupportActionBar(toolbar);



        getSupportActionBar().hide();



          //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
              // WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Bundle bundle=getIntent().getExtras();
        final String value=bundle.getString("Selectedkey");


        Btn_Choosefile = findViewById(R.id.Btn_Choosefile);
        btn_upload = findViewById(R.id.btn_upload);
        Et_Filename = findViewById(R.id.Et_Filename);
        Et_mobile=findViewById(R.id.Et_Mobile);
        Et_vara=findViewById(R.id.Et_vara);
        tv_showdata = findViewById(R.id.tv_showdata);
        imge = findViewById(R.id.img);
       // progressBar = findViewById(R.id.Progressbar);
        radioGroup=findViewById(R.id.RadioGroup);

       // storageReference= FirebaseStorage.getInstance().getReference("Gopalganj");
      //  storageReference2= FirebaseStorage.getInstance().getReference("Women");

        databaseReference= FirebaseDatabase.getInstance().getReference();
        mstorgeRef=FirebaseStorage.getInstance().getReference();
        //  databaseReference=FirebaseDatabase.getInstance().getReference("Gopalganj");
        //databaseReference2=FirebaseDatabase.getInstance().getReference("Women");


        Btn_Choosefile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageGallery();

            }
        });


        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(muploadtask !=null && muploadtask.isInProgress()){
                    Toast.makeText(BioUpload.this, "Upload Item is in Progress", Toast.LENGTH_SHORT).show();
                }
                else{
                    Upload_file();
                }


            }
        });


        tv_showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BioUpload.this,BioShow.class);
                intent.putExtra("Faculty",value);
                startActivity(intent);
               // openImageActivity();
            }
        });

    }

    private void openImageActivity(){
        // Intent intent=new Intent(this,BioShow.class);
        // intent.putExtra("Faculty",)
        // startActivity(intent);
    }




    //For opening the ImageGallery
    private void ImageGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, IMAGE_REQUEST);
    }


    //Select the picture from my gallery to my apps

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {

            ImageUri = data.getData();

            Picasso.with(this).load(ImageUri).into(imge);

        }



    }

    //for file type -->>> jpg or png
    private String getFileExtension(Uri uri){
        ContentResolver contentResolver=getContentResolver();
        MimeTypeMap mimeTypeMap=MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));

    }


    //uploadfile--->>>>>>>>Firebase
    private void Upload_file() {
        if (ImageUri != null) {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Uploading....");
            progressDialog.show();

            StorageReference filepath = mstorgeRef.child(System.currentTimeMillis() + "." + getFileExtension(ImageUri));
            muploadtask= filepath.putFile(ImageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressDialog.dismiss();
                            Toast.makeText(BioUpload.this, "Upload Successfully", Toast.LENGTH_SHORT).show();
                            Task<Uri>uriTask=taskSnapshot.getStorage().getDownloadUrl();
                            while (!uriTask.isSuccessful());
                            Uri downloadUri = uriTask.getResult();


                            //For Place
                            final String filename = Et_Filename.getText().toString().trim();

                            //For Amount
                            String amount = Et_vara.getText().toString().trim();

                            //For Radio Button
                            int radioId = radioGroup.getCheckedRadioButtonId();
                            radioButton = findViewById(radioId);
                            String gender = radioButton.getText().toString();

                            //For Mobile Number
                            String mobile = Et_mobile.getText().toString().trim();




                            Addition addition=new Addition(filename,downloadUri.toString(),mobile,
                          gender,amount);

                            //Previous Key
                            Bundle bundle=getIntent().getExtras();
                            final String value=bundle.getString("Selectedkey");



                           // final String pushkey = databaseReference.push().getKey();
                            databaseReference.child(value).push().setValue(addition).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    // Intent intent=new Intent(MainActivity.this,Department.class);
                                    // Bundle bundle=new Bundle();
                                    // intent.putExtra("amit",pushkey);
                                    // startActivity(intent);
                                    // Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

                                    Et_Filename.setText(" ");
                                    Et_mobile.setText(" ");
                                    Et_vara.setText(" ");




                                }
                            });
                        }

                    })

                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialog.dismiss();
                            Toast.makeText(BioUpload.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    })

                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
//                            double progress = (100.0 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
//                            progressDialog.setMessage("Uploaded" + (int) progress + " %");


                        }
                    });
        } else {
            Toast.makeText(this, "No File Selected", Toast.LENGTH_SHORT).show();
        }

    }
//End of the Upload funciton

}
