package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class hayvanlarsayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlarsayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Hayvanlar-35");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.yarasa,"Bat","Yarasa"));
        lsKelime.add(new Kelime(R.drawable.ayi,"Bear","Ayı"));
        lsKelime.add(new Kelime(R.drawable.boga,"Bull","Boğa"));
        lsKelime.add(new Kelime(R.drawable.deve,"Camel","Deve"));
        lsKelime.add(new Kelime(R.drawable.kedi,"Cat","Kedi"));
        lsKelime.add(new Kelime(R.drawable.bukalemun,"Chameleon","Bukalemun"));
        lsKelime.add(new Kelime(R.drawable.inek,"Cow","İnek"));
        lsKelime.add(new Kelime(R.drawable.timsah,"Crocodile","Timsah"));
        lsKelime.add(new Kelime(R.drawable.geyik,"Deer","Geyik"));
        lsKelime.add(new Kelime(R.drawable.kopek,"Dog","Köpek"));
        lsKelime.add(new Kelime(R.drawable.yunus,"Dolphin","Yunus"));
        lsKelime.add(new Kelime(R.drawable.esek,"Donkey","Eşek"));
        lsKelime.add(new Kelime(R.drawable.fil,"Elephant","Fil"));
        lsKelime.add(new Kelime(R.drawable.balik,"Fish","Balık"));
        lsKelime.add(new Kelime(R.drawable.tilki,"Fox","Tilki"));
        lsKelime.add(new Kelime(R.drawable.kurbaga,"Frog","Kurbağa"));
        lsKelime.add(new Kelime(R.drawable.zurafa,"Giraffe","Zürafa"));
        lsKelime.add(new Kelime(R.drawable.keci,"Goat","Keçi"));
        lsKelime.add(new Kelime(R.drawable.goril,"Gorilla","Goril"));
        lsKelime.add(new Kelime(R.drawable.suaygiri,"Hippo","Su aygırı"));
        lsKelime.add(new Kelime(R.drawable.at,"Horse","At"));
        lsKelime.add(new Kelime(R.drawable.kanguru,"Kangaroo","Kanguru"));
        lsKelime.add(new Kelime(R.drawable.aslan,"Lion","Aslan"));
        lsKelime.add(new Kelime(R.drawable.kertenkele,"Lizard","Kertenkele"));
        lsKelime.add(new Kelime(R.drawable.maymunn,"Monkey","Maymun"));
        lsKelime.add(new Kelime(R.drawable.tavsan,"Rabbit","Tavşan"));
        lsKelime.add(new Kelime(R.drawable.fok,"Seal","Fok"));
        lsKelime.add(new Kelime(R.drawable.koyun,"Sheep","Koyun"));
        lsKelime.add(new Kelime(R.drawable.yilan,"Snake","Yılan"));
        lsKelime.add(new Kelime(R.drawable.sincap,"Squirrel","Sincap"));
        lsKelime.add(new Kelime(R.drawable.kaplan,"Tiger","Kaplan"));
        lsKelime.add(new Kelime(R.drawable.kaplumbag,"Turtle","Kaplumbağa"));
        lsKelime.add(new Kelime(R.drawable.balina,"Whale","Balina"));
        lsKelime.add(new Kelime(R.drawable.kurt,"Wolf","Kurt"));
        lsKelime.add(new Kelime(R.drawable.zebra,"Zebra","Zebra"));

        adapter = new KelimeAdapter(this,lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.bat);

                } else if (position == 1) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.bear);
                } else if (position == 2) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.bull);
                } else if (position == 3) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.camel);
                } else if (position == 4) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.cat);
                } else if (position == 5) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.chameleon);
                } else if (position == 6) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.cow);
                } else if (position == 7) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.crocodile);
                } else if (position == 8) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.deer);
                } else if (position == 9) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.dog);
                } else if (position == 10) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.dolphin);
                } else if (position == 11) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.donkey);
                } else if (position == 12) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.elephant);
                } else if (position == 13) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.fish);
                } else if (position == 14) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.fox);
                } else if (position == 15) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.frog);
                } else if (position == 16) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.giraffe);
                } else if (position == 17) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.goat);
                } else if (position == 18) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.gorilla);
                } else if (position == 19) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.hippo);
                } else if (position == 20) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.horse);
                } else if (position == 21) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.kangaroo);
                } else if (position == 22) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.lion);
                } else if (position == 23) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.lizard);
                } else if (position == 24) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.monkey);
                } else if (position == 25) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.rabbit);
                } else if (position == 26) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.seal);
                } else if (position == 27) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.sheep);
                } else if (position == 28) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.snake);
                } else if (position == 29) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.squirrel);
                } else if (position == 30) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.tiger);
                } else if (position == 31) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.turtle);
                } else if (position == 32) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.whale);
                } else if (position == 33) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.wolf);
                } else if (position == 34) {

                    mediaPlayer = MediaPlayer.create(hayvanlarsayfa.this, R.raw.zebra);
                }

                mediaPlayer.start();
            }

           }
        );


    }
        }
