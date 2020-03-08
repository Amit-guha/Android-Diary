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

public class emergency extends AppCompatActivity {
    String [] hospitalName;
    String[]Mobile;
    int [] ImageHospital={R.drawable.dmc,R.drawable.raj,R.drawable.chittagong,R.drawable.rangpur,R.drawable.shsmc,
            R.drawable.ssmc,R.drawable.syllhetmag,R.drawable.comilla,R.drawable.sherebangla,R.drawable.khulnamedicalcollege,
            R.drawable.fmc,R.drawable.saherakhatun,R.drawable.abdurdinajpur,R.drawable.saheedziaur};

    private CircleImageView circleImageView;
    private TextView tMedical,tmobile;
    private ImageView callImage,MsgImage;
    public static  final int REQUEST_CALL=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        hospitalName=getResources().getStringArray(R.array.bdgovtmedicalcollege);
        Mobile=getResources().getStringArray(R.array.mobileNo);
        circleImageView=findViewById(R.id.Circle_contacthospital);
        tMedical=findViewById(R.id.Tv_medicaname);
        tmobile=findViewById(R.id.Tv_conactFirstnum);

        callImage=findViewById(R.id.Img_callMedical);
        MsgImage=findViewById(R.id.Img_msg);

        // Get intent data
        Intent intent = getIntent();

        // Selected image id
        final int position = intent.getIntExtra("code",0);


        //for titlebar
        getSupportActionBar().setTitle(hospitalName[position]);

        circleImageView.setImageResource(ImageHospital[position]);
        tMedical.setText(hospitalName[position]);
        tmobile.setText(Mobile[position]);

        callImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(emergency.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(emergency.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else{

                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +Mobile[position]));
                    //  Toast.makeText(Contact_details.this, "First call", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });

        MsgImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", Mobile[position], null)));
            }
        });



    }
}
