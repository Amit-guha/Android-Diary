package com.example.tolet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {
    private Button Btn_Choosefile, btn_upload;
    private EditText Et_Filename,Et_mobile,Et_vara;
    private TextView tv_showdata;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private ImageView imge;
    private Uri ImageUri;
    private ProgressBar progressBar;
    private static final int IMAGE_REQUEST = 1; //Check for the galary image

    //Firebase Database using for Storage image and data
    private StorageReference storageReference,storageReference2;
   private DatabaseReference databaseReference,databaseReference2;
   private StorageTask uploadTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Btn_Choosefile = findViewById(R.id.Btn_Choosefile);
        btn_upload = findViewById(R.id.btn_upload);
        Et_Filename = findViewById(R.id.Et_Filename);
        Et_mobile=findViewById(R.id.Et_Mobile);
        Et_vara=findViewById(R.id.Et_vara);
        tv_showdata = findViewById(R.id.tv_showdata);
        imge = findViewById(R.id.img);
        progressBar = findViewById(R.id.Progressbar);
        radioGroup=findViewById(R.id.RadioGroup);

        storageReference= FirebaseStorage.getInstance().getReference("Gopalganj");
        storageReference2= FirebaseStorage.getInstance().getReference("Women");

        databaseReference=FirebaseDatabase.getInstance().getReference("Gopalganj");
      //  databaseReference=FirebaseDatabase.getInstance().getReference("Gopalganj");
        databaseReference2=FirebaseDatabase.getInstance().getReference("Women");


        Btn_Choosefile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageGallery();

            }
        });


        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uploadTask !=null && uploadTask.isInProgress()){
                    Toast.makeText(MainActivity.this, "Upload Item is in Progress", Toast.LENGTH_SHORT).show();
                }
                else{
                    uploadFile();
                }


            }
        });


        tv_showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImageActivity();
            }
        });

    }

    private void openImageActivity(){
       // Intent intent=new Intent(this,ShowUpload.class);
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


    private void uploadFile() {


        if (ImageUri != null) {

                StorageReference fileref = storageReference.child(System.currentTimeMillis() + "." +
                        getFileExtension(ImageUri));


                uploadTask = fileref.putFile(ImageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setProgress(0);
                            }
                        }, 500);

                        Toast.makeText(MainActivity.this, "Upload Successfully", Toast.LENGTH_SHORT).show();

                        Task<Uri> uriTask = taskSnapshot.getStorage().getDownloadUrl();
                        while (!uriTask.isSuccessful()) ;
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


                        if (gender.equals("Female")) {

                        //    House house = new House(filename,
                             //       downloadUri.toString(), amount, mobile, gender);
                          //  String upLoadid = databaseReference2.push().getKey();
                           // databaseReference2.child(upLoadid).setValue(house);


                        } else {
                         //   House house = new House(filename,
                                  //  downloadUri.toString(), amount, mobile, gender);
                         //   String upLoadid = databaseReference.push().getKey();
                           // databaseReference.child(upLoadid).setValue(house);
                        }


                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {

                        double progress = (100.0 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                        progressBar.setProgress((int) progress);
                    }
                });

            }



        else{
            Toast.makeText(this, "No file Selected", Toast.LENGTH_SHORT).show();
        }

    }

}
