package com.example.admissiontest2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Manikgonj extends AppCompatActivity {


    private ImageView Img_call,Img_msg,Img_Secondcall,Img_Secondmsg;
    public static  final int REQUEST_CALL=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manikgonj);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Img_call=findViewById(R.id.Img_call);
        Img_msg=findViewById(R.id.Img_msg);
        Img_Secondcall=findViewById(R.id.Img_Secondcall);
        Img_Secondmsg=findViewById(R.id.Img_Secondmsg);


        Img_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(Manikgonj.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(Manikgonj.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else{

                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +"01835515489"));
                    // Toast.makeText(Satkhira.this, "First call", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });


        Img_Secondcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(Manikgonj.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(Manikgonj.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else{

                    Intent amit = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +"01689378038"));
                    // Toast.makeText(Satkhira.this, "Second Call", Toast.LENGTH_SHORT).show();
                    startActivity(amit);
                }
            }
        });



        Img_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "01835515489", null)));
            }
        });


        Img_Secondmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "01689378038", null)));


            }
        });
    }
}
