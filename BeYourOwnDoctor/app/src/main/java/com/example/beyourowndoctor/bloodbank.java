package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class bloodbank extends AppCompatActivity {
    private RecyclerView blood;
    cutomAdapter adapter;

    String [] bloodbank;
    int [] imagesBlood={R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,
            R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank,R.drawable.bloodbank};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank);

        //for back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Blood Bank");

        blood=findViewById(R.id.RecyclerBlood);
        bloodbank=getResources().getStringArray(R.array.Hospital_for_blood);
        adapter=new cutomAdapter(this,bloodbank,imagesBlood);
        blood.setAdapter(adapter);
        blood.setHasFixedSize(true);
        blood.setLayoutManager(new LinearLayoutManager(this));


        adapter.setOnItemClickLisitiner(new cutomAdapter.Clicklisitiner() {
            @Override
            public void OnItemClick(int positon, View view) {
                Intent intent=new Intent(com.example.beyourowndoctor.bloodbank.this,bloodbankdetails.class);

                intent.putExtra("code",positon);
                startActivity(intent);
            }
        });

    }
}
