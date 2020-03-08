package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class HealthCare extends AppCompatActivity {
    private GridView gridView;
    HealthAdapter adapter;

    String [] MentalCare;
    int [] figure={R.drawable.firstaidkit,R.drawable.blood,R.drawable.pain,R.drawable.burn,R.drawable.heartattack,
    R.drawable.nurse};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);

        getSupportActionBar().setTitle("Health Care");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        gridView=findViewById(R.id.GridViewID);
        MentalCare=getResources().getStringArray(R.array.healthCare);

        adapter=new HealthAdapter(this,MentalCare,figure);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(HealthCare.this, ""+i, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(HealthCare.this,HealthCareDetails.class);
                intent.putExtra("care",i);
                intent.putExtra("name",MentalCare[i]);
                startActivity(intent);
            }
        });


    }
}
