package com.example.tolet;

import com.google.firebase.database.Exclude;

public class House {
    private String mName;
    private String mImageUrl;
    private String Key;

    @Exclude
    public String getKey() {
        return Key;
    }

    @Exclude
    public void setKey(String key) {
        Key = key;
    }

    public House() {

    }

    public House(String name, String ImageUrl) {
        if (name.trim().equals("")) {
            name = "NO Name";
        }
        mName = name;
        mImageUrl = ImageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String name) {
        mName = name;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String ImageUrl) {
        mImageUrl = ImageUrl;
    }

}