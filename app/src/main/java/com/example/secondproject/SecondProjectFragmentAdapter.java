package com.example.secondproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondProjectFragmentAdapter extends RecyclerView.Adapter<SecondProjectFragmentAdapter.SecondProjectFragmentViewHolder> {

    private ArrayList<String> data;

    public SecondProjectFragmentAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SecondProjectFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondProjectFragmentViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondProjectFragmentViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SecondProjectFragmentViewHolder extends RecyclerView.ViewHolder {
        private TextView item;
        public SecondProjectFragmentViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.tv_tools);
        }

        public void bind(String s) {
            item.setText(s);
        }
    }
}
