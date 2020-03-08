package com.example.beyourowndoctor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private LinearLayout linearSyntom,linDoctor,linearhospital,linearhealtcare,lineFirsAids,linDeveloped;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.naviatinBAr);
        navigationView.setNavigationItemSelectedListener(this);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        linearSyntom=findViewById(R.id.LinSyntom);
        linDoctor=findViewById(R.id.LinDoct);
        linearhospital=findViewById(R.id.LinHospital);
        linearhealtcare=findViewById(R.id.LinHealthCare);
        lineFirsAids=findViewById(R.id.LinFirsAids);
        linDeveloped=findViewById(R.id.LinDeveloped);


        linDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LinDoct){
                   Intent intent=new Intent(MainActivity.this,Specilist_Doctor.class);
                    startActivity(intent);
                }
            }
        });

        linearSyntom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LinSyntom){
                    Intent intent=new Intent(MainActivity.this,DiseasesCatagorey.class);
                    startActivity(intent);
                }
            }
        });

        lineFirsAids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LinFirsAids){
                    Intent intent=new Intent(MainActivity.this,FirstAids.class);
                    startActivity(intent);
                }
            }
        });


        linearhealtcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LinHealthCare){
                    Intent intent=new Intent(MainActivity.this,HealthCare.class);
                    startActivity(intent);
                }
            }
        });

        linDeveloped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LinDeveloped){
                    Intent intent=new Intent(MainActivity.this,bloodbank.class);
                    startActivity(intent);
                }
            }
        });

        linearhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LinHospital){
                    Intent intent=new Intent(MainActivity.this,Hospital.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if(menuItem.getItemId()==R.id.about){
            Intent intent=new Intent(MainActivity.this,about.class);
            startActivity(intent);
        }
       else if(menuItem.getItemId()==R.id.Share){
          Intent intent=new Intent();
          intent.setAction(Intent.ACTION_SEND);
          intent.putExtra(Intent.EXTRA_TEXT,"This app is very Useful for all user who are thinking about their health and others;");
          intent.putExtra(Intent.EXTRA_TEXT,"Be Your Own Doctor");
          intent.setType("text/plain");
          startActivity(Intent.createChooser(intent,null));

        }

        else if(menuItem.getItemId()==R.id.feebackid){
            Intent intent=new Intent(MainActivity.this,Feedback.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.biod){

            Intent intent=new Intent(MainActivity.this,BYOD.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.aboutus){
            Intent intent=new Intent(MainActivity.this,DevelopedBy.class);
            startActivity(intent);
        }


        return false;
    }
}
