package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileHolder> {

    final List<Mobile>mobileList;
    final Context context;

    public MobileAdapter(List<Mobile>mobileList , Context context) {
        this.mobileList = mobileList;
        this.context =context;
    }

    @NonNull
    @Override
    public MobileHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_row , parent ,false);


        MobileHolder holder = new MobileHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MobileHolder holder, int position) {

        Mobile mobile = mobileList.get(position);
        holder.mobileName.setText(mobile.getMobileName());
        holder.mobileManufacture.setText(mobile.getMobileManufacture());
        holder.mobileImg.setImageResource(mobile.getMobileImage());
    }

    @Override
    public int getItemCount() {
        return mobileList.size();
    }

    public static class MobileHolder extends RecyclerView.ViewHolder{
        TextView mobileName , mobileManufacture;
        ImageView mobileImg;
        public MobileHolder(View itemView) {
            super(itemView);
            mobileName = (TextView) itemView.findViewById(R.id.mobile_name);
            mobileManufacture = (TextView) itemView.findViewById(R.id.manufacture);
            mobileImg =(ImageView) itemView.findViewById(R.id.mobile_img);
        }
    }
}
