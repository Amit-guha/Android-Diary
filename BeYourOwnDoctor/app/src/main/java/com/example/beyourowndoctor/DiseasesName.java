package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DiseasesName extends AppCompatActivity {
    private TextView tv_diseasesName,tv_takecare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_name);

        getSupportActionBar().setTitle("রোগের নাম এবং প্রতিষেধক");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tv_diseasesName=findViewById(R.id.tv_rogerName);
        tv_takecare=findViewById(R.id.tv_takecareName);

        Bundle bundle=getIntent().getExtras();
        if(bundle !=null){
            String diseaseName=bundle.getString("Lokkon");
            String TakeCare=bundle.getString("Care");

            tv_diseasesName.setText(diseaseName);
            tv_takecare.setText(TakeCare);
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
