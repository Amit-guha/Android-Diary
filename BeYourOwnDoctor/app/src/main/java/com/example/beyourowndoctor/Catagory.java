package com.example.beyourowndoctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Catagory extends RecyclerView.Adapter<Catagory.MyviewHolder> {
    private static clickLisitiner clickLis;
    Context context;
    String [] Catagory;

    public Catagory(Context context, String[] catagory) {
        this.context = context;
        Catagory = catagory;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.catagorey,parent,false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.textView.setText(Catagory[position]);

    }

    @Override
    public int getItemCount() {
        return Catagory.length;
    }

    class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_catagory);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickLis.OnitemClick(getAdapterPosition(),view);

        }
    }

    public interface clickLisitiner{
        void OnitemClick(int position,View view);
    }

    public void setOnItemclickLisitiner(clickLisitiner clickLisitiner){
        com.example.beyourowndoctor.Catagory.clickLis=clickLisitiner;
    }
}
