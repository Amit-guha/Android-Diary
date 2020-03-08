package com.example.beyourowndoctor;

public class ExampleItem {
    private String mName;
    private String mDesignation;
    private String mExpertise;
    private String mMedicalcollege;

    public ExampleItem(String mName, String mDesignation, String mExpertise, String mMedicalcollege) {
        this.mName = mName;
        this.mDesignation = mDesignation;
        this.mExpertise = mExpertise;
        this.mMedicalcollege = mMedicalcollege;
    }

    public String getmName() {
        return mName;
    }

    public String getmDesignation() {
        return mDesignation;
    }

    public String getmExpertise() {
        return mExpertise;
    }

    public String getmMedicalcollege() {
        return mMedicalcollege;
    }
}
