package com.example.secondproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

    public class SecondProjectFragment extends Fragment {
        private ArrayList<String> items;
        private SecondProjectFragmentAdapter adapter;
        private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_project, container, false);
    }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            loudData();
            recyclerView = view.findViewById(R.id.recycle);
            adapter = new SecondProjectFragmentAdapter(items);
            recyclerView.setAdapter(adapter);

        }

        private void loudData() {
            items = new ArrayList<>();
            items.add("Abdusamad");
            items.add("Nagima");
            items.add("Mastura");
            items.add("Nurali");
            items.add("Azamat");
            items.add("Muhamedali");
            items.add("Myrza");
            items.add("Anara");
            items.add("Ajybek");
            items.add("Dilnaz");
            items.add("Tanzila");
        }
    }