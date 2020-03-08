package com.example.admissiontest2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.regex.Pattern;

public class Edit_text extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private EditText editText;
    private TextView textView;
    private Button btn;

    private DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;




   // private String blockCharacterSet = "~#^|$%&*!HIJKLMOPTWXYZ";


  /*  private InputFilter filter = new InputFilter() {

        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

            if (source != null && blockCharacterSet.contains(("" + source))) {
                return "";
            }
            return null;
        }
    };

   */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        drawerLayout=findViewById(R.id.draw_id);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(drawerToggle);

        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* btn=findViewById(R.id.butn);

        editText = findViewById(R.id.Et_char);
        textView=findViewById(R.id.tv_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=editText.getText().toString();

            /*    char [] ch= input.toCharArray();

                for(int i=1;i<ch.length-1;i++){
                    char s=input.charAt(i);
                    if(s>="A" )

                }
                boolean character=Character.isDigit(input.charAt(1));

                if(input.startsWith("D") && character==true ){

             */
         /*   if(Pattern.compile("([A-Z]+[0-9]{5})").matcher(input).find()){

                    String[] split = input.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");

                    String part1 = split[0];

                    String part2 = split[1];
                    int check = Integer.parseInt(part2);

                    if(part1.equals("D") && (check>=00001 && check<=00100)){
                        textView.setText(input);
                    }

                    else{
                        Toast.makeText(Edit_text.this, "Is that a input", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Edit_text.this, "Please enter your right corrector", Toast.LENGTH_SHORT).show();
                }

            }



        });
       // editText.setFilters(new InputFilter[] { filter });
 */
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
            intent=new Intent(Edit_text.this,Interface_First.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.web_draw){
            intent=new Intent(Edit_text.this,Website.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.draw_about){
            Toast.makeText(this, "This is Amit", Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}
