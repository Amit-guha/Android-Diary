package com.example.tolet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

public class Upload_City extends AppCompatActivity {
    private Button Btn_Choosefile;
    private EditText Et_Filename;
    private TextView tv_showdata,btn_upload;
    private ImageView imge;
    private Uri ImageUri;
    private ProgressBar progressBar;
    private static final int IMAGE_REQUEST = 1; //Check for the galary image

    private StorageReference storageReference;
    private DatabaseReference databaseReference;
    private StorageTask uploadTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload__city);



        Btn_Choosefile = findViewById(R.id.Btnchosepic);
        btn_upload = findViewById(R.id.btnsubmit);
        Et_Filename = findViewById(R.id.Et_Filename);
        tv_showdata = findViewById(R.id.tvshowdata);
        imge = findViewById(R.id.img);
        progressBar = findViewById(R.id.Progressbar);

        storageReference= FirebaseStorage.getInstance().getReference("Gopalganj");

        databaseReference= FirebaseDatabase.getInstance().getReference("Gopalganj");

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
                    Toast.makeText(Upload_City.this, "Upload Item is in Progress", Toast.LENGTH_SHORT).show();
                }
                else{
                    uploadFile();
                }


            }
        });


      tv_showdata.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(Upload_City.this,Upload_city_show_button.class);
              startActivity(intent);
          }
      });


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
            //  Img.setImageURI(imageuri);
            Picasso.with(this).load(ImageUri).networkPolicy(NetworkPolicy.OFFLINE).into(imge, new Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {
                    Picasso.with(Upload_City.this).load(ImageUri).into(imge);

                }
            });
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


            uploadTask = fileref.putFile(ImageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                  //  Handler handler = new Handler();
                   // handler.postDelayed(new Runnable() {
                      // @Override
                     //   public void run() {
                         //   progressBar.setProgress(0);
                      //  }
                //    }, 500);

                    Toast.makeText(Upload_City.this, "Upload Successfully", Toast.LENGTH_SHORT).show();

                    Task<Uri> uriTask = taskSnapshot.getStorage().getDownloadUrl();
                    while (!uriTask.isSuccessful()) ;
                    Uri downloadUri = uriTask.getResult();


                    //For Place
                    final String filename = Et_Filename.getText().toString().trim();

                        House house = new House(filename,
                                downloadUri.toString());
                        String upLoadid = databaseReference.push().getKey();
                        databaseReference.child(upLoadid).setValue(house);



                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Upload_City.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

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
