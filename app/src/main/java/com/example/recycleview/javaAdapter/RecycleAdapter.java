package com.example.recycleview.javaAdapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.MainActivity;
import com.example.recycleview.R;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.DataHolder> {

    Activity activity;
    String[] country;

    public RecycleAdapter(MainActivity activity, String[] country) {
        this.activity=activity;
        this.country=country;
    }

    @NonNull
    @Override
    public RecycleAdapter.DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(activity).inflate(R.layout.recycle,parent,false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {
      holder.textView.setText(country[position]);
    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    public class DataHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public DataHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txt);

        }
    }
}
