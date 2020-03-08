package com.example.admissiontest2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Association extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_association);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar=findViewById(R.id.toolbar_asso);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Admission Test 2019-20");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       // Toolbar toolbar = findViewById(R.id.toolabr);
       // setSupportActionBar(toolbar);

        //getSupportActionBar().hide();

        listView=findViewById(R.id.list_association);
        String [] association=getResources().getStringArray(R.array.Association);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(Association.this,R.layout.student_association,
                R.id.tv_studentassociation,association);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(Association.this,Dhaka.class);
                    startActivity(intent);
                }

                else if(position==1){
                    Intent intent=new Intent(Association.this,Rangpur.class);
                    startActivity(intent);
                }

                else if(position==2){
                    Intent intent=new Intent(Association.this,Syllhet.class);
                    startActivity(intent);
                }

                else if(position==3){
                    Intent intent=new Intent(Association.this,Satkhira.class);
                    startActivity(intent);
                }

                else if(position==4){
                    Intent intent=new Intent(Association.this,Magura.class);
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent=new Intent(Association.this,Barishal.class);
                    startActivity(intent);
                }

                else if(position==6){
                    Intent intent=new Intent(Association.this,Jashore.class);
                    startActivity(intent);
                }
                else if(position==7){
                    Intent intent=new Intent(Association.this,Norail.class);
                    startActivity(intent);
                }
                else if(position==8){
                    Intent intent=new Intent(Association.this,Memensingh.class);
                    startActivity(intent);
                }

                else if(position==9){
                    Intent intent=new Intent(Association.this,JoypurHat.class);
                    startActivity(intent);
                }
                else if(position==10){
                    Intent intent=new Intent(Association.this,Rajshahi.class);
                    startActivity(intent);
                }
                else if(position==11){
                    Intent intent=new Intent(Association.this,Noyakali.class);
                    startActivity(intent);
                } else if(position==12){
                    Intent intent=new Intent(Association.this,meherpur.class);
                    startActivity(intent);
                } else if(position==13){
                    Intent intent=new Intent(Association.this,Manikgonj.class);
                    startActivity(intent);
                } else if(position==14){
                    Intent intent=new Intent(Association.this,Jinadah.class);
                    startActivity(intent);
                }


                else{
                    Toast.makeText(Association.this, "Wrong Keyward", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
