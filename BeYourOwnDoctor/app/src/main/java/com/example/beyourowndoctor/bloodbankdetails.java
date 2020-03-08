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

public class bloodbankdetails extends AppCompatActivity {
    private CircleImageView circleImageView;
    private TextView tv_bloodbank,tv_bloodaddress,tv_mobile;
    private ImageView imagcall,imagmsg;
    public static final int REQUEST_CALL=1;

    String [] bloodName;
    String [] bloodAddress;
    String[] MobileAddress;

    int [] bloodPic={R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbankdetails);

        circleImageView=findViewById(R.id.circle_bloodbank);
        tv_bloodbank=findViewById(R.id.tv_bloodbankname);
        tv_bloodaddress=findViewById(R.id.tv_bloodbankaddress);
        tv_mobile=findViewById(R.id.Tv_conactFirstnum);
        imagcall=findViewById(R.id.Img_callMedical);
        imagmsg=findViewById(R.id.Img_msg);

        //for backbutton
      getSupportActionBar().setDisplayShowHomeEnabled(true);

        //array for hospita & their address
        bloodAddress=getResources().getStringArray(R.array.BloodBankAddress);
        bloodName=getResources().getStringArray(R.array.Hospital_for_blood);
        MobileAddress=getResources().getStringArray(R.array.MobileforBloodBank);


        // Get intent data
        Intent intent = getIntent();

        // Selected image id
        final int position = intent.getIntExtra("code",0);

        getSupportActionBar().setTitle(bloodName[position]);
        circleImageView.setImageResource(bloodPic[position]);
        tv_bloodbank.setText(bloodName[position]);
        tv_bloodaddress.setText(bloodAddress[position]);
        tv_mobile.setText(MobileAddress[position]);


        //call

        imagcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(bloodbankdetails.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

                    ActivityCompat.requestPermissions(bloodbankdetails.this,new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }
                else{

                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +MobileAddress[position]));
                    //  Toast.makeText(Contact_details.this, "First call", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });

        //Message
        imagmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", MobileAddress[position], null)));
            }
        });



    }


}
