package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class konularsayfa extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konularsayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Konular");

        btn1 = findViewById(R.id.esyalarbtn);
        btn2 = findViewById(R.id.hayvanlarbtn);
        btn3 = findViewById(R.id.konusmabtn);
        btn4 = findViewById(R.id.mesleklerbtn);
        btn5 = findViewById(R.id.okulbtn);
        btn6 = findViewById(R.id.renklerbtn);
        btn7 = findViewById(R.id.sporbtn);
        btn8 = findViewById(R.id.yiyeceklerbtn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,esyalarsayfa.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,hayvanlarsayfa.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,konusmasayfa.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,mesleklersayfa.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,okulsayfa.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,renklersayfa.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,sporsayfa.class);
                startActivity(intent);
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(konularsayfa.this,yiyeceklersayfa.class);
                startActivity(intent);
            }
        });



    }
}
