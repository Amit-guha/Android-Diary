package com.example.beyourowndoctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;



public class cutomAdapter extends RecyclerView.Adapter<cutomAdapter.MyViewHolder> {

    private static Clicklisitiner clickLisitiner;

    Context context;
    String[] Doctor_name;
    int[] images;

    public cutomAdapter(Context context, String[] Doctor_name, int[] images) {
        this.context = context;
        this.Doctor_name = Doctor_name;
        this.images = images;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.special, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {


        myViewHolder.tvName.setText(Doctor_name[i]);
        myViewHolder.imageView.setImageResource(images[i]);

    }

    @Override
    public int getItemCount() {
        return Doctor_name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.Card_Textview);
            imageView = itemView.findViewById(R.id.Card_imageView);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            clickLisitiner.OnItemClick(getAdapterPosition(),view);


        }

    }

    public interface Clicklisitiner{
        void OnItemClick(int positon,View view);
    }

    public void setOnItemClickLisitiner(Clicklisitiner clickLisitiner){
       cutomAdapter.clickLisitiner=clickLisitiner;
}


}
