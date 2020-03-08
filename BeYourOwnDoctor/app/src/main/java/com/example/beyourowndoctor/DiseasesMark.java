package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DiseasesMark extends AppCompatActivity {
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_mark);


        getSupportActionBar().setTitle("রোগের লক্ষণ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        checkBox1=findViewById(R.id.check1);
        checkBox2=findViewById(R.id.check2);
        checkBox3=findViewById(R.id.check3);
        checkBox4=findViewById(R.id.check4);
        checkBox5=findViewById(R.id.check5);
        checkBox6=findViewById(R.id.check6);
        checkBox7=findViewById(R.id.check7);
        checkBox8=findViewById(R.id.check8);
        checkBox9=findViewById(R.id.check9);
        checkBox10=findViewById(R.id.check10);


        btnSubmit=findViewById(R.id.btnSubmit);


        Bundle bundle=getIntent().getExtras();
        if(bundle !=null){

            String c1=bundle.getString("check1");
            String c2=bundle.getString("check2");
            String c3=bundle.getString("check3");
            String c4=bundle.getString("check4");
            String c5=bundle.getString("check5");
            String c6=bundle.getString("check6");
            String c7=bundle.getString("check7");
            String c8=bundle.getString("check8");
            String c9=bundle.getString("check9");
            String c10=bundle.getString("check10");
            final String Medicare=bundle.getString("Lokkon");
            final String takecare=bundle.getString("Care");

            checkBox1.setText(c1);
            checkBox2.setText(c2);
            checkBox3.setText(c3);
            checkBox4.setText(c4);
            checkBox5.setText(c5);
            checkBox6.setText(c6);
            checkBox7.setText(c7);
            checkBox8.setText(c8);
            checkBox9.setText(c9);
            checkBox10.setText(c10);



            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                  /*  if(checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked()||
                            checkBox5.isChecked() || checkBox6.isChecked() || checkBox7.isChecked() || checkBox8.isChecked() ||
                            checkBox9.isChecked() || checkBox10.isChecked()){

                        Toast.makeText(DiseasesMark.this, " "+Medicare, Toast.LENGTH_SHORT).show();
                    }

                    else {
                        Toast.makeText(DiseasesMark.this, "Please Select anyone", Toast.LENGTH_SHORT).show();
                    }*/

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
                  if(checkBox6.isChecked()){
                      i++;
                  }
                  if(checkBox7.isChecked()){
                      i++;
                  }
                  if(checkBox8.isChecked()){
                      i++;
                  }
                  if(checkBox9.isChecked()){
                      i++;
                  }
                  if(checkBox10.isChecked()){
                      i++;
                  }

                  if(i>=5){
                     // Toast.makeText(DiseasesMark.this, ""+Medicare, Toast.LENGTH_SHORT).show();
                      Intent intent=new Intent(DiseasesMark.this,DiseasesName.class);
                      intent.putExtra("Lokkon",Medicare);
                      intent.putExtra("Care",takecare);
                      startActivity(intent);



                  }
                   if(i>0 && i<5){
                      Toast.makeText(DiseasesMark.this, "কমপক্ষে পাঁঁচটা সমস্যা সিলেক্ট করুন", Toast.LENGTH_SHORT).show();
                    }

                  if(i==0){
                      Toast.makeText(DiseasesMark.this, "দয়া করে আপনার সমস্যাসমূহ সিলেক্ট করুন", Toast.LENGTH_SHORT).show();
                  }


                }
            });

        }
    }
}
