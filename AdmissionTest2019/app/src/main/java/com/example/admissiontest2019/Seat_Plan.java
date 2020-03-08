package com.example.admissiontest2019;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Seat_Plan extends AppCompatActivity {

    private TextView tvs_setRoll, tvs_unitset, tvs_LocationSEt, tvs_roomset, tvs_dateset, tv_devel, tv_searchAgain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat__plan);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        tvs_setRoll = findViewById(R.id.tvs_setRoll);
        tvs_unitset = findViewById(R.id.tvs_unitset);
        tvs_LocationSEt = findViewById(R.id.tvs_LocationSEt);
        tvs_roomset = findViewById(R.id.tvs_roomset);
        tvs_dateset = findViewById(R.id.tvs_dateset);
        // tv_devel = findViewById(R.id.tv_devel);
        tv_searchAgain = findViewById(R.id.tv_SearchAgain);
        LinearLayout layout = findViewById(R.id.LinerLaoyout6);


        tv_searchAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent again = new Intent(Seat_Plan.this, MainActivity.class);
                startActivity(again);
            }
        });

        //Button
        // Get_dierction=findViewById(R.id.Get_Direction);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle direction = getIntent().getExtras();
                if (direction != null) {
                    final String getDirection = direction.getString("E1");
                    String[] split = getDirection.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");

                    String part1 = split[0];
                    String part2 = split[1];

                    int check = Integer.parseInt(part2);


                    if ((part1.equals("A") && check >= 1 && check <= 1248) || (part1.equals("C") && check >= 1 && check <= 1055)
                            || (part1.equals("H") && check >= 1 && check <= 1055) || (part1.equals("B") && check >= 1 && check <= 1055) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.966122 + "," + 89.817163 + " (" + " Administrative Building ,BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    else if ((part1.equals("A") && check >= 1249 && check <= 5602) || (part1.equals("C") && check >= 1056 && check <= 7309)
                            || (part1.equals("H") && check >= 1056 && check <= 7307) ||(part1.equals("B") && check >= 1056 && check <= 5406)
                            ||(part1.equals("I") && check >= 00001 && check <= 1000)  ) {
                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.966737 + "," + 89.816874 + " (" + " Academic Building ,BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);

                    }


                    //change the seat plan
                    else if(part1.equals("B") && check>=5407 && check<=7306){
                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.993168 + "," + 89.815269 + " (" + "Fisheries Diploma Institute,near to Circuit House" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    //change the seat plan
                    else if(part1.equals("A") && check>=5603 && check<=7562){
                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.993168 + "," + 89.815269 + " (" + "Fisheries Diploma Institute,near to Circuit House" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
//Fishererish diploma institute
                    }

                    else if ((part1.equals("A") && check >= 7563  && check <= 7954) ||( part1.equals("C") && check >= 7310  && check <= 7701)
                            || (part1.equals("H") && check >=7308   && check <= 7699) || (part1.equals("B") && check >= 7307  && check <= 7698)) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.968109 + "," + 89.816966 + " (" + "Ekushey February Library,BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    else if ((part1.equals("A") && check >= 7955  && check <= 8464) || (part1.equals("C") && check >= 7702  && check <= 8211)
                            || (part1.equals("H") && check >= 7700  && check <= 8209) ||  (part1.equals("B") && check >= 7699  && check <= 8208) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.968109 + "," + 89.816966 + " (" + "University Cafeteria,BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        Toast.makeText(Seat_Plan.this, "Before the Ekushey February Library,BSMRSTU", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }

                    else if ((part1.equals("A") && check >= 8465 && check <= 9759) || (part1.equals("C") && check >= 8212   && check <= 9506)
                            || (part1.equals("H") && check >= 8210   && check <= 9498) || (part1.equals("B") && check >= 8209    && check <= 9503) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.968109 + "," + 89.816966 + " (" + "University Garage,BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        Toast.makeText(Seat_Plan.this, "Before the Ekushey February Library,BSMRSTU", Toast.LENGTH_SHORT).show();
                        startActivity(intent);

                    }

                    else if ((part1.equals("A") && check >= 9760 && check <= 10199) ||(part1.equals("C") && check >= 9507   && check <= 9916)
                            || (part1.equals("B") && check >= 9504   && check <= 9913) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.968109 + "," + 89.816966 + " (" + "Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        Toast.makeText(Seat_Plan.this, "After the Ekushey February Library,BSMRSTU", Toast.LENGTH_SHORT).show();
                        startActivity(intent);

                    }

                    else if ((part1.equals("A") && check >= 10200 && check <= 10527)||(part1.equals("C") && check >= 9917   && check <= 10244)
                            || (part1.equals("B") && check >= 9914  && check <= 10241) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.968109 + "," + 89.816966 + " (" + "Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        Toast.makeText(Seat_Plan.this, "After the Ekushey February Library,BSMRSTU", Toast.LENGTH_SHORT).show();
                        startActivity(intent);


                    }

                    else if ((part1.equals("A") && check >= 10528  && check <= 11570) || (part1.equals("C") && check >=10245 && check <=11287)
                            || (part1.equals("B") && check >=10242 && check <=11284)) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.964911 + "," + 89.819983 + " (" + " Bangabandhu University School & College (Near VC`s Residence),BSMRSTU" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);

                    }

                    //  Govt. Bangabandhu College, Gopalganj
                    else if (part1.equals("C") && check >= 11288 && check <= 13972) {
                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.007293 + "," + 89.828329 + " (" + "Govt. Bangabandhu College,Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    // Sheikh Hasina Govt. Girls High School, Gopalganj
                    else if ((part1.equals("A") && check >= 11571 && check <= 12886) ||(part1.equals("C") && check >=13973 && check <=15288)
                            || (part1.equals("B") && check >=11285 && check <=12600) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.004567 + "," + 89.825219 + " (" + "Sheikh Hasina Govt. Girls High School, Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }
                    //: Sarnakoli High School, Gopalganj
                    else if ((part1.equals("A") && check >= 12887 && check <= 13663) ||(part1.equals("C") && check >=15289 && check <=16065)) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.004559 + "," + 89.824691 + " (" + "Sarnakoli High School, Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }
                    //Center: Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj
                    else if (part1.equals("C") && check >= 16066 && check <= 17388) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.007325 + "," + 89.826389 + " (" + "Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }
                    //Center: Gopalganj Girls High School
                    else if (part1.equals("A") && check >= 13664 && check <= 14174) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.003380 + "," + 89.821586 + " (" + "Gopalganj Girls High School" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }
                    // Technical School and College, Gopalganj

                    else if (part1.equals("A") && check >= 14175 && check <= 14796) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 22.997973 + "," + 89.816022 + " (" + "Technical School and College, Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    //Center: Jugoshikha Girls School
                    else if ((part1.equals("A") && check >= 14797  && check <= 15580) || (part1.equals("C") && check >= 17389 && check <= 18172)) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.014552 + "," + 89.833273 + " (" + "Jugoshikha Girls School" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    //Center: Hazi Lal Mia City College, Gopalganj
                    else if ((part1.equals("A") && check >= 15581  && check <= 17533) ||(part1.equals("C") && check >= 18173  && check <= 20125) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.010817 + "," + 89.826245 + " (" + "Hazi Lal Mia City College, Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    //Center: S.M. Model Govt. High School
                    else if (part1.equals("A") && check >= 17534  && check <= 19117) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.004864 + "," + 89.829073 + " (" + "S.M. Model Govt. High School" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    //Center: Binapani Govt. Girls High School, Gopalganj
                    else if ((part1.equals("A") && check >= 19118  && check <= 20142) || (part1.equals("C") && check >= 20126 && check <= 21498) ) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.007851 + "," + 89.831021 + " (" + "Binapani Govt. Girls High School, Gopalganj" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    //Center: Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)
                    else if (part1.equals("A") && check >= 20143  && check <= 20795) {
                        Toast.makeText(Seat_Plan.this, "Sorry,Google can not find the direct Location", Toast.LENGTH_SHORT).show();
                    }

                    //Center: Salehia Kamil Madrasah (Alia Madrasah) Room No Roll
                    else if (part1.equals("A") && check >= 20796  && check <= 21343) {

                        String strUri = "http://maps.google.com/maps?q=loc:" + 23.010346 + "," + 89.829614 + " (" + "Salehia Kamil Madrasah (Alia Madrasah" + ")";
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                        startActivity(intent);
                    }

                    // Wahab Adorsho High School
                    else if ((part1.equals("A") && check >= 21344  && check <= 21927) || (part1.equals("B") && check >= 12601  && check <= 13493)) {


                      //  String strUri = "http://maps.google.com/maps?q=loc:" + 22.967988 + "," + 89.817422 + " (" + "Wahab Adorsho High School" + ")";
                       // Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                       // intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                       // startActivity(intent);
                        Toast.makeText(Seat_Plan.this, "Sorry,Google can not find the direction Location", Toast.LENGTH_SHORT).show();

                    }
                    // : Notun High School, Mohammad Para
                    else if (part1.equals("A") && check >= 21928  && check <= 22500) {
                        Toast.makeText(Seat_Plan.this, "Sorry,Google can not find the direction Location", Toast.LENGTH_SHORT).show();
                    }



                }

            }
        });


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            final String value = bundle.getString("E1");

            String[] split = value.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");

            String part1 = split[0];
            String part2 = split[1];

            int check = Integer.parseInt(part2);

            //B Unit of Seat Plan BSMRSTU----->>>>>>
            //---------------------------------------

            // Seat plan 2019


            if (part1.equals("B") && check >= 00001 && check <= 168) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Bank Varanda (Ground floor)");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 169 && check <= 336) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Faculty Varanda (Ground floor)");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 337 && check <= 418) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("303");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 419 && check <= 470) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 471 && check <= 552) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("403");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 553 && check <= 604) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 605 && check <= 676) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 677 && check <= 708) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 709 && check <= 760) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("416");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 761 && check <= 832) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("503");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 833 && check <= 879) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("504");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 880 && check <= 926) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 927 && check <= 1008) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("513");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1009 && check <= 1055) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("516");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            //Academic Building


            else if (part1.equals("B") && check >= 1056 && check <= 1208) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("Varanda (Ground floor), infront of Pharmacy Lab");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1209 && check <= 1300) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1301 && check <= 1392) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1393 && check <= 1597) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("113");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

