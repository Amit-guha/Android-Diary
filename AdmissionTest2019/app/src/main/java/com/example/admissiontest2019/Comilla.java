package com.example.admissiontest2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Comilla extends AppCompatActivity {
    private ImageView Img_call,Img_msg,Img_Secondcall,Img_Secondmsg;
    public static  final int REQUEST_CALL=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comilla);

        Img_call=findViewById(R.id.Img_call);
        Img_msg=findViewById(R.id.Img_msg);
        Img_Secondcall=findViewById(R.id.Img_Secondcall);
        Img_Secondmsg=findViewById(R.id.Img_Secondmsg);


        Img_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(Comilla.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(Comilla.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else{

                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +"01734229096"));
                   // Toast.makeText(Comilla.this, "First call", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });


        Img_Secondcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(Comilla.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(Comilla.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else{

                    Intent amit = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +"01521309117"));
                  //  Toast.makeText(Comilla.this, "Second Call", Toast.LENGTH_SHORT).show();
                    startActivity(amit);
                }
            }
        });



        Img_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "01734229096", null)));
            }
        });


        Img_Secondmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "01521309117", null)));


            }
        });

    }
}
