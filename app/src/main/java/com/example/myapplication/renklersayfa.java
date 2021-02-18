package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class renklersayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renklersayfa);
        lv = findViewById(R.id.lv);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Renkler-15");

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.siyah,"Black","Siyah"));
        lsKelime.add(new Kelime(R.drawable.mavi,"Blue","Mavi"));
        lsKelime.add(new Kelime(R.drawable.kahverengi,"Brown","Kahverengi"));
        lsKelime.add(new Kelime(R.drawable.yesil,"Green","Yeşil"));
        lsKelime.add(new Kelime(R.drawable.gri,"Grey","Gri"));
        lsKelime.add(new Kelime(R.drawable.bordo,"Maroon","Bordo"));
        lsKelime.add(new Kelime(R.drawable.lacivert,"Navyblue","Lacivert"));
        lsKelime.add(new Kelime(R.drawable.turuncu,"Orange","Turuncu"));
        lsKelime.add(new Kelime(R.drawable.pembe,"Pink","Pembe"));
        lsKelime.add(new Kelime(R.drawable.mor,"Purple","Mor"));
        lsKelime.add(new Kelime(R.drawable.kirmizi,"Red","Kırmızı"));
        lsKelime.add(new Kelime(R.drawable.turkuaz,"Turquoise","Turkuaz"));
        lsKelime.add(new Kelime(R.drawable.eflatun,"Violet","Eflatun"));
        lsKelime.add(new Kelime(R.drawable.beyaz,"White","Beyaz"));
        lsKelime.add(new Kelime(R.drawable.sari,"Yellow","Sarı"));

        adapter = new KelimeAdapter(this,lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.black);

                }
                else if(position==1){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.blue);
                }
                else if(position==2){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.brown);
                }
                else if(position==3){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.green);
                }
                else if(position==4){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.grey);
                }
                else if(position==5){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.maroon);
                }
                else if(position==6){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.navyblue);
                }
                else if(position==7){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.orange);
                }
                else if(position==8){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.pink);
                }
                else if(position==9){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.purple);
                }
                else if(position==10){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.red);
                }
                else if(position==11){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.turquoise);
                }
                else if(position==12){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.violet);
                }
                else if(position==13){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.white);
                }
                else if(position==14){

                    mediaPlayer = MediaPlayer.create(renklersayfa.this,R.raw.yellow);
                }

                mediaPlayer.start();
            }

        });


    }
}
