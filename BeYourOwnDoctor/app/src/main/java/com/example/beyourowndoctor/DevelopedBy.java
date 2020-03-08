package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DevelopedBy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developed_by);

        getSupportActionBar().setTitle("Developer ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
