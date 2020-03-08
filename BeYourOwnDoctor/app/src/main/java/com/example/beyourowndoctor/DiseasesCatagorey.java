package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DiseasesCatagorey extends AppCompatActivity {
    private RecyclerView recyclerView;
    Catagory catagory;

    String [] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_catagorey);


        getSupportActionBar().setTitle("CATEGORY");
        //backbutton
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView=findViewById(R.id.RecyclerviewCatagory);
        list=getResources().getStringArray(R.array.Catagory);

        catagory=new Catagory(this,list);

        recyclerView.setAdapter(catagory);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        catagory.setOnItemclickLisitiner(new Catagory.clickLisitiner() {
            @Override
            public void OnitemClick(int position, View view) {
                Intent intent = new Intent(DiseasesCatagorey.this, DiseasesMark.class);
                // Toast.makeText(DiseasesCatagorey.this, ""+list[position], Toast.LENGTH_SHORT).show();

                //Catagorey-A
                //জন্ডিস
                if (position == 0) {
                    intent.putExtra("check1", "গা মেজ মেজ করা");
                    intent.putExtra("check2", "অবসাদ অনুভব করা");
                    intent.putExtra("check3", "গেটে ব্যথা বিশেষ করে ডান দিকের উপরিভাগে");
                    intent.putExtra("check4", "ক্ষুধামন্দা");
                    intent.putExtra("check5", "বমিভাব থেকে শুরু করে বমি হওয়া");
                    intent.putExtra("check6", "জ্বর অনুভূত হওয়া");
                    intent.putExtra("check7", "চোখ ও প্রস্রাবের রঙ হলুদ হওয়া");
                    intent.putExtra("check8", "অস্থিসন্ধিতে ব্যথা অনুভব করা");
                    intent.putExtra("check9", "মাথা ব্যথা");
                    intent.putExtra("check10", "গা চুলকানো");
                    intent.putExtra("Lokkon", "জন্ডিস");
                    intent.putExtra("Care","জন্ডিসঃমূলত খাদ্য ও পানির মাধ্যমে ছড়ায়।শরীরে রক্ত নিতে হলে স্কিনিং করে নিতে হবে।মদ্য পান করা থেকে বিরত থাকুন।কারখানার রাসায়নিক পদার্থ থেকে সাবধান থাকুন। নেশাদ্রব্য গ্রহন করা থেকে বিরত থাকুন।পুরাতন ব্লেড বা ক্ষুর দিয়ে সেভ করবেন না । হেপাটাইটিস এ এবং বি থেকে আশংকামুক্ত থাকতে ভ্যাকসিন গ্রহন করুন।");
                    startActivity(intent);
                }

                //Catagorey-B
                //ডেঙ্গু
                if (position == 1) {
                    intent.putExtra("check1", "হঠাৎ উচ্চমাত্রার জ্বর");
                    intent.putExtra("check2", "কাঁপুনি দিয়ে জ্বর");
                    intent.putExtra("check3", "তাপমাত্রা ১০৫ ডিগ্রি পর্যন্ত উঠতে পারে");
                    intent.putExtra("check4", "সারা শরীরে, মাংসপেশি ও হাড়ে ব্যথা");
                    intent.putExtra("check5", "চোখের পেছন দিকে ব্যথা");
                    intent.putExtra("check6", "জ্বর আসার তিন বা চার দিন পর শরীরে লালচে দাগ বা র‍্যাশ দেখা দিতে পারে");
                    intent.putExtra("check7", "অরুচি");
                    intent.putExtra("check8", "প্রচণ্ড দুর্বলতা");
                    intent.putExtra("check9", "মাথা ঘোরা");
                    intent.putExtra("check10", "পেটে ব্যথা");
                    intent.putExtra("Lokkon", "ডেঙ্গু");
                    intent.putExtra("Care","ডেংগুঃমূলত লক্ষণ দেখে ব্যবস্থা নেয়া হয়।বিশ্রাম নিতে হবে।প্রচুর পরিমানে পানি,শরবত ও ডাবের পানি এবং তরল জাতীয় খাবার খেতে হবে।জ্বর কমানোর জন্য প্যারাসিটামল জাতীয় ওষুধ ই যথেষ্ট । ভেজা কাপড় দিয়া গা মোছালে উপকার পাওয়া যাবে।");
                    startActivity(intent);
                }

                //Catagorey-C
                //ম্যালেরিয়া
                if (position == 2) {
                    intent.putExtra("check1", "ম্যালেরিয়ার সাধারণ লক্ষণ হল শীত লাগা");
                    intent.putExtra("check2", "কাঁপুনি দিয়ে জ্বর আসা");
                    intent.putExtra("check3", "বাচ্চাদের অনেক সময় জ্বরের সঙ্গে পেটের গোলমাল, শ্বাসজনিত অসুবিধা ইত্যাদি দেখা যায়");
                    intent.putExtra("check4", "ছয় মাসথেকে পাঁচ বছরের বাচ্চাদের মধ্যে কাঁপুনি দিয়ে জ্বর আসা ভাবটি লক্ষ্য করা যায় না");
                    intent.putExtra("check5", "খিটখিটে ভাব(বাচ্চাদের ক্ষেত্রে)");
                    intent.putExtra("check6", "ঝিমুনি, খাওয়ার অনীহা, বমি, মাথাব্যথা(বাচ্চাদের ক্ষেত্রে)");
                    intent.putExtra("check7", "পাঁচ বছরের বেশী বয়সীরা ম্যালেরিয়াতে আক্রান্ত হলে প্রথমে শীত ও কাঁপুনি অনুভব করে");
                    intent.putExtra("check8", "জ্বর ক্রমেই বৃদ্ধি পেয়ে ১০৫ ফারেনহাইট পর্যন্ত উঠতে পারে");
                    intent.putExtra("check9", "সঙ্গে প্রচন্ড মাথাব্যথা");
                    intent.putExtra("check10", "ঘাম দিয়ে জ্বর ছাড়লে রোগী খুব দুর্বল বোধ করে");
                    intent.putExtra("Lokkon", "ম্যালেরিয়া");
                    intent.putExtra("Care","ক্লোরোকুইন সবথেকে কার্যকরী ওষুধ।তবে এর থেকে ভালো ওষুধ  এখন দেশে আছে।");
                    startActivity(intent);
                }

                //Catagory-D
                //এলার্জি
                if (position == 3) {
                    intent.putExtra("check1", "শরীরে চুলকানি");
                    intent.putExtra("check2", "লাল চাক হয়ে ওঠা");
                    intent.putExtra("check3", "চোখ চুলকানো ও লাল হওয়া");
                    intent.putExtra("check4", "নাক দিয়ে পানি পড়া");
                    intent.putExtra("check5", "কাশি, হাঁচি, শ্বাসকষ্ট");
                    intent.putExtra("check6", "বমি বমি ভাব");
                    intent.putExtra("check7", "ডায়রিয়া, পেটে ব্যথা");
                    intent.putExtra("check8", "নাক বন্ধ থাকা");
                    intent.putExtra("check9", "নাক দিয়ে পানি পড়া");
                    intent.putExtra("check10", "চুলকানি");
                    intent.putExtra("Lokkon", "এলার্জি");
                    intent.putExtra("Care","এলার্জেন পরিহার।এলার্জি ভ্যাকসিন বা ইমুনোথেরাপী।");
                    startActivity(intent);
                }

                //Catagory-E
                //চিকুনগুনিয়া

                if (position == 4) {
                    intent.putExtra("check1", "চিকুনগুনিয়ার মূল উপসর্গ হলো জ্বর");
                    intent.putExtra("check2", "অস্থিসন্ধির ব্যথা");
                    intent.putExtra("check3", "জ্বর অনেকটা ডেঙ্গুর মতোই দেহের তাপমাত্রা অনেক বেড়ে যায়");
                    intent.putExtra("check4", "প্রায়ই ১০৪ ডিগ্রি ফারেনহাইট পর্যন্ত উঠে যায়, তবে কাঁপুনি বা ঘাম দেয় না");
                    intent.putExtra("check5", "জ্বরের সঙ্গে সঙ্গে মাথাব্যথা");
                    intent.putExtra("check6", "চোখ জ্বালা করা");
                    intent.putExtra("check7", "গায়ে লাল লাল দানার মতো রেশ");
                    intent.putExtra("check8", "অবসাদ,অনিদ্রা");
                    intent.putExtra("check9", "বমি বমি ভাব");
                    intent.putExtra("check10", "এ ছাড়া শরীরের বিভিন্ন স্থানে, বিশেষ করে অস্থিসন্ধিতে তীব্র ব্যথা হয়—এমনকি ফুলেও যেতে পারে");
                    intent.putExtra("Lokkon", "চিকুনগুনিয়া");
                    intent.putExtra("Care","এ রোগের কোনো প্রতিষেধক বা টিকা এখন অব্দি আবিষ্কার হয় নি।তবে প্রচুর পরিমানে পানি,শরবত ও ডাবের পানি এবং তরল জাতীয় খাবার খেতে হবে।জ্বর কমানোর জন্য প্যারাসিটামল জাতীয় ওষুধ ই যথেষ্ট । ভেজা কাপড় দিয়া গা মোছালে উপকার পাওয়া যাবে।");
                    startActivity(intent);
                }

                //Catagory-F
                //বাতজ্বর
                if (position == 5) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "হৃৎপিণ্ডের প্রদাহ, যা হলে রোগীর জ্বর, বুকে ব্যথা, বুক ধড়ফর করা, নাড়ীর গতি বেড়ে যাওয়া, শ্বাসকষ্ট ইত্যাদি সমস্যা হয়।");
                    intent1.putExtra("check2", "গিরায় ব্যথা, যা হলে মূলত বড় গিরায় যেমন হাঁটু, গোড়ালি, হাতের কবজি, কনুই ও কোমরে ব্যথা হয়, ফুলে যায় ও লালচে বর্ণ ধারণ করে।");
                    intent1.putExtra("check3", "প্রথমে যেকোনো একটি গিরায় ব্যথা ও ফোলা থাকে, তার সেই গিরার ব্যথা ও ফোলা ২-৩ দিন পর কমে গিয়ে আরেকটি গিরাকে আক্রান্ত করে।");
                    intent1.putExtra("check4", "ইরিথেমা মারজিনেটাম অর্থাৎ বুকে ও পিঠের বিভিন্ন অংশ বিভিন্ন আকৃতির লাল বর্ণের চাকা দেখা দেয়া, যেগুলোতে কোনো ব্যথাও হয় না, আবার চুলকায়ও না, তবে একটু ফুলে ওঠতে পারে এবং আপনা আপনি ধীরে ধীরে ভালো হয়ে যায়।");
                    intent1.putExtra("check5", "সিডেনহ্যাম কোরিয়া, যা মস্তিষ্কের এক ধরনের সমস্যা। এর ফলে রোগীর মেজাজ খুব খিটখিটে হয়।");
                   // intent1.putExtra("check6", "হাত-পা বা শরীরের কোনো অংশ নিয়ন্ত্রণহীনভাবে অযথা কাঁপতে থাকে।");
                   // intent1.putExtra("check7", "চামড়ার নিচে ছোট দানা");
                   // intent.putExtra("check8", "অবসাদ,অনিদ্রা");
                   // intent.putExtra("check9", "বমি বমি ভাব");
                    //intent.putExtra("check10", "এ ছাড়া শরীরের বিভিন্ন স্থানে, বিশেষ করে অস্থিসন্ধিতে তীব্র ব্যথা হয়—এমনকি ফুলেও যেতে পারে");
                    intent1.putExtra("Lokkon", "বাতজ্বর");
                    intent1.putExtra("Care","বাতজ্বরঃবারিফ, বেনজাপেন, টরী।");
                    startActivity(intent1);
                }

                //Catagory-G
                //এপেন্ডিসাইটিস
                if (position == 6) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "প্রধান লক্ষণ হল পেটে একটানা ব্যথা, যেটা ক্রমশ বাড়তে থাকে");
                    intent1.putExtra("check2", "ব্যথাটা সাধারণতঃ নাভির চারদিকে থেকে শুরু হয়, কিছুক্ষণের মধ্যেই নাভির নিচে ও ডানদিকে সরে যায়");
                    intent1.putExtra("check3", "খিদে কমে যেতে পারে");
                    intent1.putExtra("check4", "কাশি, কোষ্ঠকাঠিণ্য");
                    intent1.putExtra("check5", "অল্প জ্বর হতে পারে");
                    intent1.putExtra("Lokkon", "এপেন্ডিসাইটিস");
                    intent1.putExtra("Care","এপেন্ডিসাইটিসঃ মূল উপায় হচ্ছে অপারেশন তবে Ampicillin, hemihydrate, cefepime hydrochloride, metronidazole, ciprofloxacin, gentamicin, levofloxacin, moxifloxacin, morphine sulphate জাতীয় ওষুধ দিতে পারে ডাক্তার রা।"
                            );
                    startActivity(intent1);
                }

                //Catagory-H
                //যক্ষা
                if (position == 7) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "দীর্ঘদিন ধরে অল্প জ্বর");
                    intent1.putExtra("check2", "বিকেলের দিকে এই জ্বর কিছুটা বাড়ে, রাতে ঘাম দিয়ে ছেড়ে যায়");
                    intent1.putExtra("check3", "অনেক দিন ধরে কাশি, বিশেষ করে তা যদি ৩০ দিনের বেশি স্থায়ী হয়");
                    intent1.putExtra("check4", "খাওয়ায় অরুচি");
                    intent1.putExtra("check5", "ওজন কমে যাওয়া বা ওজন না বাড়া");
                    intent1.putExtra("Lokkon", "যক্ষা");
                    intent1.putExtra("Care","মূলত ৬ মাসের একটা ফুল কোর্স ওষুধ দেয়া হয়।প্রহতম ২ মাসে ৪ টি ওষুধ ব্যবহার করা হয়।শেষ ৪ মাসে ২ ধরনের ওষুধ ব্যবহার করা হয়।");
                    startActivity(intent1);
                }

                //Catagory -I
                //হাম
                if (position == 8) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "চোখের লালচে ভাব,কাশি,সর্দি ইত্যাদি উপসর্গের দেখা দেয়");
                    intent1.putExtra("check2", "জ্বর শুরুর তিন-চার দিন পর লালচে ছোপ বা লালচে ছোপ-দানাদার মিশ্র র‍্যাশ দেখা দেয়");
                    intent1.putExtra("check3", "যা মাথা ও গলা থেকে শুরু হয়ে শরীর-হাতে ছড়িয়ে পড়ে");
                    intent1.putExtra("check4", "চার থেকে ছয় দিন স্থায়ী হতে পারে");
                    intent1.putExtra("check5", "ওজন কমে যাওয়া বা ওজন না বাড়া");
                    intent1.putExtra("Lokkon", "হাম");
                    intent1.putExtra("Care","প্যারাসিটামল বা আইবুপ্রোফেন");
                    startActivity(intent1);

                }

                //Catagory -J
                // আর্সেনিক
                if (position == 9) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "শরীরে কালো কালো ছোপ বা দাগ দেখা দেয়");
                    intent1.putExtra("check2", "হাত ও পায়ের সংবেদনশীলতা নষ্ট হয়");
                    intent1.putExtra("check3", "হাত ও পায়ের তালু শক্ত ও খসখসে হয়। সর্বোপরি ‘ব্লাক ফুট’ নামক রোগের সৃষ্টি হয়।");
                    intent1.putExtra("check4", "পেটের যন্ত্রণা ও মাথার যন্ত্রণা দেখা দেয়।");
                    intent1.putExtra("check5", "বমি, রক্তবমি ও জন্ডিস দেখা দেয়।");

                    intent1.putExtra("Lokkon", "আর্সেনিক");
                    intent1.putExtra("Care","এ রোগের তেমন প্রতিষেধক এখনো পাওয়া যায়না বাংলাদেশে।তবে কেউ আক্রান্ত হলে তাকে আর্সেনিক মুক্ত পানি পান করাতে হবে ।পানি ছেকে এবং ২০ মিনিট ফুটিয়ে পান করানো যেতে পারে।শাক-সবজি,ফল,পুষ্টিকর খাবার বেশি খেতে হবে।রোগ দেখা দিলে যতদ্রুত সম্ভব ডাক্তারের কাছে যেতে হবে।");
                    startActivity(intent1);
                }

                //Catagory -K
                // এইডস

                if (position == 10) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "জ্বর");
                    intent1.putExtra("check2", "মাথা ব্যথা");
                    intent1.putExtra("check3", "গলা ভাঙ্গা");
                    intent1.putExtra("check4", "লসিকাগ্রন্থি ফুলে উঠা (Swollen lymph glands)");
                    intent1.putExtra("check5", "শরীরে লালচে দানা (Rash) ইত্যাদি লক্ষণ ও উপসর্গ দেখা দেয়");

                    intent1.putExtra("Lokkon", "এইডস");
                    intent1.putExtra("Care","তেমন কোনো ওষুধ নেই।রোগী মানসিক ভাবে শক্ত হলে এবং নিয়মিত ওষুধ খেলে সুস্থ হয়ে উঠতে পারে।জিডোবোডিন,ল্যামিবোডিন,নেভিরাপিন,টেনোফোবিন ইত্যাদি ওষুধ দেয়া হয়ে থাকে।");
                    startActivity(intent1);
                }

                //Catagory -L
                //কোষ্ঠকাঠিন্য
                if (position == 11) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "শক্ত ও কঠিন মল");
                    intent1.putExtra("check2", "মলত্যাগে অনেক বেশি সময় লাগা");
                    intent1.putExtra("check3", "অনেক বেশি চাপের দরকার হওয়া");
                    intent1.putExtra("check4", "অধিক সময় ধরে মলত্যাগ করার পরও অসম্পূর্ণ মনে হওয়া");
                    intent1.putExtra("check5", "মলদ্বারের আশপাশে ও তলপেটে ব্যথা");

                    intent1.putExtra("Lokkon", "কোষ্ঠকাঠিন্য");
                    intent1.putExtra("Care","গ্লিসাপ সাপোজিটরি,ইসপারগুল স্যাশে।");
                    startActivity(intent1);
                }

                //Catagroy-M
                //হেপাটাইটিস
                if (position == 12) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "সর্দি");
                    intent1.putExtra("check2", "জ্বর");
                    intent1.putExtra("check3", "দুর্বলতা");
                    intent1.putExtra("check4", "খাবারে অরুচি");
                    intent1.putExtra("check5", "পেটে ব্যথা, পাতলা পায়খানা");

                    intent1.putExtra("Lokkon", "হেপাটাইটিস");
                    intent1.putExtra("Care","রোগ ধরা পড়লে যত দ্রুত সম্ভব ডাক্তারের কাছে যেতে হবে।প্রতিরোধের ক্ষেত্রে হেপাটাইটিস এ এবং বি এর ভ্যাকসিন নিতে হবে।");
                    startActivity(intent1);
                }

                //Catagory-N
                //নিউমোনিয়া

                if (position == 13) {
                    Intent intent1=new Intent(DiseasesCatagorey.this,FiveDiseasesMark.class);
                    intent1.putExtra("check1", "বুকের খাঁচার নিচে দেবে যাবে,শ্বাসের সাথে নাকের ডগা ফুলে যাওয়া");
                    intent1.putExtra("check2", "গায়ের তাপমাত্রার ঊর্ধ্বগতি হবে, এমনকি ১০৪ ডিগ্রী ফারেনহাইটে উপনীত হতে পারে।");
                    intent1.putExtra("check3", "বাচ্চার চেহারাতে একটি ক্লান্তি ও অসুস্থতার ভাব প্রকট থাকে।");
                    intent1.putExtra("check4", "কাশি: রাত্রিকালীন ও ভোরের দিকে কাশির প্রকোপ বেশি হতে পারে");
                    intent1.putExtra("check5", "কফ: ছোট্ট বাচ্চাদের ক্ষেত্রে কফ নাও বের হতে পারে। ,বুকে ঘড় ঘড় আওয়াজ পাওয়া যেতে পারে");

                    intent1.putExtra("Lokkon", "নিউমোনিয়া");
                    intent1.putExtra("Care","ম্যাক্সপাইম ৫০০ মিঃগ্রাঃ ইনজেকশন,ম্যাক্সপাইম ১ গ্রাম ইনজেকশন,ম্যাক্সপাইম ২ গ্রাম ইনজেকশন।");
                    startActivity(intent1);
                }













            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
