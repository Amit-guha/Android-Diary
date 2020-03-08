package com.example.admissiontest2019;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AlertDialogue extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertdialogue=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.alert_dialogue,null);
        alertdialogue.setView(view)
       .setMessage("ভার্সিটির মেইন গেইট থেক সামনে এগিয়ে গেলেই গোল চত্বর দেখবেন । সেখান থেকে সোজাসুজি সাম্নের ভবন টাই প্রশানিক ভবন(" +
                " Administrative Building )। ");

        return alertdialogue.create();
    }
}
