package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class FiveDiseasesMark extends AppCompatActivity {
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_diseases_mark);

        //bakcbutton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("রোগের লক্ষণ");

        checkBox1=findViewById(R.id.check1);
        checkBox2=findViewById(R.id.check2);
        checkBox3=findViewById(R.id.check3);
        checkBox4=findViewById(R.id.check4);
        checkBox5=findViewById(R.id.check5);

        btnSubmit=findViewById(R.id.btnSubmit);

        Bundle bundle=getIntent().getExtras();
        if(bundle != null){
            String c1=bundle.getString("check1");
            String c2=bundle.getString("check2");
            String c3=bundle.getString("check3");
            String c4=bundle.getString("check4");
            String c5=bundle.getString("check5");

            final String Medicare=bundle.getString("Lokkon");
           final String takecare=bundle.getString("Care");

            checkBox1.setText(c1);
            checkBox2.setText(c2);
            checkBox3.setText(c3);
            checkBox4.setText(c4);
            checkBox5.setText(c5);

            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int i=0;
                    if(checkBox1.isChecked()){
                        i++;
                    }
                    if(checkBox2.isChecked()){
                        i++;
                    }
                    if(checkBox3.isChecked()){
                        i++;
                    }
                    if(checkBox4.isChecked()){
                        i++;
                    }
                    if(checkBox5.isChecked()){
                        i++;
                    }
                    if(i>=3){
                        //Toast.makeText(FiveDiseasesMark.this, ""+Medicare, Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(FiveDiseasesMark.this,DiseasesName.class);
                        intent.putExtra("Lokkon",Medicare);
                        intent.putExtra("Care",takecare);
                        startActivity(intent);
                    }
                    if(i>0 && i<3){
                        Toast.makeText(FiveDiseasesMark.this, "কমপক্ষে তিনটি সমস্যা সিলেক্ট করুন", Toast.LENGTH_SHORT).show();
                    }

                    if(i==0){
                        Toast.makeText(FiveDiseasesMark.this, "দয়া করে আপনার সমস্যাসমূহ সিলেক্ট করুন", Toast.LENGTH_SHORT).show();
                    }
                }
            });

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
