package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
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

public class CityShow extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Upload> uploadList;
    DatabaseReference databaseReference;
    private CityAdapter imageAdapter;
    private FirebaseStorage firebaseStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Boolean customtitlebarSupported = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        setContentView(R.layout.activity_city_show);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       /* if (customtitlebarSupported) {
            getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_titlebar);

        }*/


       //  getSupportActionBar().hide();
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //  WindowManager.LayoutParams.FLAG_FULLSCREEN);


        recyclerView = (RecyclerView) findViewById(R.id.Recyclerview_Show);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        uploadList = new ArrayList<>();
        firebaseStorage = FirebaseStorage.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("Para");
        databaseReference.keepSynced(true);


        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                uploadList.clear();
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    Upload upload = dataSnapshot1.getValue(Upload.class);
                    upload.setKey(dataSnapshot1.getKey());//using datasnapshot1 to get the real key
                    String amit = dataSnapshot1.getKey();
                    uploadList.add(upload);
                    //Toast.makeText(Image_show.this, ""+amit, Toast.LENGTH_SHORT).show();
                }
                imageAdapter = new CityAdapter(CityShow.this, uploadList);
                recyclerView.setAdapter(imageAdapter);

                imageAdapter.setOnItemClickLisitiner(new CityAdapter.OnItemClickLisitiner() {
                    @Override
                    public void OnitemClick(int position) {
                        // String text=uploadList.get(position).getmName().toString();
                        Upload SelectedItem = uploadList.get(position);//to get the selecteditem position
                        String text = SelectedItem.getKey();//to get the selecteditem key
                        //   Toast.makeText(Image_show.this, text+"  ", Toast.LENGTH_SHORT).show();


                        Intent intent = new Intent(CityShow.this, BioUpload.class);
                        intent.putExtra("Selectedkey", text);
                        startActivity(intent);


                    }

                    @Override
                    public void delete(int position) {
                        Upload SelectedItem = uploadList.get(position);//to get the selecteditem position
                        final String key = SelectedItem.getKey();//to get the selecteditem key
                        StorageReference storageReference = firebaseStorage.getReferenceFromUrl(SelectedItem.getImageUrl());
                        storageReference.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                databaseReference.child(key).removeValue();
                                // Toast.makeText(Image_show.this, ""+key, Toast.LENGTH_SHORT).show();

                            }
                        });


                        Toast.makeText(CityShow.this, "Delete", Toast.LENGTH_SHORT).show();
                    }


                });

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
