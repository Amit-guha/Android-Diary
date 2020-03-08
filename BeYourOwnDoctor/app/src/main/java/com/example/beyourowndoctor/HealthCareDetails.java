package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HealthCareDetails extends AppCompatActivity {
    private TextView tvHeading,tvDetails;
    private ImageView imageView;

    String [] MentalCare;
    String [] carelast;
    int [] figure={R.drawable.firstaidkit,R.drawable.blood,R.drawable.pain,R.drawable.burn,R.drawable.heartattack,
            R.drawable.nurse};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care_details);

        tvHeading=findViewById(R.id.tv_whatisFristAids1Care);
        tvDetails=findViewById(R.id.tv_whatisFristAids2Care);

        carelast=getResources().getStringArray(R.array.careDetails);
        imageView=findViewById(R.id.ImagIdCare);

        Bundle bundle=getIntent().getExtras();
        String value=bundle.getString("name");

        // Get intent data
        Intent intent = getIntent();

        // Selected image id
        int position = intent.getIntExtra("care",0);
        getSupportActionBar().setTitle(value);
       imageView.setImageResource(figure[position]);
       tvHeading.setText(value);
       tvDetails.setText(carelast[position]);

    }
}
