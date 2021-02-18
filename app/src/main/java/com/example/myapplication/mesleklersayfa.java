package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mesleklersayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesleklersayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Meslekler-45");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.aktor,"Actor","Aktör"));
        lsKelime.add(new Kelime(R.drawable.aktris,"Actress","Aktris"));
        lsKelime.add(new Kelime(R.drawable.ajan,"Agent","Ajan"));
        lsKelime.add(new Kelime(R.drawable.spiker,"Announcer","Spiker"));
        lsKelime.add(new Kelime(R.drawable.mimar,"Architect","Mimar"));
        lsKelime.add(new Kelime(R.drawable.kosu,"Athlete","Atlet"));
        lsKelime.add(new Kelime(R.drawable.firin,"Baker","Fırıncı"));
        lsKelime.add(new Kelime(R.drawable.bankaci,"Banker","Bankacı"));
        lsKelime.add(new Kelime(R.drawable.kasiyer,"Cashier","Kasiyer"));
        lsKelime.add(new Kelime(R.drawable.asci,"Cook","Aşçı"));
        lsKelime.add(new Kelime(R.drawable.disci,"Dentist","Dişçi"));
        lsKelime.add(new Kelime(R.drawable.doktor,"Doctor","Doktor"));
        lsKelime.add(new Kelime(R.drawable.sofor,"Driver","Şoför"));
        lsKelime.add(new Kelime(R.drawable.muhendis,"Engineer","Mühendis"));
        lsKelime.add(new Kelime(R.drawable.ciftci,"Farmer","Çiftçi"));
        lsKelime.add(new Kelime(R.drawable.itfaiye,"Fireman","İtfaiyeci"));
        lsKelime.add(new Kelime(R.drawable.bahcivan,"Gardener","Bahçıvan"));
        lsKelime.add(new Kelime(R.drawable.bakkal,"Grocer","Bakkal"));
        lsKelime.add(new Kelime(R.drawable.kuafor,"Hairdresser","Kuaför"));
        lsKelime.add(new Kelime(R.drawable.evhanimi,"Housewife","Ev hanımı"));
        lsKelime.add(new Kelime(R.drawable.avukat,"Lawyer","Avukat"));
        lsKelime.add(new Kelime(R.drawable.cilingir,"Locksmith","Çilingir"));
        lsKelime.add(new Kelime(R.drawable.madenci,"Miner","Madenci"));
        lsKelime.add(new Kelime(R.drawable.muzisyen,"Musician","Müzisyen"));
        lsKelime.add(new Kelime(R.drawable.hemsire,"Nurse","Hemşire"));
        lsKelime.add(new Kelime(R.drawable.ressam,"Painter","Ressam"));
        lsKelime.add(new Kelime(R.drawable.tesisatci,"Plumber","Tesisatçı"));
        lsKelime.add(new Kelime(R.drawable.polis,"Police","Polis"));
        lsKelime.add(new Kelime(R.drawable.postaci,"Postman","Postacı"));
        lsKelime.add(new Kelime(R.drawable.baskan,"President","Baskan"));
        lsKelime.add(new Kelime(R.drawable.yazilimci,"Programmer","Yazılımcı"));
        lsKelime.add(new Kelime(R.drawable.psikolog,"Psychologist","Psikolog"));
        lsKelime.add(new Kelime(R.drawable.hakem,"Referee","Hakem"));
        lsKelime.add(new Kelime(R.drawable.muhabir,"Reporter","Muhabir"));
        lsKelime.add(new Kelime(R.drawable.emekli,"Retired","Emekli"));
        lsKelime.add(new Kelime(R.drawable.bilimadami,"Scientist","Bilim adamı"));
        lsKelime.add(new Kelime(R.drawable.hizmetci,"Servant","Hizmetçi"));
        lsKelime.add(new Kelime(R.drawable.sarkici,"Singer","Şarkıcı"));
        lsKelime.add(new Kelime(R.drawable.asker,"Soldier","Asker"));
        lsKelime.add(new Kelime(R.drawable.terzi,"Tailor","Terzi"));
        lsKelime.add(new Kelime(R.drawable.ogretmen,"Teacher","Öğretmen"));
        lsKelime.add(new Kelime(R.drawable.issiz,"Unemployed","İşsiz"));
        lsKelime.add(new Kelime(R.drawable.veteriner,"Veterinary","Veteriner"));
        lsKelime.add(new Kelime(R.drawable.tesisatci,"Worker","İşçi"));
        lsKelime.add(new Kelime(R.drawable.yazici,"Writer","Yazar"));

        adapter = new KelimeAdapter(this,lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.actor);

                }
                else if(position==1){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.actress);
                }
                else if(position==2){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.agent);
                }
                else if(position==3){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.announcer);
                }
                else if(position==4){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.architect);
                }
                else if(position==5){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.athlete);
                }
                else if(position==6){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.baker);
                }
                else if(position==7){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.banker);
                }
                else if(position==8){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.cashier);
                }
                else if(position==9){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.cook);
                }
                else if(position==10){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.dentist);
                }
                else if(position==11){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.doctor);
                }
                else if(position==12){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.driver);
                }
                else if(position==13){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.engineer);
                }
                else if(position==14){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.farmer);
                }
                else if(position==15){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.fireman);
                }
                else if(position==16){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.gardener);
                }
                else if(position==17){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.grocer);
                }
                else if(position==18){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.hairdresser);
                }
                else if(position==19){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.housewife);
                }
                else if(position==20){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.lawyer);
                }
                else if(position==21){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.locksmith);
                }
                else if(position==22){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.miner);
                }
                else if(position==23){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.musician);
                }
                else if(position==24){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.nurse);
                }
                else if(position==25){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.painter);
                }
                else if(position==26){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.plumber);
                }
                else if(position==27){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.police);
                }
                else if(position==28){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.postman);
                }
                else if(position==29){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.president);
                }
                else if(position==30){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.programmer);
                }
                else if(position==31){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.psychologist);
                }
                else if(position==32){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.referee);
                }
                else if(position==33){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.reporter);
                }
                else if(position==34){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.retired);
                }
                else if(position==35){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.scientist);
                }
                else if(position==36){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.servant);
                }
                else if(position==37){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.singer);
                }
                else if(position==38){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.soldier);
                }
                else if(position==39){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.tailor);
                }
                else if(position==40){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.teacher);
                }
                else if(position==41){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.unemployed);
                }
                else if(position==42){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.veterinary);
                }
                else if(position==43){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.worker);
                }
                else if(position==44){

                    mediaPlayer = MediaPlayer.create(mesleklersayfa.this,R.raw.writer);
                }

                mediaPlayer.start();
            }

        });


    }
}
