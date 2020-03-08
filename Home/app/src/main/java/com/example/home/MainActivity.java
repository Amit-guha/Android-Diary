package com.example.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private Button BtnGallery;
    private EditText EtCity;
    private TextView tv_showdata,TvSubmit;
    private ImageView imgeView;
    private Uri ImageUri;
   // private ProgressBar progressBar;
    private static final int PICK_UP_IMAGE = 1; //Check for the galary image


    StorageReference mstorgeRef ;
    DatabaseReference databaseReference;
    StorageTask muploadtask;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Boolean customtitlebarSupported = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

       /* if (customtitlebarSupported) {
            getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_titlebar);

        }
*/

        BtnGallery=findViewById(R.id.BtnGallery);
        EtCity=findViewById(R.id.EtCity);
        tv_showdata=findViewById(R.id.tvshowdata);
        TvSubmit=findViewById(R.id.Tvsubmit);
        imgeView=findViewById(R.id.img);
      //  progressBar=findViewById(R.id.Progressbar);


        mstorgeRef = FirebaseStorage.getInstance().getReference("Project");
        databaseReference= FirebaseDatabase.getInstance().getReference("Para");


        //choose image from gallery
        BtnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Choose_Image();
            }
        });


//Upload images and others data
        TvSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.Tvsubmit) {
                    if (muploadtask!= null && muploadtask.isInProgress()) {
                        Toast.makeText(getApplicationContext(), "This file is already Exist", Toast.LENGTH_SHORT).show();
                    } else {
                        Upload_file();
                    }
                }
            }
        });


        tv_showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,CityShow.class);
                startActivity(intent);
            }
        });

    }

    private void Choose_Image() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_UP_IMAGE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_UP_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {
            ImageUri = data.getData();
            //
            //  Img.setImageURI(imageuri);
            Picasso.with(this).load(ImageUri).networkPolicy(NetworkPolicy.OFFLINE).into(imgeView, new Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {
                    Picasso.with(MainActivity.this).load(ImageUri).into(imgeView);

                }
            });


        }
    }

    private String getFileExtension(Uri uri) {       // to get the file extension
        ContentResolver Cr = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(Cr.getType(uri));
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
                            Toast.makeText(MainActivity.this, "Upload Successfully", Toast.LENGTH_SHORT).show();
                            Task<Uri>uriTask=taskSnapshot.getStorage().getDownloadUrl();
                            while (!uriTask.isSuccessful());
                            Uri downloadUri = uriTask.getResult();


                            Upload upload = new Upload(EtCity.getText().toString().trim(),
                                    downloadUri.toString());
                            EtCity.setText(" ");

                            final String pushkey = databaseReference.push().getKey();
                            databaseReference.child(pushkey).setValue(upload).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    // Intent intent=new Intent(MainActivity.this,Department.class);
                                    // Bundle bundle=new Bundle();
                                    // intent.putExtra("amit",pushkey);
                                    // startActivity(intent);
                                    // Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();



                                }
                            });
                        }

                    })

                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialog.dismiss();
                            Toast.makeText(MainActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

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
