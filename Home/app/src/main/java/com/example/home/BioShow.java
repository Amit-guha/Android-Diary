package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class BioShow extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Addition> uploadList;
    DatabaseReference databaseReference;
    private  ImageAdapter imageAdapter;
    private FirebaseStorage firebaseStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_show);

     //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      // getSupportActionBar().hide();
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
               // WindowManager.LayoutParams.FLAG_FULLSCREEN);


        recyclerView= (RecyclerView) findViewById(R.id.Recy_Bioshow);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Bundle bundle=getIntent().getExtras();///get the privious activity key
        String amit=bundle.getString("Faculty");


        uploadList=new ArrayList<>();
        firebaseStorage=FirebaseStorage.getInstance();
        databaseReference= FirebaseDatabase.getInstance().getReference().child(amit);
        databaseReference.keepSynced(true);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                uploadList.clear();
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                    //String commentkey=dataSnapshot1.getKey();
                    Addition addition=dataSnapshot1.getValue(Addition.class);
                    addition.setKey(dataSnapshot1.getKey());//using datasnapshot1 to get the real key
                    uploadList.add(addition);
                }
                imageAdapter=new ImageAdapter(BioShow.this,uploadList);
                recyclerView.setAdapter(imageAdapter);

                imageAdapter.setOnItemClickLisitiner(new ImageAdapter.OnItemClickLisitiner() {
                    @Override
                    public void OnitemClick(int position) {
                        Addition SelectedItem=uploadList.get(position);//to get the selecteditem position
                        String text=SelectedItem.getKey();//to get the selecteditem key
                        String word=SelectedItem.getmName();//to find my department name
                        //  Toast.makeText(Department_Show.this, text+"  "+word, Toast.LENGTH_SHORT).show();

                        // Intent intent=new Intent(Department_Show.this,TeacherPanel.class);
                        Intent intent=new Intent(BioShow.this,Details.class);
                        intent.putExtra("Selectedkey",text);
                        intent.putExtra("department",word);
                        startActivity(intent);
                    }

                    @Override
                    public void delete(int position) {
                        Addition SelectedItem=uploadList.get(position);//to get the selecteditem position
                        final String key=SelectedItem.getKey();//to get the selecteditem key
                        StorageReference storageReference=firebaseStorage.getReferenceFromUrl(SelectedItem.getmImageUrl());
                        storageReference.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                databaseReference.child(key).removeValue();
                                Toast.makeText(BioShow.this, "Delete Succesfully", Toast.LENGTH_SHORT).show();
                                // Toast.makeText(Department_Show.this, ""+key, Toast.LENGTH_SHORT).show();

                            }
                        });



                    }

                  /*  @Override
                    public void Update(int position) {

                    }*/
                });


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }



}

