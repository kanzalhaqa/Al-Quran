package com.example.al_quran;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class main_item_solo_adaptor extends RecyclerView.Adapter<main_item_solo_adaptor.MyViewHolder> {

    private ArrayList<main_item_solo> arrayList;

    private RecyclerViewClickListener listener;


    public main_item_solo_adaptor(ArrayList<main_item_solo> arrayList,RecyclerViewClickListener listener) {
        this.arrayList = arrayList;
        this.listener=listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView surahNameArab;
        private TextView surahNameEnglish;
        private TextView surahNumber;

        public MyViewHolder(final View view) {
            super(view);
            surahNameArab = view.findViewById(R.id.SurahNameArab);
            surahNameEnglish = view.findViewById(R.id.SurahNameEnglish);
            surahNumber = view.findViewById(R.id.surahNumber);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public main_item_solo_adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item_solo, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull main_item_solo_adaptor.MyViewHolder holder, int position) {
        String SurahNameArab = arrayList.get(position).getSurahNameArab();
        String SurahNameEnglish = arrayList.get(position).getSurahNameEnglish();
        String SurahNumber=arrayList.get(position).getSurahNumber();
        holder.surahNameArab.setText(SurahNameArab);
        holder.surahNameEnglish.setText(SurahNameEnglish);
        holder.surahNumber.setText(SurahNumber);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }
}
