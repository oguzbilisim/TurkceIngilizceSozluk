package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class okulsayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okulsayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Okul-30");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.toplama,"Addition","Artı"));
        lsKelime.add(new Kelime(R.drawable.canta,"Bag","Çanta"));
        lsKelime.add(new Kelime(R.drawable.karatahta,"Blackboard","Kara tahta"));
        lsKelime.add(new Kelime(R.drawable.tebesir,"Chalk","Tebeşir"));
        lsKelime.add(new Kelime(R.drawable.kimya,"Chemistry","Kimya"));
        lsKelime.add(new Kelime(R.drawable.sinif,"Classroom","Sınıf"));
        lsKelime.add(new Kelime(R.drawable.sira,"Desk","Sıra"));
        lsKelime.add(new Kelime(R.drawable.bolme,"Division","Bölme"));
        lsKelime.add(new Kelime(R.drawable.sinav,"Exam","Sınav"));
        lsKelime.add(new Kelime(R.drawable.mudur,"Headmaster","Okul müdürü"));
        lsKelime.add(new Kelime(R.drawable.mudure,"Headmistress","Okul müdiresi"));
        lsKelime.add(new Kelime(R.drawable.lise,"Highs shool","Lise"));
        lsKelime.add(new Kelime(R.drawable.evodevi,"Homework","Ev ödevi"));
        lsKelime.add(new Kelime(R.drawable.laborotuvar,"Laboratory","Laboratuvar"));
        lsKelime.add(new Kelime(R.drawable.ogrenmek,"Learn","Öğrenmek"));
        lsKelime.add(new Kelime(R.drawable.ogretmen,"Lesson","Ders"));
        lsKelime.add(new Kelime(R.drawable.kutuphane,"Library","Kütüphane"));
        lsKelime.add(new Kelime(R.drawable.matematik,"Maths","Matematik"));
        lsKelime.add(new Kelime(R.drawable.carpma,"Multiplication","Çarpma"));
        lsKelime.add(new Kelime(R.drawable.ogrenci,"Nursery school","Ana okul"));
        lsKelime.add(new Kelime(R.drawable.ogrenci,"Primary school","İlk okul"));
        lsKelime.add(new Kelime(R.drawable.ogrenci,"School","Okul"));
        lsKelime.add(new Kelime(R.drawable.fen,"Science","Fen"));
        lsKelime.add(new Kelime(R.drawable.ogrenci,"Secondary school","Orta okul"));
        lsKelime.add(new Kelime(R.drawable.ogrenci,"Student","Öğrenci"));
        lsKelime.add(new Kelime(R.drawable.eksi,"Subtraction","Çıkarma"));
        lsKelime.add(new Kelime(R.drawable.ogretmen,"Teacher","Öğretmen"));
        lsKelime.add(new Kelime(R.drawable.test,"Test","Test"));
        lsKelime.add(new Kelime(R.drawable.universite,"University","Üniversite"));
        lsKelime.add(new Kelime(R.drawable.beyaztahta,"White board","Beyaz tahta"));


        adapter = new KelimeAdapter(this,lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.addition);

                }
                else if(position==1){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.bag);
                }
                else if(position==2){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.blackboard);
                }
                else if(position==3){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.chalk);
                }
                else if(position==4){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.chemistry);
                }
                else if(position==5){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.classroom);
                }
                else if(position==6){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.desk);
                }
                else if(position==7){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.division);
                }
                else if(position==8){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.exam);
                }
                else if(position==9){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.headmaster);
                }
                else if(position==10){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.headmistress);
                }
                else if(position==11){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.highschool);
                }
                else if(position==12){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.homework);
                }
                else if(position==13){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.laboratory);
                }
                else if(position==14){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.learn);
                }
                else if(position==15){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.lesson);
                }
                else if(position==16){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.library);
                }
                else if(position==17){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.maths);
                }
                else if(position==18){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.multiplication);
                }
                else if(position==19){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.nurseryschool);
                }
                else if(position==20){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.primaryschool);
                }
                else if(position==21){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.school);
                }
                else if(position==22){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.science);
                }
                else if(position==23){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.secondaryschool);
                }
                else if(position==24){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.student);
                }
                else if(position==25){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.subtraction);
                }
                else if(position==26){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.teacher);
                }
                else if(position==27){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.test);
                }
                else if(position==28){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.university);
                }
                else if(position==29){

                    mediaPlayer = MediaPlayer.create(okulsayfa.this,R.raw.whiteboard);
                }

                mediaPlayer.start();
            }

        });

    }
}
