package com.example.home;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.MyviewHolder>{

    private Context context;
    private List<Upload> uploadList;
    private OnItemClickLisitiner lisitiner;

    public CityAdapter(Context context, List<Upload> uploadList) {
        this.context = context;
        this.uploadList = uploadList;
    }

    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.imgeshow, parent, false);
        return new MyviewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MyviewHolder holder, int position) {
        final Upload upload = uploadList.get(position);
        holder.textView.setText(upload.getName());

        Picasso.with(context).load(upload.getImageUrl()).networkPolicy(NetworkPolicy.OFFLINE).into(holder.imageView, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError() {
                Picasso.with(context)
                        .load(upload.getImageUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .fit()
                        .centerCrop()
                        .into(holder.imageView);

            }
        });

     /*   Picasso.with(context)
                .load(upload.getmImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageView);*/

    }

    @Override
    public int getItemCount() {
        return uploadList.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        TextView textView;
        ImageView imageView;

        public MyviewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.Card_Textview);
            imageView = (ImageView) itemView.findViewById(R.id.Card_imageView);
            itemView.setOnClickListener(this);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onClick(View v) {
            if (lisitiner != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    lisitiner.OnitemClick(position);
                }
            }


        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Item:");
            MenuItem delete = menu.add(Menu.NONE, 1, 1, "Delete");
            // MenuItem Update = menu.add(Menu.NONE, 2, 2, "Update");

            delete.setOnMenuItemClickListener(this);
            // Update.setOnMenuItemClickListener(this);

        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {

            if (lisitiner != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    switch (item.getItemId()) {
                        case 1:
                            lisitiner.delete(position);
                            return true;
                      /*  case 2:
                            lisitiner.Update(position);
                            return true;
*/
                    }
                }
            }
            return false;
        }
    }

    public interface OnItemClickLisitiner {
        void OnitemClick(int position);

        void delete(int position);

        //  void Update(int position);

    }

    public void setOnItemClickLisitiner(OnItemClickLisitiner lisitiner) {
        this.lisitiner = lisitiner;

    }

}