///
            else if (part1.equals("B") && check >= 1598 && check <= 1722) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("114");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1723 && check <= 1835) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("115");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1836 && check <= 1988) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("116");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 1989 && check <= 2091) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("117");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2092 && check <= 2194) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("118");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2195 && check <= 2241) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("201");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2242 && check <= 2328) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("202");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2329 && check <= 2415) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("203");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2416 && check <= 2472) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("205");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2473 && check <= 2519) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("209");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2520 && check <= 2581) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("213");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2582 && check <= 2643) {
                tvs_setRoll.setText(value);
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("217");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2644 && check <= 2705) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("218");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2706 && check <= 2767) {
                tvs_setRoll.setText(value);
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("219");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2768 && check <= 2870) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("221");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2871 && check <= 2973) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("224");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 2974 && check <= 3076) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("225");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3077 && check <= 3113) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("302");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3114 && check <= 3235) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("307");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3236 && check <= 3302) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3303 && check <= 3394) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("312");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3395 && check <= 3456) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("314");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3457 && check <= 3518) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("315");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3519 && check <= 3580) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("319");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3581 && check <= 3642) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("320");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3643 && check <= 3745) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("321");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3746 && check <= 3807) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("322");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3808 && check <= 3910) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("326");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3911 && check <= 3967) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("401(B)");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 3968 && check <= 4029) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("407(B)");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4030 && check <= 4132) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4133 && check <= 4235) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4236 && check <= 4338) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
                ////////////
            } else if (part1.equals("B") && check >= 4339 && check <= 4430) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("418");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4431 && check <= 4522) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("419");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4523 && check <= 4584) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("420");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4585 && check <= 4676) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("423");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4677 && check <= 4779) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("424");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4780 && check <= 4841) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4842 && check <= 4903) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("507");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4904 && check <= 4965) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("508");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 4966 && check <= 5027) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("511");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 5028 && check <= 5119) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("512");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 5120 && check <= 5181) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("513(A)");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 5182 && check <= 5273) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("514");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 5274 && check <= 5406) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("517");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            }
            else if (part1.equals("B") && check >= 5407 && check <= 7306) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Fisheries Diploma Institute,Gopalganj(Near to Circuit House)");
                tvs_roomset.setText("Fisheries Diploma Institute,Gopalganj");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            }

            //Library(Location)
            else if (part1.equals("B") && check >= 7307 && check <= 7398) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Computer Browsing Lab");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 7399 && check <= 7523) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library Ground Open Space");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 7524 && check <= 7698) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library 1st Floor Reading Room");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            // University Cafeteria

            else if (part1.equals("B") && check >= 7699 && check <= 8208) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText(" University Cafeteria ,BSMRSTU");
                tvs_roomset.setText("Cafeteria");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            //University Garage BSMRSTU

            else if (part1.equals("B") && check >= 8209 && check <= 8928) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 1");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 8929 && check <= 9268) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 2");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9269 && check <= 9340) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 3");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9341 && check <= 9443) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 4");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9444 && check <= 9503) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 5");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            // Bangabandhu University School & College (Tin Shed 1: Near Library)
            else if (part1.equals("B") && check >= 9504 && check <= 9595) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9596 && check <= 9687) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9688 && check <= 9779) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9780 && check <= 9851) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9852 && check <= 9913) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            }

            // Bangabandhu University School & College (Tin Shed 2: Near Library)
            else if (part1.equals("B") && check >= 9914 && check <= 9995) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 9996 && check <= 10057) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10058 && check <= 10149) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10150  && check <= 10241) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            //Bangabandhu University School & College (Near VC`s Residence)

            else if (part1.equals("B") && check >= 10242 && check <= 10446) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("Hall Room");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10447 && check <= 10538) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10539 && check <= 10630) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10631 && check <= 10672) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10673  && check <= 10714) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10715 && check <= 10756) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10757 && check <= 10798) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10799 && check <= 10840) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10841 && check <= 10882) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10883  && check <= 10924) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10925  && check <= 10966) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("110");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 10967 && check <= 11008) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("111");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11009 && check <= 11100) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("112");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11101 && check <= 11192) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("113");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11193  && check <= 11284) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("114");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }




            //Sheikh Hasina Govt. Girls High School, Gopalganj
            else if (part1.equals("B") && check >= 11285 && check <= 11414) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11415 && check <= 11481) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("201");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11482  && check <= 11548) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("202");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11549 && check <= 11615) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("203");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11616  && check <= 11682) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("204");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11683 && check <= 11749) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("205");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >=11750  && check <= 11816) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("301");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11817  && check <= 11883) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("302");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 11884 && check <= 11950) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("303");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >=11951 && check <= 12017) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("304");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 12018 && check <= 12131) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("305");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 12132  && check <= 12198) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("401");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 12199  && check <= 12265) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("402");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");

            } else if (part1.equals("B") && check >= 12266 && check <= 12332) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("403");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            else if (part1.equals("B") && check >= 12333 && check <= 12399) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("404");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            else if (part1.equals("B") && check >= 12400  && check <= 12466) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("405");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            else if (part1.equals("B") && check >= 12467 && check <= 12533) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("406");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }

            else if (part1.equals("B") && check >= 12534 && check <= 12600) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("407");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }



            //Center: Wahab Adorsho High School
            else if (part1.equals("B") && check >= 12601  && check <= 12657) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 12658  && check <= 12714) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 12715 && check <= 12771) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 12772 && check <= 12840) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 12841 && check <= 12909) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 12910  && check <= 12978) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            } else if (part1.equals("B") && check >= 12979 && check <= 13493) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("B");
                tvs_LocationSEt.setText("Wahab Adorsho High School");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(01.00PM-02.00PM)");
            }



            //Center--->>>BSMRSTU (Unit I)---->>>>
            // Here the Seat plan of I unit---->>>>>
            //------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>2019


            //Academic Building ----------->>>>>>>I Unit

            else if (part1.equals("I") && check >= 00001 && check <= 105) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("113");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 106 && check <= 155) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("115");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 156 && check <= 235) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("116");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 236 && check <= 285) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("117");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");
            } else if (part1.equals("I") && check >= 286 && check <= 335) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("118");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 336 && check <= 385) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("221");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 386 && check <= 435) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("224");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 436 && check <= 485) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("225");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 486 && check <= 550) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("321");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 551 && check <= 618) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("326");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 619 && check <= 681) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 682 && check <= 753) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 754 && check <= 795) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("418");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 796 && check <= 830) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("419");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 831 && check <= 868) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("420");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 869 && check <= 933) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("423");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");

            } else if (part1.equals("I") && check >= 935 && check <= 1000) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("I");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("424");
                tvs_dateset.setText("09.11.19(10.00AM-11.30AM)");
            }

            //Seat Plan of H Unit -------------->>>>>>>>>>>>>>>>>>>>>
            //BSMRSTU SEAT PLAN OF H UNIT
            //2019-20 ADMISSION TEST

            else if (part1.equals("H") && check >= 00001 && check <= 168) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Bank Varanda (Ground floor)");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 169 && check <= 336) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Faculty Varanda (Ground floor)");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 337 && check <= 418) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("303");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 419 && check <= 470) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 471 && check <= 552) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("403");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 553 && check <= 604) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 605 && check <= 676) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 677 && check <= 708) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 709 && check <= 760) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("416");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 761 && check <= 832) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("503");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 833 && check <= 879) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("504");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 880 && check <= 926) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 927 && check <= 1008) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("513");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 1009 && check <= 1055) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("516");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");
            }

            else if (part1.equals("H") && check >= 1056 && check <= 1208) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("Varanda (Ground floor), infront of Pharmacy Lab");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 1209 && check <= 1300) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");
                ;

            } else if (part1.equals("H") && check >= 1301 && check <= 1392) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 1393 && check <= 1597) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("113");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");
            }


            else if (part1.equals("H") && check >= 1598 && check <= 1722) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("114");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 1723 && check <= 1835) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("115");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 1836 && check <= 1988) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("116");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 1989 && check <= 2091) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("117");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2092 && check <= 2194) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("118");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2195 && check <= 2241) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("201");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2242 && check <= 2328) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("202");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2329 && check <= 2415) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("203");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2416 && check <= 2472) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("205");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2473 && check <= 2519) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("209");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2520 && check <= 2581) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("213");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2582 && check <= 2643) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("217");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2644 && check <= 2705) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("218");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2706 && check <= 2767) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("219");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2768 && check <= 2870) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("221");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2871 && check <= 2973) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("224");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 2974 && check <= 3076) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("225");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3077 && check <= 3113) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("302");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3114 && check <= 3235) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("307");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3236 && check <= 3302) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3303 && check <= 3394) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("312");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3395 && check <= 3456) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("314");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3457 && check <= 3518) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("315");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3519 && check <= 3580) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("319");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3581 && check <= 3642) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("320");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3643 && check <= 3745) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("321");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3746 && check <= 3807) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("322");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3808 && check <= 3911) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("326");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3912 && check <= 3968) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("401(B)");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 3969 && check <= 4030) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("407(B)");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4031 && check <= 4133) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4134 && check <= 4236) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4237 && check <= 4339) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4340 && check <= 4431) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("418");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4432 && check <= 4523) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("419");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4524 && check <= 4585) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("420");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4586 && check <= 4677) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("423");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4678 && check <= 4780) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("424");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4781 && check <= 4842) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4843 && check <= 4904) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("507");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4905 && check <= 4966) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("508");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 4967 && check <= 5028) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("511");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 5029 && check <= 5120) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("512");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 5121 && check <= 5182) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("513(A)");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 5183 && check <= 5274) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("514");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 5275 && check <= 5407) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("517");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 5408 && check <= 7307) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("Academic Building Ground Space");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            }
            //Library(Location)
            else if (part1.equals("H") && check >= 7308 && check <= 7399) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Computer Browsing Lab");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 7400 && check <= 7524) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library Ground Open Space");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 7525 && check <= 7699) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library 1st Floor Reading Room");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");
            }

            // University Cafeteria

            else if (part1.equals("H") && check >= 7700 && check <= 8209) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText(" University Cafeteria ,BSMRSTU");
                tvs_roomset.setText("Cafeteria");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");
            }

            //University Garage BSMRSTU

            else if (part1.equals("H") && check >= 8210 && check <= 8929) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 1");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 8930 && check <= 9439) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 2");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("H") && check >= 9440 && check <= 9498) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("H");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 3");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            }

            //Seat Plan of C Unit------>>>BSMRSTU
            //2019

            else if (part1.equals("C") && check >= 00001 && check <= 168) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Bank Varanda (Ground floor)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 169 && check <= 336) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Faculty Varanda (Ground floor)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 337 && check <= 418) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("303");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 419  && check <= 470) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 471 && check <= 552) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("403");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 553 && check <= 604) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 605   && check <= 676) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 677 && check <= 708) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 709 && check <= 760) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("416");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 761 && check <= 832) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("503");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 833 && check <= 879) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("504");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }
            else if (part1.equals("C") && check >= 880 && check <= 926) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }
            else if (part1.equals("C") && check >= 927 && check <= 1008) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("513");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }
            else if (part1.equals("C") && check >= 1009 && check <= 1055) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("516");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }




            //Academic Building ----------->>>>>>>c Unit

            else if (part1.equals("C") && check >= 1056 && check <= 1209) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("Varanda (Ground floor), infront of Pharmacy Lab");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 1210 && check <= 1301) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");


            } else if (part1.equals("C") && check >= 1302 && check <= 1393) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 1394 && check <= 1598) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("113");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }

            else if (part1.equals("C") && check >= 1599 && check <= 1723) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("114");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 1724 && check <= 1836) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("115");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 1837 && check <= 1989) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("116");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 1990 && check <= 2093) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("117");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2094 && check <= 2196) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("118");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2197 && check <= 2243) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("201");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2244 && check <= 2331) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("202");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2332 && check <= 2418) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("203");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2419 && check <= 2475) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("205");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2476 && check <= 2522) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("209");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2523 && check <= 2584) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("213");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2585 && check <= 2646) {
                tvs_setRoll.setText(value);
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("217");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2647 && check <= 2708) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("218");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2709 && check <= 2770) {
                tvs_setRoll.setText(value);
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("219");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2771 && check <= 2873) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("221");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2874 && check <= 2976) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("224");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 2977 && check <= 3079) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("225");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3080 && check <= 3116) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("302");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3117 && check <= 3238) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("307");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3239 && check <= 3305) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3306 && check <= 3397) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("312");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3398 && check <= 3459) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("314");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3460 && check <= 3521) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("315");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3522 && check <= 3583) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("319");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3584 && check <= 3645) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("320");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3646 && check <= 3748) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("321");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3749 && check <= 3810) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("322");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3811 && check <= 3913) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("326");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 3914 && check <= 3970) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("401(B)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
                //
            } else if (part1.equals("C") && check >= 3971 && check <= 4032) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("407(B)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4033 && check <= 4135) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4136 && check <= 4238) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4239 && check <= 4341) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4342 && check <= 4433) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("418");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4434 && check <= 4525) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("419");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4526 && check <= 4587) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("420");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4588 && check <= 4679) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("423");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4680 && check <= 4782) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("424");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4783 && check <= 4844) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4845 && check <= 4906) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("507");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4907 && check <= 4968) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("508");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 4969 && check <= 5030) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("511");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 5031 && check <= 5122) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("512");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 5123 && check <= 5184) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("513(A)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 5185 && check <= 5276) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("514");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 5277 && check <= 5409) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("517");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 5410 && check <= 7309) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("Academic Building Ground Space");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //C Unit -------->>>>>>>Location :  Library
            else if (part1.equals("C") && check >= 7310&& check <= 7401) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Computer Browsing Lab");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 7402 && check <= 7526) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library Ground Open Space");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 7527 && check <= 7701) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library 1st Floor Reading Room");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            // University Cafeteria

            else if (part1.equals("C") && check >= 7702 && check <= 8211) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" University Cafeteria ,BSMRSTU");
                tvs_roomset.setText("Cafeteria");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //University Garage BSMRSTU

            else if (part1.equals("C") && check >= 8212 && check <= 8931) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 1");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 8932 && check <= 9271) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 2");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9272 && check <= 9343) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 3");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9344 && check <= 9446) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 4");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9447 && check <= 9506) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 5");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            // Bangabandhu University School & College (Tin Shed 1: Near Library)
            else if (part1.equals("C") && check >= 9507 && check <= 9598) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("101");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9599 && check <= 9690) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("102");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9691 && check <= 9782) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9783 && check <= 9854) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9855 && check <= 9916) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("105");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            // Bangabandhu University School & College (Tin Shed 2: Near Library)
            else if (part1.equals("C") && check >= 9917 && check <= 9998){
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("106");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 9999 && check <= 10060) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("107");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10061 && check <= 10152) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("108");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10153 && check <= 10244) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //Bangabandhu University School & College (Near VC`s Residence)

            else if (part1.equals("C") && check >= 10245 && check <= 10449) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("Hall Room");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10450 && check <= 10541) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("101");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10542 && check <= 10633) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("102");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10634 && check <= 10675) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("103");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10676 && check <= 10717) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("104");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10718 && check <= 10759) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("105");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10760 && check <= 10801) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("106");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10802 && check <= 10843) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("107");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10844 && check <= 10885) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("108");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10886 && check <= 10927) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10928 && check <= 10969) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("110");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 10970 && check <= 11011) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("111");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 11012 && check <= 11103) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("112");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 11104 && check <= 11195) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("113");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 11196  && check <= 11287) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("114");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //Govt.Bangabandhu College , Gopalganj

            else if (part1.equals("C") && check >= 11288 && check <= 11459) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("1001");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 11460  && check <= 11631) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("1002");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 11632 && check <= 11732) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("2001");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 11733  && check <= 11833) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("2002");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 11834 && check <= 11929) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("2003");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 11930 && check <=12022) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("2004");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 12023 && check <= 12115) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("3001");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 12116  && check <=12192) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("3004");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 12193 && check <=12255) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("4001");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 12256 && check <=12306) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("4004");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=12307 && check <=12497) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("5001");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 12498 && check <= 12588) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("102");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 12589 && check <= 12651) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("104");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=12652 && check <=12742) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("105");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=12743 && check <=12815) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("106");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=12816 && check <=12911) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("202");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=12912 && check <=12975) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("203");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=12976 && check <=13067) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("205");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=13068 && check <=13159) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("206");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=13160 && check <=13225) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("302");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=13226 && check <=13331) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("303");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=13332 && check <=13420) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("305");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 13421 && check <=13513) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("306");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 13514 && check <= 13579) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("402");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 13580 && check <= 13708) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("403");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 13709 && check <= 13800) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("405");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >=13801 && check <=13892) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("406");
                tvs_dateset.setText("08.11.19(03.00PM-04.00PM)");

            } else if (part1.equals("C") && check >=13893 && check <=13972) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Govt. Bangabandhu College,Gopalganj");
                tvs_roomset.setText("Seminar of History");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //Sheikh Hasina Govt. Girls High School ,Gopalganj------>>>>>>C Unit

            else if (part1.equals("C") && check >= 13973 && check <=14102) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("104");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14103  && check <= 14169) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("201");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14170 && check <= 14236) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("202");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14237 && check <= 14303) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("203");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14304 && check <= 14370) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("204");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14371 && check <= 14437) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("205");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14438  && check <= 14504) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("301");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14505 && check <= 14571) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("302");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14572  && check <= 14638) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("303");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14639 && check <= 14705) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("304");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14706  && check <= 14819) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("305");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >= 14820 && check <=14886) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("401");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=14887 && check <=14953) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("402");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            } else if (part1.equals("C") && check >= 14954 && check <=15020) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("403");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }


            else if (part1.equals("C") && check >= 15021 && check <= 15087) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("404");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }

            else if (part1.equals("C") && check >= 15088 && check <= 15154) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("405");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }

            else if (part1.equals("C") && check >= 15155 && check <= 15221) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("406");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }

            else if (part1.equals("C") && check >=15222  && check <=15288) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("407");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");

            }

            //Center: Sarnakoli High School, Gopalganj

            else if (part1.equals("C") && check >= 15289  && check <=15339) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Tin Shed Building,Room-01");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15340 && check <= 15382) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Tin Shed Building,Room-02");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15383 && check <= 15425) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Tin Shed Building,Room-03");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >=15426 && check <= 15464) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-106");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15465 && check <= 15503) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-201");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15504 && check <= 15542) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-202");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15543 && check <= 15581) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-203");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15582 && check <= 15620) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-301");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >=15621  && check <=15659) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-302");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15660 && check <= 15726) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-303");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 15727 && check <=15765) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-304");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15766 && check <= 15804) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-305");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15805 && check <= 15839) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-2, Room-101");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15840 && check <= 15874) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-2, Room-102");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 15875 && check <= 15909) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-2, Room-103");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 15910 && check <= 15944) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-3, Room-101");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 15945 && check <= 15979) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-3, Room-102");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 15980 && check <= 16065) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Hall Room");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //Center: Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj
            else if (part1.equals("C") && check >= 16066 && check <= 16161) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Admin Building- 401 (4th Floor)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 16162 && check <= 16257) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Admin Building- 403 (4th Floor)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 16258 && check <= 16375) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Science Building, room-105");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 16376 && check <= 16461) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Science Building, room-305");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 16462 && check <= 16525) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Science Building, room-308");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16526 && check <= 16611) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Science Building, room-404");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16612 && check <= 16697) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Science Building, room-407");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16698 && check <= 16757) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Arts Building, room-111");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16758 && check <= 16817) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Arts Building, room-112");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16818 && check <= 16879) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Arts Building, room-113");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16880 && check <= 16941) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Arts Building, room-114");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 16942 && check <= 16985) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-108");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 16986 && check <= 17029) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Arts Building, room-114");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17030 && check <= 17073) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-209");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17074  && check <= 17117) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-210");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17118 && check <= 17161) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-309");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17162 && check <= 17205) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-310");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17206 && check <= 17249) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-408");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17250 && check <= 17293) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-409");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >= 17294 && check <= 17388) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj");
                tvs_roomset.setText("Honours Building, room-501");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }



            //Center: Jugoshikha Girls School

            else if (part1.equals("C") && check >= 17389  && check <=17451) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 01");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 17452 && check <=17514) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 02");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 17515 && check <=17577) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 03");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 17578 && check <=17640) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 04");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 17641 && check <=17703) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 05");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=17704 && check <=17766) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 06");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=17767 && check <=17829) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 07");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=17830 && check <=17906) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 08");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 17907  && check <=17983) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 09");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >= 17984 && check <=18060) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 10");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18061 && check <=18172) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 11");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            //Center: Hazi Lal Mia City College, Gopalganj

            else if (part1.equals("C") && check >=18173 && check <=18255) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("06(Luthfor Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }


            else if (part1.equals("C") && check >=18256 && check <=18335) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("07 (Luthfor Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18336  && check <=18462) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("08 (Luthfor Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18463  && check <=18526) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("09(Sabura Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18527 && check <=18656) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("10(Sabura Rahman Bhaban))");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18657 && check <=18720) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("20 (Elias Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18721 && check <=18756) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("21 (Elias Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18757 && check <=18817) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("204 (Sobura Rahman Bhabon)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18818 && check <=18959) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("205 (Sabura Rahman Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=18960 && check <=19021) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("207 (Polu Mia Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=19022 && check <=19113) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("208 (Polu Mia Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=19114 && check <=19177) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("304 (Sabura Rahman Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=19178 && check <=19241) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("305 (Sabura Rahman Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=19242 && check <=19336) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("306 (Polu Mia Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=19337  && check <=19484) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("Multimedia Room (Elias Rahman Bhaban");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }


            else if (part1.equals("C") && check >=19485 && check <=19634) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("16 (Banijya Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
//
            else if (part1.equals("C") && check >=19635 && check <=19792) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("17 (BanijyaBhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >=19793 && check <=19867) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("18 (Banijya Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >=19868 && check <=19948) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("19 (Banijya Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            else if (part1.equals("C") && check >=19949 && check <=20125) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("Hall Room (Polu Mia Bhaban)");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20126 && check <=20191) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("108");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20126 && check <=20191) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("108");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20192 && check <=20242) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("111");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20243 && check <=20325) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("112");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20326 && check <=20381) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("121");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20382 && check <=20440) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("122");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20441 && check <=20504) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("201");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20505 && check <=20568) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("202");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20569 && check <=20632) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("203");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20633 && check <=20683) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("204");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }

            else if (part1.equals("C") && check >=20684 && check <=20739) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("206");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }
            //
            else if (part1.equals("C") && check >=20740 && check <=20805) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("208");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=20806 && check <=20871) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("209");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=20872 && check <=20922) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("221");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=20923 && check <=20981) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("222");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=20982 && check <=21138) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("321");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=21140 && check <=21343) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("322");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            } else if (part1.equals("C") && check >=21344 && check <=21498) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("C");
                tvs_LocationSEt.setText("Binapani Govt.Girls High School,Gopalganj");
                tvs_roomset.setText("421");
                tvs_dateset.setText("08.11.19(10.00AM-11.00AM)");
            }


       //Center--->>>BSMRSTU (Unit A)---->>>>
            // Here the Seat plan of A unit---->>>>>


            else  if (part1.equals("A") && check >= 00001 && check <= 168) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Bank Varanda (Ground floor)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 169 && check <= 337) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Faculty Varanda (Ground floor)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 338 && check <= 419) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("303");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 420  && check <= 471) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 472 && check <= 553) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("403");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 554 && check <= 605) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 606   && check <= 677) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 678 && check <= 710) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 711 && check <= 762) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("416");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 763 && check <= 835) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("503");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 836 && check <= 882) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("504");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >= 883 && check <= 929) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >= 930 && check <= 1011) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("513");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >= 1012 && check <= 1058) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("516");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >= 1059 && check <= 1248) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Administrative Building,BSMRSTU");
                tvs_roomset.setText("Admin Building Annex1");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }


            //Academic Building ----------->>>>>>>A Unit

            else if (part1.equals("A") && check >= 1249 && check <= 1401) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("Varanda (Ground floor), infront of Pharmacy Lab");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 1402 && check <= 1494) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");


            } else if (part1.equals("A") && check >= 1495 && check <= 1586) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 1587 && check <= 1792) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("113");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }

            else if (part1.equals("A") && check >= 1793 && check <= 1917) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("114");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >= 1918 && check <= 2030) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("115");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2031 && check <= 2183) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("116");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2184 && check <= 2286) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("117");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2287 && check <= 2389) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("118");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2390 && check <= 2436) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("201");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2437 && check <= 2523) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("202");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2524 && check <= 2610) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("203");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2611 && check <= 2667) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("205");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2668 && check <= 2714) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("209");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2715 && check <= 2776) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("213");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2777 && check <= 2838) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("217");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2839 && check <= 2900) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("218");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2901 && check <= 2962) {
                tvs_setRoll.setText(value);
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("219");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 2963 && check <= 3065) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("221");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3066 && check <= 3168) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("224");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3169 && check <= 3271) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("225");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3272 && check <= 3308) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("302");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3309 && check <= 3430) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("307");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3431 && check <= 3497) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("308");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3498&& check <= 3589) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("312");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3590 && check <= 3651) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("314");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3652 && check <= 3713) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("315");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3714 && check <= 3775) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("319");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3776 && check <= 3837) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("320");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3838 && check <= 3940) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("321");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 3941 && check <= 4002) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("322");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4003 && check <= 4105) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("326");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=4106&& check <= 4162) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("401(B)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
                //
            } else if (part1.equals("A") && check >= 4163 && check <= 4224) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("407(B)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4225 && check <= 4327) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("408");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4328 && check <= 4431) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("413");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4432 && check <= 4534) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("414");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4535 && check <= 4626) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("418");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4627 && check <= 4718) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("419");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4719 && check <= 4780) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("420");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4781 && check <=4872) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("423");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 4873&& check <= 4975){
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("424");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=4976 && check <= 5037) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("506");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 5038 && check <= 5099) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("507");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 5100 && check <= 5161) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("508");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 5162 && check <= 5223) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("511");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 5224 && check <= 5315) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("512");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 5316 && check <= 5377) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("513(A)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 5378 && check <= 5469) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("514");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=5470 && check <= 5602) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Academic Building,BSMRSTU");
                tvs_roomset.setText("517");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");





                //change the seat plan
            } else if (part1.equals("A") && check >= 5603 && check <= 7562) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Fisheries Diploma Institute,Gopalganj(Near to Circuit House)");
                tvs_roomset.setText("Fisheries Diploma Institute,Gopalganj");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //A Unit -------->>>>>>>Location :  Library
            else if (part1.equals("A") && check >= 7563 && check <= 7654) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Computer Browsing Lab");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 7655 && check <= 7779) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library Ground Open Space");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");;
            } else if (part1.equals("A") && check >= 7780 && check <= 7954) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Library,BSMRSTU");
                tvs_roomset.setText("Library 1st Floor Reading Room");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            // University Cafeteria

            else if (part1.equals("A") && check >= 7955&& check <=8464) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" University Cafeteria ,BSMRSTU");
                tvs_roomset.setText("Cafeteria");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //University Garage BSMRSTU

            else if (part1.equals("A") && check >= 8465 && check <= 9184) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 1");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 9185 && check <= 9524) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 2");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 9525 && check <= 9596) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 3");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 9597 && check <= 9699) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 4");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 9700 && check <= 9759) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("University Garage,BSMRSTU");
                tvs_roomset.setText("Garage 5");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            // Bangabandhu University School & College (Tin Shed 1: Near Library)
            else if (part1.equals("A") && check >= 9760 && check <= 9851) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 9852 && check <= 9943) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 9944 && check <= 10035) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=10036 && check <= 10107) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10108 && check <= 10199) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 1: Near Library),BSMRSTU");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            // Bangabandhu University School & College (Tin Shed 2: Near Library)
            else if (part1.equals("A") && check >=10200 && check <=10281) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10282 && check <=10343) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10344 && check <= 10435) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library),BSMRSTU");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10436 && check <= 10527) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Tin Shed 2: Near Library)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //Bangabandhu University School & College (Near VC`s Residence)

            else if (part1.equals("A") && check >= 10528 && check <= 10732) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("Hall Room");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10733 && check <= 10824) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10825 && check <= 10916) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10917 && check <= 10958) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 10959 && check <= 11000) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=11001 && check <=11042) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11043 && check <= 11084) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11085 && check <= 11126) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11127 && check <= 11168) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11169 && check <= 11210) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11211 && check <= 11252) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("110");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11253 && check <= 11294) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("111");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11295 && check <= 11386) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("112");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11387 && check <=11478) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("113");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11479  && check <= 11570) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Bangabandhu University School & College (Near VC`s Residence)");
                tvs_roomset.setText("114");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            //Sheikh Hasina Govt. Girls High School ,Gopalganj------>>>>>>A Unit

            else if (part1.equals("A") && check >= 11571 && check <= 11700) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11701  && check <= 11767) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("201");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11768 && check <= 11834) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("202");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11835 && check <= 11901) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("203");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11902 && check <= 11968) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("204");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 11969 && check <= 12035) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("205");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 12036 && check <= 12102) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("301");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 12103 && check <= 12169) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("302");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 12170 && check <= 12236) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("303");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 12237 && check <= 12303) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("304");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 12304 && check <= 12417) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("305");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=12418 && check <=12484) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("401");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >= 12485 && check <=12551) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("402");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            } else if (part1.equals("A") && check >=12552 && check <=12618) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("403");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }


            else if (part1.equals("A") && check >=12619  && check <=12685) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("404");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }

            else if (part1.equals("A") && check >=12686  && check <=12752) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("405");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }

            else if (part1.equals("A") && check >=12753  && check <=12819) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("406");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }

            else if (part1.equals("A") && check >=12820 && check <=12886) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" Sheikh Hasina Govt. Girls High School, Gopalganj ");
                tvs_roomset.setText("407");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
//Center: Sarnakoli High School, Gopalganj

            else if (part1.equals("A") && check >= 12887 && check <=12937) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Tin Shed Building,Room-01");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=12938 && check <=12980) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Tin Shed Building,Room-02");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=12981 && check <= 13023) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Tin Shed Building,Room-03");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13024  && check <=13062) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-106");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13063 && check <=13101) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-201");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13102  && check <= 13140) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-202");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13141 && check <= 13179) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-203");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13180 && check <= 13218) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-301");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13219  && check <=13257) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-302");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13258 && check <=13324) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-303");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13325  && check <=13363) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-304");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13364 && check <=13402) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-1, Room-305");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13403 && check <= 13437) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-2, Room-101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 13438 && check <= 13472) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-2, Room-102");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13473 && check <= 13507) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-2, Room-103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 13508 && check <= 13542) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-3, Room-101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 13543 && check <=13577) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Academic Building-3, Room-102");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=13578  && check <= 13663) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Sarnakoli High School, Gopalganj");
                tvs_roomset.setText("Hall Room");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //Center: Gopalganj Girls High School

            else if (part1.equals("A") && check >= 13664 && check <= 13742) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13743 && check <=13821) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13822 && check <= 13900) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 13901  && check <= 13939) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=13940 && check <=14018) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=14019 && check <=14057) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 14058 && check <= 14096) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >= 14097 && check <=14135) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("209");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14136 && check <= 14174) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Girls High School");
                tvs_roomset.setText("210");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //Center: Technical School and College, Gopalganj

            else if (part1.equals("A") && check >= 14175 && check <= 14228) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Administrative Building, Room-104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14229  && check <= 14292) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Administrative Building, Room-112");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            else if (part1.equals("A") && check >=14293 && check <=14356) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Administrative Building, Room-115");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            else if (part1.equals("A") && check >=14357 && check <=14410) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Administrative Building, Room-205");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            else if (part1.equals("A") && check >=14411 && check <=14496) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Administrative Building, Room-206");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            else if (part1.equals("A") && check >= 14497 && check <=14539) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Administrative Building, Room-208");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            else if (part1.equals("A") && check >=14540 && check <= 14603) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Diploma Building, Room-2001");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            else if (part1.equals("A") && check >= 14604  && check <= 14667) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Diploma Building, Room-2002");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14668 && check <= 14710) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Diploma Building, Room-3001");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14711  && check <=14753) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Diploma Building, Room-3002");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14754  && check <=14796) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Technical School and College, Gopalgan");
                tvs_roomset.setText("Diploma Building, Room-3003");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }


            //Center: Jugoshikha Girls School

            else if (part1.equals("A") && check >= 14797 && check <=14859) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 01");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14860 && check <=14922) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 02");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14923 && check <=14985) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 03");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 14986  && check <=15048) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 04");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 15049  && check <=15111) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 05");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15112 && check <=15174) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 06");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15175 && check <=15237) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 07");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15238 && check <=15314) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 08");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 15315 && check <=15391) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 09");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >= 15392  && check <=15468) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 10");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15469  && check <=15580) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Jugoshikha Girls School,Gopalganj");
                tvs_roomset.setText("Room 11");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //Center: Hazi Lal Mia City College, Gopalganj
            else if (part1.equals("A") && check >=15581 && check <=15663) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("06 (Luthfor Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=15664 && check <=15743) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("07 (Luthfor Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15744 && check <=15870) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("08 (Luthfor Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15871 && check <=15934) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("09(Sabura Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=15935 && check <=16064) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("10 (Sabura Rahman Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16065  && check <=16128) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("20(Elias Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16129  && check <=16164) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("21(Elias Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16165  && check <=16225) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("204(Sobura Rahman Bhabon)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16226 && check <=16367) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("205(Sabura Rahman Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16368 && check <=16429) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("207(Polu Mia Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16430  && check <=16521) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("208(Polu Mia Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16522  && check <=16585) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("304(Sabura Rahman Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16586 && check <=16649) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("305(Sabura Rahman Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16650 && check <=16744) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("306(Polu Mia Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16745  && check <=16892) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("Multimedia Room (Elias Rahman Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=16893  && check <=17042) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("16(Banijya Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
//
            else if (part1.equals("A") && check >=17043  && check <=17200) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("17(BanijyaBhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=17201 && check <=17275) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("18(Banijya Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=17276 && check <=17356) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("19(Banijya Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=17357 && check <=17533) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Hazi Lal Mia City College, Gopalganj");
                tvs_roomset.setText("Hall Room(Polu Mia Bhaban)");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            //Center: S.M. Model Govt. High School
            else if (part1.equals("A") && check >=17534 && check <=17610) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("01");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            //
            else if (part1.equals("A") && check >=17611 && check <=17687) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("02");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=17688 && check <=17764) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("03");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=17765  && check <=17831) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("04");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=17832 && check <=17922) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("05");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=17923 && check <=18013) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("07");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18014 && check <=18080) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("08");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18081 && check <=18171) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("09");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18172 && check <=18238) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("10");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18239 && check <=18319) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("11");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18320  && check <=18431) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("12");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18432 && check <=18527) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("13");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18528  && check <=18623) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("14");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            else if (part1.equals("A") && check >=18624  && check <=18719) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("15");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18720 && check <=18815) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("16");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=18816 && check <=18886) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("17");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }      else if (part1.equals("A") && check >=18887 && check <=18963) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("18");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }            else if (part1.equals("A") && check >=18964 && check <=19040) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("19");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }     else if (part1.equals("A") && check >=19041 && check <=19117) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText(" S.M. Model Govt. High School,Gopalganj");
                tvs_roomset.setText("20");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            //Binapani

            else if (part1.equals("A") && check >=19118 && check <=19183) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19184 && check <=19234) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("111");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19235  && check <=19317) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("112");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19318 && check <=19373) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("121");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19374 && check <=19432) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("122");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19433  && check <=19496) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("201");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19497 && check <=19560) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("202");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19561 && check <=19624) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("203");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19625 && check <=19675) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("204");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19676 && check <=19731) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("206");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");

            }
            else if (part1.equals("A") && check >=19732 && check <=19797) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("208");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=19798 && check <=19863) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("209");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=19864 && check <=19914) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("221");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=19915 && check <=19973) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("222");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=19974 && check <=20028) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("321");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=20029 && check <=20085) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("322");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=20086 && check <=20142) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Binapani Govt. Girls High School, Gopalganj");
                tvs_roomset.setText("421");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            //Center: Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)
            else if (part1.equals("A") && check >=20143 && check <=20198) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20199 && check <=20254) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20255 && check <=20310) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20311 && check <=20354) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20355 && check <=20398) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20399 && check <=20475) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20476  && check <=20521) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20522 && check <=20565) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20566  && check <=20611) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("109");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20612 && check <=20657) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("110");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20658 && check <=20703) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("111");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20704 && check <=20749) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("112");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            } else if (part1.equals("A") && check >=20750 && check <=20795) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)");
                tvs_roomset.setText("213");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

           // Center: Salehia Kamil Madrasah (Alia Madrasah)
            else if (part1.equals("A") && check >=20796 && check <=20856) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("01");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=20857 && check <=20878) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("02");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=20879  && check <=20900) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("03");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=20901 && check <=20957) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("04");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=20958  && check <=21003) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("05");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21004 && check <=21042) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("06");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21043 && check <=21075) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("07");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21076 && check <=21108) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("08");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21109 && check <=21147) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("09");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21148 && check <=21186) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("10");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21187 && check <=21256) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("11");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21257 && check <=21285) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("12");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21286 && check <=21314) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("13");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21315 && check <=21343) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Salehia Kamil Madrasah (Alia Madrasah)");
                tvs_roomset.setText("14");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            // Wahab Adorsho High School

            else if (part1.equals("A") && check >=21344 && check <=21400) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("101");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21401 && check <=21457) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("102");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21458 && check <=21514) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("103");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21515 && check <=21583) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("104");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21584 && check <=21652) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("105");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21653 && check <=21721) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("106");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21722 && check <=21776) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("107");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21777 && check <=21803) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("108");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21804 && check <=21830) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("109");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21831 && check <=21927) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Wahab Adorsho High School ");
                tvs_roomset.setText("201");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }

            // Notun High School, Mohammad Para
            else if (part1.equals("A") && check >=21928  && check <=21981) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Notun High School, Mohammad Para");
                tvs_roomset.setText("1");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=21982  && check <=22046) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Notun High School, Mohammad Para");
                tvs_roomset.setText("2");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=22047  && check <=22127) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Notun High School, Mohammad Para");
                tvs_roomset.setText("3");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=22130  && check <=22276) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Notun High School, Mohammad Para");
                tvs_roomset.setText("4");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=22277  && check <=22339) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Notun High School, Mohammad Para");
                tvs_roomset.setText("5");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }
            else if (part1.equals("A") && check >=22340  && check <=22500) {
                tvs_setRoll.setText(value);
                tvs_unitset.setText("A");
                tvs_LocationSEt.setText("Notun High School, Mohammad Para");
                tvs_roomset.setText("6");
                tvs_dateset.setText("09.11.19(03.30PM-04.30PM)");
            }



        }
    }
}
