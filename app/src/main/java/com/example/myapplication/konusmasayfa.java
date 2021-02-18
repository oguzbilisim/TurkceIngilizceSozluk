package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class konusmasayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konusmasayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Günlük Konuşma-25");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.kizgin, "Angry", "Kızgın"));
        lsKelime.add(new Kelime(R.drawable.tebrikler, "Congratulations", "Tebrikler"));
        lsKelime.add(new Kelime(R.drawable.afedersin, "Excuse me", "Afedersin"));
        lsKelime.add(new Kelime(R.drawable.gulegule, "Good bye", "Güle güle"));
        lsKelime.add(new Kelime(R.drawable.gunaydin, "Good morning", "Günaydın"));
        lsKelime.add(new Kelime(R.drawable.iyigeceler, "Goodnight", "İyi geceler"));
        lsKelime.add(new Kelime(R.drawable.merhaba, "Hello", "Merhaba"));
        lsKelime.add(new Kelime(R.drawable.selamm, "Hi", "Selam"));
        lsKelime.add(new Kelime(R.drawable.iyiyim, "I am fine", "İyiyim"));
        lsKelime.add(new Kelime(R.drawable.umrumdadegil, "I don't care", "Umrumda değil"));
        lsKelime.add(new Kelime(R.drawable.bilmiyorum, "I don't know", "Bilmiyorum"));
        lsKelime.add(new Kelime(R.drawable.uzgunum, "I'm sorry", "Üzgünüm"));
        lsKelime.add(new Kelime(R.drawable.calisiyorum, "I work", "Çalışıyorum"));
        lsKelime.add(new Kelime(R.drawable.saka, "Joke", "Şaka"));
        lsKelime.add(new Kelime(R.drawable.canli, "Live", "Canlı"));
        lsKelime.add(new Kelime(R.drawable.ask, "Love", "Aşk"));
        lsKelime.add(new Kelime(R.drawable.tanistigimamemnun, "Nice to meet you", "Tanıştığıma memnun oldum"));
        lsKelime.add(new Kelime(R.drawable.lutfen, "Please", "Lütfen"));
        lsKelime.add(new Kelime(R.drawable.uyku, "Sleep", "Uyku"));
        lsKelime.add(new Kelime(R.drawable.tesekkurler, "Thank you", "Teşekkürler"));
        lsKelime.add(new Kelime(R.drawable.dusunmek, "Thinks", "Düşünmek"));
        lsKelime.add(new Kelime(R.drawable.anladim, "Understand", "Anlamak"));
        lsKelime.add(new Kelime(R.drawable.hosgeldin, "Welcome", "Hoşgeldin"));
        lsKelime.add(new Kelime(R.drawable.naber, "What's up", "Naber"));
        lsKelime.add(new Kelime(R.drawable.sorunnedir, "What's wrong", "Sorun nedir?"));

        adapter = new KelimeAdapter(this, lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.angry);

                } else if (position == 1) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.congratulations);
                } else if (position == 2) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.excuseme);
                } else if (position == 3) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.goodbye);
                } else if (position == 4) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.goodmorning);
                } else if (position == 5) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.goodnight);
                } else if (position == 6) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.hello);
                } else if (position == 7) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.hi);
                } else if (position == 8) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.iamfine);
                } else if (position == 9) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.idontcare);
                } else if (position == 10) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.idontknow);
                } else if (position == 11) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.imsorry);
                } else if (position == 12) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.iwork);
                } else if (position == 13) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.joke);
                } else if (position == 14) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.live);
                } else if (position == 15) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.love);
                } else if (position == 16) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.nicetomeetyou);
                } else if (position == 17) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.please);
                } else if (position == 18) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.sleep);
                } else if (position == 19) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.thankyou);
                } else if (position == 20) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.think);
                } else if (position == 21) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.understand);
                } else if (position == 22) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.welcome);
                } else if (position == 23) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.whatsup);
                } else if (position == 24) {

                    mediaPlayer = MediaPlayer.create(konusmasayfa.this, R.raw.whatswrong);
                }
                mediaPlayer.start();
            }
        });
    }
}