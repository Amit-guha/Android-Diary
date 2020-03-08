package com.example.tolet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.internal.Storage;
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

public class ImageHome extends AppCompatActivity implements ImageAdapter.OnItemClickLisitener {
    private RecyclerView mRecyclerview;
    private ImageAdapter imageAdapter;

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

        databaseReference = FirebaseDatabase.getInstance().getReference("Gopalganj");
        storage=FirebaseStorage.getInstance();
        houseList = new ArrayList<>();

        imageAdapter = new ImageAdapter(ImageHome.this, houseList);
        mRecyclerview.setAdapter(imageAdapter);
        imageAdapter.setOnItemClickLisitiner(ImageHome.this);

       Dblisitiner= databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                houseList.clear();
                for (DataSnapshot postsnapshot : dataSnapshot.getChildren()) {

                    House house = postsnapshot.getValue(House.class);
                 //   house.setMkey(postsnapshot.getKey());
                    String name=house.getmName();

                 /*
                    String mobile=house.getmMobile().toString();
                    String taka=house.getmAmount().toString();
*/
                    houseList.add(house);
                  // Intent intent=new Intent(ImageHome.this,ExampleService.class);
                  // intent.putExtra("name",name);
                }

               imageAdapter.notifyDataSetChanged();
                imageAdapter.setOnItemClickLisitiner(new ImageAdapter.OnItemClickLisitener() {
                    @Override
                    public void OnItemClick(int position) {
                       // Intent intent=new Intent(ImageHome.this,BFemale.class);
                       // Toast.makeText(ImageHome.this, "Next...", Toast.LENGTH_SHORT).show();
                       // startActivity(intent);
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

                Toast.makeText(ImageHome.this, "" + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
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
      //  final String selectedKey=selectedItem.getMkey();//Generate the key which user want to delete


      //  StorageReference imgRef=storage.getReferenceFromUrl(selectedItem.getmImage());//get the imgurl which user want to delete




       // imgRef.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
        //    @Override
           // public void onSuccess(Void aVoid) {
               // databaseReference.child(selectedKey).removeValue();
               // Toast.makeText(ImageHome.this, "Item Deleted", Toast.LENGTH_SHORT).show();//delete the item
           // }
      //  });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        databaseReference.removeEventListener(Dblisitiner);
    }
}
