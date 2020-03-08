package com.example.tolet;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter2 extends RecyclerView.Adapter<ImageAdapter2.ImageViewHolder> {

    private Context context;
    private List<House> houseList;
    private OnItemClickLisitener mlisitiner;

    public ImageAdapter2(Context context, List<House> houseList) {
        this.context = context;
        this.houseList = houseList;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.first_imageview, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {

        House CurrentItem = houseList.get(position);
        holder.tv_name.setText(CurrentItem.getmName());
       // holder.tv_amount.setText(CurrentItem.getmAmount());
       // holder.tv_phone.setText(CurrentItem.getmMobile());
      //  holder.tv_gender.setText(CurrentItem.getmGender());
       // Picasso.with(context)
              //  .load(CurrentItem.getmImage())
              //  .placeholder(R.mipmap.ic_launcher)
              //  .fit()
               // .centerCrop()
              //  .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,
            View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        TextView tv_name,tv_amount,tv_gender,tv_phone;
        ImageView imageView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_ImageName);
            tv_amount=itemView.findViewById(R.id.tv_amount);
            tv_gender=itemView.findViewById(R.id.tv_gender);
            tv_phone=itemView.findViewById(R.id.tv_phone);
            imageView = itemView.findViewById(R.id.imgViewId);

            itemView.setOnClickListener(this);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onClick(View v) {
            if(mlisitiner !=null){
                int position=getAdapterPosition();
                if(position !=RecyclerView.NO_POSITION){
                    mlisitiner.OnItemClick(position);

                }
            }

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Choose Your Option :");
            MenuItem doWhatEver=menu.add(Menu.NONE,1,1,"Do Whatever");
            MenuItem delete=menu.add(Menu.NONE,2,2,"Delete");

            doWhatEver.setOnMenuItemClickListener(this);
            delete.setOnMenuItemClickListener(this);
        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            if(mlisitiner !=null){
                int position=getAdapterPosition();
                if(position !=RecyclerView.NO_POSITION){

                    switch(item.getItemId()){
                        case 1:
                            mlisitiner.WhatEverOnItemClick(position);
                            return true;


                        case 2:
                            mlisitiner.DeleteOnItemClick(position);
                            return true;
                    }

                }
            }

            return false;
        }
    }

    public interface OnItemClickLisitener{
        void OnItemClick(int position);

        void WhatEverOnItemClick(int position);

        void DeleteOnItemClick(int position);

    }

    public void setOnItemClickLisitiner(OnItemClickLisitener lisitiner){
        mlisitiner=lisitiner;
    }
}
