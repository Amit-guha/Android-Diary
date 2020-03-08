package com.example.admissiontest2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Interface_First extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private LinearLayout LSeat,LinearWeb,linearAssociation;
    private TextView tvfaaculty,Tvdept,Tvweb;
    private ImageView img,imgDept,imgWebsite;
    private DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface__first);

        getSupportActionBar().setTitle("Admission Test 2019-20");

        drawerLayout=findViewById(R.id.draw_id);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(drawerToggle);

        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        LSeat=findViewById(R.id.Seat);
        LinearWeb=findViewById(R.id.LinearWeb);
        linearAssociation=findViewById(R.id.linearAssociation);

        LSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Interface_First.this,MainActivity.class);
                startActivity(intent);
            }
        });

        LinearWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Interface_First.this,Website.class);
                startActivity(intent);
            }
        });

        linearAssociation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Interface_First.this,Association.class);
                startActivity(intent);
            }
        });

        tvfaaculty=findViewById(R.id.Tvfaculty);
        img=findViewById(R.id.img);
        Tvdept=findViewById(R.id.Tvdept);
        imgDept=findViewById(R.id.imgDept);
        Tvweb=findViewById(R.id.Tvweb);
        imgWebsite=findViewById(R.id.imgWebsite);

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Interface_First.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Intent intent;
        if(menuItem.getItemId()==R.id.home_draw){
            intent=new Intent(Interface_First.this,Interface_First.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.assocation){
            intent=new Intent(Interface_First.this,Association.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.result_draw){
            intent=new Intent(Interface_First.this,Admission_result.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.web_draw){
            intent=new Intent(Interface_First.this,Website.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.draw_about){
           intent=new Intent(Interface_First.this,About.class);
           startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.draw_contact){
            intent=new Intent(Interface_First.this,Contact_us.class);
            startActivity(intent);
        }


        return false;
    }
}
