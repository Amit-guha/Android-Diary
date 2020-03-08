package com.example.home;

import com.google.firebase.database.Exclude;

public class Addition {
    private String mName;
    private String mImageUrl;
    private String mMoible;
    private String mGender;
    private String mAmount;
    private String Key;

    @Exclude
    public String getKey() {
        return Key;
    }
    @Exclude
    public void setKey(String key) {
        Key = key;
    }


    public Addition() {

        //Need Empty Constructor--->>>follow by Android Officail Website
    }

    public Addition(String name,String ImageUrl,String mobile,String Gender,String Amount){
        if(name.trim().equals("")){
            name="NO Name";
        }
        mName=name;
        mImageUrl=ImageUrl;
        mMoible=mobile;
        mGender=Gender;
        mAmount=Amount;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmAmount() {
        return mAmount;
    }

    public void setmAmount(String mAmount) {
        this.mAmount = mAmount;
    }

    public String getmMoible() {
        return mMoible;
    }

    public void setmMoible(String mMoible) {
        this.mMoible = mMoible;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }
}
