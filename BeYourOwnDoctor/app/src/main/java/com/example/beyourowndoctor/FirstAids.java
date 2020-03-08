package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FirstAids extends AppCompatActivity {
    private RecyclerView recyclerView;
    String[] FirstAidsk;

    AidsAdapter aidsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aids);

        getSupportActionBar().setTitle("First Aids");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView=findViewById(R.id.FirstAids);
        FirstAidsk=getResources().getStringArray(R.array.AidsCatagory);

        aidsAdapter=new AidsAdapter(this,FirstAidsk);

        recyclerView.setAdapter(aidsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        aidsAdapter.setOnclickListinerAids(new AidsAdapter.clickLisitinerAdapter() {
            @Override
            public void OnItemClick(int position, View view) {
                //Toast.makeText(FirstAids.this, "21February", Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    Intent intent = new Intent(FirstAids.this, WhatFirstAidsBox.class);
                    intent.putExtra("Name", FirstAidsk[position]);
                    intent.putExtra("What", "প্রাথমিক চিকিৎসা বাক্স (ইংরেজিতে FIRST AIDS BOX নামে পরিচিত) একটি ছোট বাক্স বা থলি যাতে প্রাথমিক চিকিৎসার জন্য সবরকম জরুরী উপকরণ মজুদ থাকে। " +
                            "" +
                            "কোন দূর্ঘটনায় আহত বা অসুস্থ লোককে ঘটনাস্থলেই বা নিকটবর্তী স্থানে যে চিকিৎসা করা হয় তাকে প্রাথমিক চিকিৎসা বা ফার্স্ট এইড বলে। " +
                            "অনেক সময় প্রাথমিক চিকিৎসার সাহায্যে একজন রোগীকে সুস্থ করে তোলাও স্বম্ভব। " +
                            "তাছাড়া রোগীকে স্বাস্থ্যকেন্দ্রে নেয়ার আগ মুহূর্ত্ব পর্যন্ত তাকে জীবিত বা সুস্থ রাখার জন্যেও প্রাথমিক চিকিৎসা অত্যন্ত জরুরী বলে বিবেচনা করা হয়ে থাকে।");

                    startActivity(intent);
                }

                if(position==1){
                    Intent intent = new Intent(FirstAids.this, WhatFirstAidsBox.class);
                    intent.putExtra("Name", FirstAidsk[position]);
                    intent.putExtra("What","ফার্স্ট এইড বক্স একটি অতি দরকারি জিনিস। প্রয়োজনের সময় দৌড়াদৌড়ি না করে হাতের নাগালে ফার্স্ট এইড বক্স থাকলে খুব সহজেই রোগীকে কিছুটা সামলানো যায়। " +
                            "এতে রোগীসহ আশপাশে লোকজনের অস্থিরতাও অনেকটা কমে। তাই একটা ফার্স্ট এইড বক্স থাকা ও প্রাথমিক চিকিৎসা সম্পর্কে সবার মোটামোটি জ্ঞান থাকা দরকার। প্রয়োজনে তা খুব কাজে দেয়।" +
                            " ফার্স্ট এইড বক্স বহনযোগ্য।ফার্স্ট এইড বক্স স্কুল-কলেজে, অফিস-আদালতে, কলকারখানায় এমনকি বাসা-বাড়িতে বা গাড়িতেও রাখা যায়। " +
                            "বাসায় ও গাড়িতে প্রাথমিক চিকিৎসার জন্য খুব অল্প সময়ের মধ্যে ফার্স্ট এইড বক্স থেকে প্রয়োজনের জিনিসটা তুলে নেয়া যায়।");
                    startActivity(intent);

                }

                if(position==2){
                    Intent intent = new Intent(FirstAids.this, WhatFirstAidsBox.class);
                    intent.putExtra("Name", FirstAidsk[position]);
                    intent.putExtra("What","১। জীবাণুমুক্ত গজ পিস : ক্ষত হতে রক্ত পড়া বন্ধ করে ও জীবাণু সংক্রমণ কমায়। ওটা ক্ষতস্থানকে নিরাপদে রাখে, তাতে ময়লা হতে দেয় না এবং ক্ষত থেকে নিঃসৃত তরল পদার্থ শুষে নেয়।"+"\n" +
                            "২। রোলার ব্যান্ডেজ : ড্রেসিংকে তার জায়গায় ভালভাবে আটকে রাখার জন্য বা অতিরিক্ত রক্তপাত হলে, ব্যান্ডেজের ওপর চাপ দিয়ে পেঁচিয়ে রক্ত বন্ধ করতে, রোলার ব্যান্ডেজ ব্যবহৃত হয়।" +
                            "\n"+"৩। কাঁচি : ক্ষতের পাশে প্রয়োজনে পরনের কাপড় কাটা, গজ, ব্যান্ডেজ, মাথার চুল ইত্যাদি কাটার জন্য কাঁচি দরকার।"+"\n"+"৪। লিউকোপ্লাস্ট : ব্যান্ডেজ ক্ষতের ওপর আটকানোর জন্য দরকার।"+
                            "\n"+"৫। এন্টিসেপটিক লোশন বা ক্রিম : ক্ষত পরিষ্কার ও জীবাণুমুক্ত করতে দরকার হয়। যেমন- স্যাভলন, হাইড্রোজেন পার অক্সাইড, পভিসেভ ইত্যাদি।"+"\n"+"" +
                            "৬। ট্যুইজারস বা চিমটি : শরীর থেকে কাঁটা, কোন ক্ষুদ্র বস্তু বা সিপ্লিনটার , পোকামাকড়ের শূল ইত্যাদি সরাতে বেশ ফলদায়ক। উহা ধাতু বা প্লাস্টিকের তৈরি ও বিভিন্ন রকমের হতে পারে।"
                    +"\n"+"৭। ক্রেপ্ ব্যান্ডেজ : হাড় ফেটে গেলে বা কোথাও মচকে গেলে ক্রেপ ব্যান্ডেজ ব্যবহারে ব্যথা কমে, ফোলাও ক্রমশ হ্রাস পায়।"+"\n"+"৮। সেফটি পিন : কাঁটা বা ক্ষত থেকে কোন সিপ্লিনটার সরাতে"
                    +"\n"+"৯। এন্টিহিস্টামিন : যেমন- হিস্টাসিন, ফেক্সোফেনাডিন ইত্যাদি। এগুলো সর্দি, হাঁচি, কাশি, চুলকানি ও পোকার কামড়ের চিকিৎসায় সহায়ক।"+"\n"+"" +
                            "১০। ব্যথার ওষুধ : যেমন- প্যারাসিটামল"+"\n"+"১১। বার্ন ক্রিম : পোড়া জায়গায় ব্যথা কমাতে ও ঘা শুকাতে ব্যবহৃত হয়।অ্যালোভেরা জেল (এঊখ) পোড়া, চুলকানি ও চামড়ায় র‍্যাশ হলে বেশ কার্যকর।"
                    +"\n"+"১২। থার্মোমিটার "+"\n"+"১৩। উপকরণগুলোর তালিকা "+"\n\n"+"উপরের আইটেমগুলো যদি ফার্স্ট এইড বক্সে হাতের কাছে থাকে, তবে অনেক প্রাথমিক চিকিৎসাই সহজ হয়ে যায়। সঙ্গে কিছু টাকা ও জরুরি কন্টাক্ট নাম্বার থাকলে তো কোন কথাই নেই।" +
                            " সাথে অভিজ্ঞ কেউ থাকলে ‘ফার্স্ট এইড বক্স’ প্রয়োজনে বটবৃক্ষের মতো ছায়া দিতে পারে।");
                    startActivity(intent);
                }
            }

        });




    }
}
