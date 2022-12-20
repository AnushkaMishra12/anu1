package com.example.imageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.imageapp.Model.Wallpaper;

import java.util.List;

public class ImageAdapterClass extends RecyclerView.Adapter<ImageAdapterClass.ViewHolder> {
    String url="https://bhaktidarshan.in/APP/wallpapers/uploads/wallpapers/";
    LayoutInflater mInflater;
     private List<Wallpaper> wallpaperList;

    public ImageAdapterClass(Context context,List<Wallpaper> wallpaperList) {
        this.mInflater = LayoutInflater.from(context);
         this.wallpaperList = wallpaperList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.image_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        Wallpaper  wallpaper=wallpaperList.get(position);
        String img=wallpaper.getImgavatar();
      Glide.with(mInflater.getContext()).load(url+img).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return  wallpaperList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);

        }
    }
}
