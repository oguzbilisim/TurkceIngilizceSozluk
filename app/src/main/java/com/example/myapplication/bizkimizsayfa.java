package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class bizkimizsayfa extends AppCompatActivity {

    ImageView instaimgg,twitimgg,mailimgg;
    TextView instatxtt,twittxtt,mailtxtt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bizkimizsayfa);

        instaimgg = findViewById(R.id.instaimg);
        twitimgg = findViewById(R.id.twitterimg);
        mailimgg = findViewById(R.id.mailimg);
        instatxtt = findViewById(R.id.instatxt);
        twittxtt = findViewById(R.id.twittertxt);
        mailtxtt = findViewById(R.id.mailtxt);

        instaimgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        twitimgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mailimgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        instatxtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        twittxtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mailtxtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Biz Kimiz");


    }
}
