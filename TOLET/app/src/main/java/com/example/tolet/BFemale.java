package com.example.tolet;

import androidx.annotation.NonNull;
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

public class BFemale extends AppCompatActivity   implements ImageAdapter2.OnItemClickLisitener {

    private RecyclerView mRecyclerview;
    private ImageAdapter2 imageAdapter;

    private DatabaseReference databaseReference;
    private ValueEventListener Dblisitiner;
    private FirebaseStorage storage;
    private List<House> houseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_home);

        mRecyclerview = findViewById(R.id.RecyclerView);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        databaseReference = FirebaseDatabase.getInstance().getReference("Women");
        storage=FirebaseStorage.getInstance();
        houseList = new ArrayList<>();

        imageAdapter = new ImageAdapter2(BFemale.this, houseList);
        mRecyclerview.setAdapter(imageAdapter);
        imageAdapter.setOnItemClickLisitiner(BFemale.this);

        Dblisitiner= databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                houseList.clear();
                for (DataSnapshot postsnapshot : dataSnapshot.getChildren()) {

                    House house = postsnapshot.getValue(House.class);
                  //  house.setMkey(postsnapshot.getKey());
                    houseList.add(house);
                }

                imageAdapter.notifyDataSetChanged();
                imageAdapter.setOnItemClickLisitiner(new ImageAdapter2.OnItemClickLisitener() {
                    @Override
                    public void OnItemClick(int position) {
                        Intent intent=new Intent(BFemale.this,Call.class);
                        startActivity(intent);
                    }

                    @Override
                    public void WhatEverOnItemClick(int position) {

                    }

                    @Override
                    public void DeleteOnItemClick(int position) {

                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(BFemale.this, "" + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void OnItemClick(int position) {
        Toast.makeText(this, "Normal click at position "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void WhatEverOnItemClick(int position) {

        Toast.makeText(this, "WhatEver click at position "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DeleteOnItemClick(int position) {

        House selectedItem=houseList.get(position);//get the position which user select
       // final String selectedKey=selectedItem.getMkey();//Generate the key which user want to delete


       // StorageReference imgRef=storage.getReferenceFromUrl(selectedItem.getmImage());//get the imgurl which user want to delete
      //  imgRef.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
          //  @Override
          //  public void onSuccess(Void aVoid) {
              //  databaseReference.child(selectedKey).removeValue();
                Toast.makeText(BFemale.this, "Item Deleted", Toast.LENGTH_SHORT).show();//delete the item
            }
     //   });


   // }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        databaseReference.removeEventListener(Dblisitiner);
    }
}
