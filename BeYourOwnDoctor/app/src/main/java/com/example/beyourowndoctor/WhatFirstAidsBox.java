package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WhatFirstAidsBox extends AppCompatActivity {
    private TextView textView,textView1;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_first_aids_box);

        textView=findViewById(R.id.tv_whatisFristAids);
        textView1=findViewById(R.id.tv_whatisFristAids1);
        imageView=findViewById(R.id.ImagId);

        Bundle bundle=getIntent().getExtras();
        if(bundle != null){
            String title=bundle.getString("Name");
            String Value=bundle.getString("What");

            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            textView1.setText(title);
            textView.setText(Value);
        }
    }
}
