package com.example.admissiontest2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Button Submit;
    private EditText Et_Roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //show the up button

        //remove the

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//add toolbar
        Toolbar toolbar = findViewById(R.id.toolabr);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Admission Test 2019-20");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Et_Roll = findViewById(R.id.Et_Roll);
        Submit = findViewById(R.id.btn_submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = Et_Roll.getText().toString();

            /*    Pattern regrex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");

                Pattern P = Pattern.compile("^\\p{Punct}|\\p{Punct}$");

                Pattern lowercase = Pattern.compile("[a-z]+");
                Matcher m = lowercase.matcher(data);

                Pattern sensitive = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);




                if (regrex.matcher(data).find()) {
                    Toast.makeText(MainActivity.this, "Wrong input", Toast.LENGTH_SHORT).show();
                } else if (sensitive.matcher(data).find()) {
                    Toast.makeText(MainActivity.this, "Case Sensitive" + data, Toast.LENGTH_SHORT).show();
                } else if (P.matcher(data).find()) {
                    Toast.makeText(MainActivity.this, "Last add", Toast.LENGTH_SHORT).show();
                } else if (data.contains(" ")) {
                    Toast.makeText(MainActivity.this, "Blank Space", Toast.LENGTH_SHORT).show();
                } else if (data.length() == 1) {
                    Toast.makeText(MainActivity.this, "ONly one character", Toast.LENGTH_SHORT).show();
                } else if (m.matches()) {
                    Toast.makeText(MainActivity.this, "Lowercase = " + data, Toast.LENGTH_SHORT).show();


                } else  {

             */

                if(Pattern.compile("([A-Z]+[0-9]{5})").matcher(data).find()){
                    String[] split = data.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
                    String part1 = split[0];
                    String part2 = split[1];

                    int check = Integer.parseInt(part2);

                    if ((part1.equals("A") && check >= 1 && check <= 1248) || (part1.equals("C") && check >= 1 && check <= 1055)
                    || (part1.equals("H") && check >= 1 && check <= 1055) || (part1.equals("B") && check >= 1 && check <= 1055) ) {

                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);//administrative building
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    else if ((part1.equals("A") && check >= 1249 && check <= 5602) || (part1.equals("C") && check >= 1056 && check <= 7309)
                    || (part1.equals("H") && check >= 1056 && check <= 7307) ||(part1.equals("B") && check >= 1056 && check <= 5406)
                    ||(part1.equals("I") && check >= 1 && check <= 1000)  ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);//Academic building
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //change the seat plan
                    else if(part1.equals("A") && check>=5603 && check<=7562){
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);//Fishererish diploma institute
                    }

                    //change the seat plan
                    else if(part1.equals("B") && check>=5407 && check<=7306){
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);//Fishererish diploma institute
                    }

                    else if ((part1.equals("A") && check >= 7563  && check <= 7954) ||( part1.equals("C") && check >= 7310  && check <= 7701)
                    || (part1.equals("H") && check >=7308   && check <= 7699) || (part1.equals("B") && check >= 7307  && check <= 7698)) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);//LIBRARY
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    else if ((part1.equals("A") && check >= 7955  && check <= 8464) || (part1.equals("C") && check >= 7702  && check <= 8211)
                    || (part1.equals("H") && check >= 7700  && check <= 8209) ||  (part1.equals("B") && check >= 7699  && check <= 8208) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);//CAFETERIA
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    else if ((part1.equals("A") && check >= 8465 && check <= 9759) || (part1.equals("C") && check >= 8212   && check <= 9506)
                    || (part1.equals("H") && check >= 8210   && check <= 9498) || (part1.equals("B") && check >= 8209    && check <= 9503) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);// University Garage
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    else if ((part1.equals("A") && check >= 9760 && check <= 10199) ||(part1.equals("C") && check >= 9507   && check <= 9916)
                    || (part1.equals("B") && check >= 9504   && check <= 9913) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    else if ((part1.equals("A") && check >= 10200 && check <= 10527)||(part1.equals("C") && check >= 9917   && check <= 10244)
                    || (part1.equals("B") && check >= 9914  && check <= 10241) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    else if ((part1.equals("A") && check >= 10528  && check <= 11570) || (part1.equals("C") && check >=10245 && check <=11287)
                    || (part1.equals("B") && check >=10242 && check <=11284)) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);//vc residence
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //  Govt. Bangabandhu College, Gopalganj
                    else if (part1.equals("C") && check >= 11288 && check <= 13972) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    // Sheikh Hasina Govt. Girls High School, Gopalganj
                    else if ((part1.equals("A") && check >= 11571 && check <= 12886) ||(part1.equals("C") && check >=13973 && check <=15288)
                     || (part1.equals("B") && check >=11285 && check <=12600) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }
                    //: Sarnakoli High School, Gopalganj
                    else if ((part1.equals("A") && check >= 12887 && check <= 13663) ||(part1.equals("C") && check >=15289 && check <=16065)) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }
                    //Center: Sheikh Fazilatun-nesa Govt. Mohila College, Gopalganj
                    else if (part1.equals("C") && check >= 16066 && check <= 17388) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }
                    //Center: Gopalganj Girls High School
                    else if (part1.equals("A") && check >= 13664 && check <= 14174) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }
                    // Technical School and College, Gopalganj

                    else if (part1.equals("A") && check >= 14175 && check <= 14796) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //Center: Jugoshikha Girls School
                    else if ((part1.equals("A") && check >= 14797  && check <= 15580) || (part1.equals("C") && check >= 17389 && check <= 18172)) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //Center: Hazi Lal Mia City College, Gopalganj
                    else if ((part1.equals("A") && check >= 15581  && check <= 17533) ||(part1.equals("C") && check >= 18173  && check <= 20125) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //Center: S.M. Model Govt. High School
                    else if (part1.equals("A") && check >= 17534  && check <= 19117) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //Center: Binapani Govt. Girls High School, Gopalganj
                    else if ((part1.equals("A") && check >= 19118  && check <= 20142) || (part1.equals("C") && check >= 20126 && check <= 21498) ) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //Center: Gopalganj Mohila Kamil Model Madrasah (Mohila Madrasah)
                    else if (part1.equals("A") && check >= 20143  && check <= 20795) {
                        // tv_RollSet.setText(data);
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    //Center: Salehia Kamil Madrasah (Alia Madrasah) Room No Roll
                    else if (part1.equals("A") && check >= 20796  && check <= 21343) {
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }

                    // Wahab Adorsho High School
                    else if ((part1.equals("A") && check >= 21344  && check <= 21927) || (part1.equals("B") && check >= 12601  && check <= 13493)) {
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                       // Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }
                    // : Notun High School, Mohammad Para
                    else if (part1.equals("A") && check >= 21928  && check <= 22500) {
                        Intent intent = new Intent(MainActivity.this, Seat_Plan.class);
                        intent.putExtra("E1", data);
                        startActivity(intent);
                        //Toast.makeText(MainActivity.this, "" + data, Toast.LENGTH_SHORT).show();
                    }


                    else{
                        Toast.makeText(MainActivity.this, "Wrong Number!", Toast.LENGTH_SHORT).show();
                    }

                }

                else{
                    Toast.makeText(MainActivity.this, "Please Enter your Correct Roll Number", Toast.LENGTH_SHORT).show();
                }

        }
    });

}
}
