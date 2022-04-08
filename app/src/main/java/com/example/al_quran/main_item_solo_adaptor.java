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

    private ArrayList<main_item_solo>arrayList;
    public main_item_solo_adaptor(ArrayList<main_item_solo>arrayList){
        this.arrayList=arrayList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
private TextView surahNameArab;
private TextView surahNameEnglish;
public MyViewHolder(final View view){
    super(view);
    surahNameArab=view.findViewById(R.id.SurahNameArab);
    surahNameEnglish=view.findViewById(R.id.SurahNameEnglish);
}
    }
    @NonNull
    @Override
    public main_item_solo_adaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item_solo,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull main_item_solo_adaptor.MyViewHolder holder, int position) {
String SurahNameArab= arrayList.get(position).getSurahNameArab();
String SurahNameEnglish= arrayList.get(position).getSurahNameEnglish();
holder.surahNameArab.setText(SurahNameArab);
holder.surahNameEnglish.setText(SurahNameEnglish);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
