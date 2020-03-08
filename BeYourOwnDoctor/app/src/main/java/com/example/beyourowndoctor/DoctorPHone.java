package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DoctorPHone extends AppCompatActivity {
    private CircleImageView circleImageView;
    private TextView tvname,tvexpert,tvmedical,tvmobile,tvchamber;
    private ImageView imgcall,imgmsg;
    public static  final int REQUEST_CALL=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_phone);



        tvname=findViewById(R.id.Tv_contactname);
        tvexpert=findViewById(R.id.Tv_contDesg);
        tvmedical=findViewById(R.id.Tv_contmedical);
        tvmobile=findViewById(R.id.Tv_conactFirstnum);
        tvchamber=findViewById(R.id.Tv_contactSecond);

        imgcall=findViewById(R.id.Img_call);
        imgmsg=findViewById(R.id.Img_msg);

        Bundle bundle=getIntent().getExtras();
        if(bundle != null){
            String name=bundle.getString("arrayOfName");
            String Expertise=bundle.getString("Expertise");
            String Medical=bundle.getString("Instituaton");
            final String Mobile=bundle.getString("Phone");
            String Chamber=bundle.getString("champer");

            getSupportActionBar().setTitle(name);


            tvname.setText(name);
            tvexpert.setText(Expertise);
            tvmedical.setText(Medical);
            tvmobile.setText(Mobile);
            tvchamber.setText(Chamber);

            imgcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ContextCompat.checkSelfPermission(DoctorPHone.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                        ActivityCompat.requestPermissions(DoctorPHone.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                    }
                    else{

                        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +Mobile));
                        //  Toast.makeText(Contact_details.this, "First call", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }

                }
            });

            imgmsg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", Mobile, null)));

                }
            });

        }


    }
}
