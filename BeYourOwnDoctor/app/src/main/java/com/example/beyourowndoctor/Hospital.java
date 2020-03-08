package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Hospital extends AppCompatActivity {

    String [] bdhospital;
    int [] hospitalImage={R.drawable.dmc,R.drawable.raj,R.drawable.chittagong,R.drawable.rangpur,R.drawable.shsmc,
    R.drawable.ssmc,R.drawable.syllhetmag,R.drawable.comilla,R.drawable.sherebangla,R.drawable.khulnamedicalcollege,
    R.drawable.fmc,R.drawable.saherakhatun,R.drawable.abdurdinajpur,R.drawable.saheedziaur};

    private RecyclerView recyclerView;
    cutomAdapter hospitaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        getSupportActionBar().setTitle("Medical College");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bdhospital=getResources().getStringArray(R.array.bdgovtmedicalcollege);
        recyclerView=findViewById(R.id.RecyHospital);

        hospitaAdapter=new cutomAdapter(this,bdhospital,hospitalImage);
        recyclerView.setAdapter(hospitaAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        hospitaAdapter.setOnItemClickLisitiner(new cutomAdapter.Clicklisitiner() {
            @Override
            public void OnItemClick(int positon, View view) {
               // Toast.makeText(Hospital.this, ""+bdhospital[positon], Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Hospital.this,emergency.class);
                intent.putExtra("code",positon);
                startActivity(intent);

            }
        });



    }
}
