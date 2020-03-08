package com.example.tolet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
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

public class Upload_city_show_button extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private List<House> houseList;
    DatabaseReference databaseReference;
    private  ImageAdapter imageAdapter;
    private FirebaseStorage firebaseStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_city_show_button);


        recyclerView= (RecyclerView) findViewById(R.id.Recyclerview_Show);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        houseList=new ArrayList<>();
        firebaseStorage=FirebaseStorage.getInstance();
        databaseReference= FirebaseDatabase.getInstance().getReference("Gopalganj");
        databaseReference.keepSynced(true);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                houseList.clear();
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    House upload=dataSnapshot1.getValue(House.class);
                    upload.setKey(dataSnapshot1.getKey());//using datasnapshot1 to get the real key
                    String amit=dataSnapshot1.getKey();
                    houseList.add(upload);
                    //Toast.makeText(Image_show.this, ""+amit, Toast.LENGTH_SHORT).show();
                }
                imageAdapter=new ImageAdapter(Upload_city_show_button.this,houseList);
                recyclerView.setAdapter(imageAdapter);

              imageAdapter.setOnItemClickLisitiner(new ImageAdapter.OnItemClickLisitener() {
                  @Override
                  public void OnItemClick(int position) {

                      House SelectedItem=houseList.get(position);//to get the selecteditem position
                      String text=SelectedItem.getKey();//to get the selecteditem key
                      String name=SelectedItem.getmName();
                        Toast.makeText(Upload_city_show_button.this, name+"  ", Toast.LENGTH_SHORT).show();




                        Intent intent=new Intent(Upload_city_show_button.this,Home_Address_Owner.class);
                        startActivity(intent);
                  }

                  @Override
                  public void WhatEverOnItemClick(int position) {

                  }

                  @Override
                  public void DeleteOnItemClick(int position) {

                      House SelectedItem=houseList.get(position);//to get the selecteditem position
                      final String key=SelectedItem.getKey();//to get the selecteditem key
                      StorageReference storageReference=firebaseStorage.getReferenceFromUrl(SelectedItem.getmImageUrl());
                      storageReference.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                          @Override
                          public void onSuccess(Void aVoid) {
                              databaseReference.child(key).removeValue();
                              Toast.makeText(Upload_city_show_button.this, ""+key, Toast.LENGTH_SHORT).show();

                          }
                      });


                      Toast.makeText(Upload_city_show_button.this, "Delete", Toast.LENGTH_SHORT).show();
                  }
              });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }
}
