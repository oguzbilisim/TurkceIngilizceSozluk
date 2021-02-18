package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class sporsayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sporsayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Spor-20");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.bedminton,"Badminton","Badminton"));
        lsKelime.add(new Kelime(R.drawable.beyzbol,"Baseball","Beyzbol"));
        lsKelime.add(new Kelime(R.drawable.basketbol,"Basketball","Basketbol"));
        lsKelime.add(new Kelime(R.drawable.bilardo,"Billiards","Bilardo"));
        lsKelime.add(new Kelime(R.drawable.bowling,"Bowling","Bowling"));
        lsKelime.add(new Kelime(R.drawable.boks,"Boxing","Boks"));
        lsKelime.add(new Kelime(R.drawable.bisikletyarisi,"Cycling","Bisiklet sürmek"));
        lsKelime.add(new Kelime(R.drawable.dalis,"Diving","Dalış"));
        lsKelime.add(new Kelime(R.drawable.futbol,"Football","Futbol"));
        lsKelime.add(new Kelime(R.drawable.golf,"Golf","Golf"));
        lsKelime.add(new Kelime(R.drawable.jimnastik,"Gymnastics","Jimnastik"));
        lsKelime.add(new Kelime(R.drawable.hentbol,"Handball","Hentbol"));
        lsKelime.add(new Kelime(R.drawable.hokey,"Hockey","Hokey"));
        lsKelime.add(new Kelime(R.drawable.kosu,"Jogging","Koşu yapmak"));
        lsKelime.add(new Kelime(R.drawable.karete,"Karate","Karate"));
        lsKelime.add(new Kelime(R.drawable.kayak,"Skiing","Kayak yapmak"));
        lsKelime.add(new Kelime(R.drawable.yuzme,"Swimming","Yüzme"));
        lsKelime.add(new Kelime(R.drawable.tenis,"Tennis","Tenis"));
        lsKelime.add(new Kelime(R.drawable.voleybol,"Volleyball","Voleybol"));
        lsKelime.add(new Kelime(R.drawable.gures,"Wrestling","Güreş"));

        adapter = new KelimeAdapter(this,lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.badminton);

                }
                else if(position==1){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.baseball);
                }
                else if(position==2){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.basketball);
                }
                else if(position==3){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.billiards);
                }
                else if(position==4){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.bowling);
                }
                else if(position==5){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.boxing);
                }
                else if(position==6){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.cycling);
                }
                else if(position==7){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.diving);
                }
                else if(position==8){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.football);
                }
                else if(position==9){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.golf);
                }
                else if(position==10){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.gymnastics);
                }
                else if(position==11){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.handball);
                }
                else if(position==12){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.hockey);
                }
                else if(position==13){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.jogging);
                }
                else if(position==14){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.karate);
                }
                else if(position==15){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.skiing);
                }
                else if(position==16){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.swimming);
                }
                else if(position==17){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.tennis);
                }
                else if(position==18){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.volleyball);
                }
                else if(position==19){

                    mediaPlayer = MediaPlayer.create(sporsayfa.this,R.raw.wrestling);
                }

                mediaPlayer.start();
            }

        });
    }
}
