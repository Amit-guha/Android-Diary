package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class DoctorName extends AppCompatActivity {

    RecyclerView recyclerView;
    DoctorAdapter doctorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_name);

      //  ArrayList<ExampleItem> ExampleList=new ArrayList<>();

        Bundle bundle = this.getIntent().getExtras();
        final String[] names=bundle.getStringArray("arrayOfName");
        final String [] designation=bundle.getStringArray("designaiton");
        final String [] Expertise=bundle.getStringArray("Expertise");
        final String [] Instituaton=bundle.getStringArray("Instituaton");
        final String [] Champber=bundle.getStringArray("champer");
        final String [] Mobile=bundle.getStringArray("Phone");

        String specilaname=bundle.getString("data");

        getSupportActionBar().setTitle(specilaname);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView=findViewById(R.id.RecylerDoctorName);
        doctorAdapter=new DoctorAdapter(this,names,designation,Expertise,Instituaton);
        recyclerView.setAdapter(doctorAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //OnItemclick
       doctorAdapter.setOnItemClickLisitiner(new DoctorAdapter.ClickLIsitiner() {
           @Override
           public void onItemclick(int position, View view) {
             //  Toast.makeText(DoctorName.this, ""+Mobile[position], Toast.LENGTH_SHORT).show();
               Intent intent=new Intent(DoctorName.this,DoctorPHone.class);
               intent.putExtra("arrayOfName",names[position]);
              // intent.putExtra("designation",designation[position]);
               intent.putExtra("Expertise",Expertise[position]);
               intent.putExtra("Instituaton",Instituaton[position]);
               intent.putExtra("champer",Champber[position]);
               intent.putExtra("Phone",Mobile[position]);
               startActivity(intent);
           }
       });



    }
}
