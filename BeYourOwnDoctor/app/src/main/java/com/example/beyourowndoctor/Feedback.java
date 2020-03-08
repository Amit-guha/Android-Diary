package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity implements View.OnClickListener {
    private EditText Et_name,Et_Feedback;
    private Button btnSend,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setTitle("Feedback");
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        Et_name=findViewById(R.id.Et_Name);
        Et_Feedback=findViewById(R.id.Et_Feedback);

        btnSend=findViewById(R.id.btn_send);
        btnClear=findViewById(R.id.btn_clear);

        btnSend.setOnClickListener(this);
        btnClear.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String msg=Et_Feedback.getText().toString().trim();
        String name=Et_name.getText().toString().trim();

        if(view.getId()==R.id.btn_send){

            //check for null
            if(TextUtils.isEmpty(msg)){
                Et_Feedback.setError("This item name can not be empty.");
                return;

            }

           if(TextUtils.isEmpty(name)){
                Et_name.setError("This item name can not be empty.");
                return;

            }

           //send data
           else {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"amitguho95@gmail.com", "niloy17720@gmail.com", "iamavijit44@gmail.com", "minhazul.hasan.sohan@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback From Be Your Own Doctor");
                intent.putExtra(Intent.EXTRA_TEXT, "Name : " + name + "\nMessage : " + msg);
                startActivity(Intent.createChooser(intent, "Feedback With"));


            }
        }
        else if(view.getId()==R.id.btn_clear){
            Et_Feedback.setText(" ");
            Et_name.setText(" ");

        }

    }
}
