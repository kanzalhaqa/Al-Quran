package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class all_in_one_surrah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_in_one_surrah);

        String suraNameOnnewAct= "USerNAmrjfn";

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            suraNameOnnewAct=extras.getString("suraNameOnnewAct");
        }
        TextView nametext= findViewById(R.id.textView);
nametext.setText(suraNameOnnewAct);

    }
}