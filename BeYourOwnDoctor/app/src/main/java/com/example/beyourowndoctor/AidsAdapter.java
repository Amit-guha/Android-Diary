package com.example.beyourowndoctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AidsAdapter extends RecyclerView.Adapter<AidsAdapter.MyviewHolder> {
    private static clickLisitinerAdapter clickAids;
    Context context;
    String [] aidsName;

    public AidsAdapter(Context context, String[] aidsName) {
        this.context = context;
        this.aidsName = aidsName;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.aids,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.textView.setText(aidsName[position]);

    }

    @Override
    public int getItemCount() {
        return aidsName.length;
    }

    class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_aids);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickAids.OnItemClick(getAdapterPosition(),view);

        }
    }

    public interface clickLisitinerAdapter{
        void OnItemClick(int position,View view);
    }

    public void setOnclickListinerAids(clickLisitinerAdapter clik){
        AidsAdapter.clickAids=clik;
    }


}
