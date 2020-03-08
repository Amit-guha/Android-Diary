package com.example.beyourowndoctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class HealthAdapter extends BaseAdapter {
    Context context;
    String [] CareName;
    int [] carepic;

    public HealthAdapter(Context context, String[] careName, int[] carepic) {
        this.context = context;
        CareName = careName;
        this.carepic = carepic;
    }

    @Override
    public int getCount() {
        return CareName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view= layoutInflater.inflate(R.layout.health,viewGroup,false);


        }
        TextView tvCareName=view.findViewById(R.id.Card_Textview11);
        ImageView imageCarePic=view.findViewById(R.id.Card_imageView12);

        imageCarePic.setImageResource(carepic[i]);
        tvCareName.setText(CareName[i]);

        return view;
    }
}
