package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<main_item_solo> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerViewMain);

        arrayList = new ArrayList<>();
        setItemInfo();
        setItemAdaptor();


    }

    private void setItemAdaptor() {
        main_item_solo_adaptor adaptor = new main_item_solo_adaptor(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adaptor);
    }

    private void setItemInfo() {
        arrayList.add(new main_item_solo("hbvhv","njj"));
    }
}


// recycler tutorial
/*
Add recyclerview to main
Add list item xml
Add required things in item xml
Add new java Class to get and set text etc..
Add private String ---;
Generate constructor
Getter and setter
Add new class for Adaptor
Add --- extends RecyclerView.Adapter<recyclerAdaptor.MyViewHolder>
Then implement Method by highlighted text
Add private Arraylist<itemListClass> arraylistName;
edit---
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


add  in main activity
private ArrayList<main_item_solo> arrayList;
RecyclerView recyclerView;
below oncreate
recyclerView= findViewById(R.id.recyclerViewMain);
arrayList=new ArrayList<>():
  arrayList.add(new main_item_solo("hbvhv","njj"));

main_item_solo_adaptor adaptor = new main_item_solo_adaptor(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adaptor);

 */