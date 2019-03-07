package com.example.androidfirebasedb;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView txt_name, txt_colour, txt_doorOpen, txt_time, txt_shape, txt_quantity, txt_timeSchedule;


    IItemClickListener iItemClickListener;

//    public IItemClickListener getiItemClickListener() {
//        return iItemClickListener;
//    }

    public void setiItemClickListener(IItemClickListener iItemClickListener) {
        this.iItemClickListener = iItemClickListener;
    }

    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_name = (TextView)itemView.findViewById(R.id.txt_name);
        txt_colour = (TextView)itemView.findViewById(R.id.txt_colour);
        txt_time = (TextView)itemView.findViewById(R.id.txt_time);
        txt_doorOpen = (TextView)itemView.findViewById(R.id.txt_doorOpen);
        txt_quantity = (TextView)itemView.findViewById(R.id.txt_quantity);
        txt_shape = (TextView)itemView.findViewById(R.id.txt_shape);
        txt_timeSchedule = (TextView)itemView.findViewById(R.id.txt_timeSchedule);


        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        iItemClickListener.onClick(view,getAdapterPosition());
    }
}
