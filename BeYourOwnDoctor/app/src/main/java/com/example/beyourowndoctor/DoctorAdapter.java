package com.example.beyourowndoctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.MyviewHolder> {
   private static ClickLIsitiner clickLISITINER;

    Context context;
    String [] names;
    String[] designation;
    String[] Expertise;
    String[] Instituaton;


    public DoctorAdapter(Context context, String[] names,String[] designation,String[] Expertise,String[] Instituaton) {
        this.context = context;
        this.names = names;
        this.designation=designation;
        this.Expertise=Expertise;
        this.Instituaton=Instituaton;

    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.doctordesignation,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.tvname.setText(names[position]);
        holder.tvdesignation.setText(designation[position]);
        holder.tvExpertise.setText(Expertise[position]);
        holder.tvMedical.setText(Instituaton[position]);

    }

    @Override
    public int getItemCount() {
        return designation.length;
    }

    public  class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvname,tvdesignation,tvExpertise,tvMedical;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            tvname=itemView.findViewById(R.id.tv_drname);
            tvdesignation=itemView.findViewById(R.id.tv_drDesignation);
            tvExpertise=itemView.findViewById(R.id.tv_drExpertise);
            tvMedical=itemView.findViewById(R.id.tv_drMedicalcollege);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            clickLISITINER.onItemclick(getAdapterPosition(),view);


        }
    }

    public interface ClickLIsitiner{
        void onItemclick(int position,View v);
    }

    public void setOnItemClickLisitiner(ClickLIsitiner clickLisitiner){
        DoctorAdapter.clickLISITINER=clickLisitiner;
    }

}
