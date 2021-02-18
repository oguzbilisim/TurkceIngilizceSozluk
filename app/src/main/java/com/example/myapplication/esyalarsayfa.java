package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class esyalarsayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esyalarsayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Eşyalar-50");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.koltuk,"Armchair","Koltuk"));
        lsKelime.add(new Kelime(R.drawable.kuvet,"Bathhub","Kuvet"));
        lsKelime.add(new Kelime(R.drawable.banyo,"Bathroom","Banyo"));
        lsKelime.add(new Kelime(R.drawable.yatak,"Bed","Yatak"));
        lsKelime.add(new Kelime(R.drawable.yatakodasi,"Bedroom","Yatak odası"));
        lsKelime.add(new Kelime(R.drawable.copkutusu,"Bin","Çöp"));
        lsKelime.add(new Kelime(R.drawable.kitaplik,"Bookshelf","Kitaplık"));
        lsKelime.add(new Kelime(R.drawable.sise,"Bottle","Şişe"));
        lsKelime.add(new Kelime(R.drawable.supurge,"Broom","Süpürge"));
        lsKelime.add(new Kelime(R.drawable.hali,"Carpet","Halı"));
        lsKelime.add(new Kelime(R.drawable.sandalye,"Chair","Sandalye"));
        lsKelime.add(new Kelime(R.drawable.avize,"Chandelier","Avize"));
        lsKelime.add(new Kelime(R.drawable.saat,"Clock","Saat"));
        lsKelime.add(new Kelime(R.drawable.tarak,"Comb","Tarak"));
        lsKelime.add(new Kelime(R.drawable.fincan,"Cup","Fincan"));
        lsKelime.add(new Kelime(R.drawable.dolap,"Cupboard","Dolap"));
        lsKelime.add(new Kelime(R.drawable.perde,"Curtain","Perde"));
        lsKelime.add(new Kelime(R.drawable.surahi,"Decanter","Sürahi"));
        lsKelime.add(new Kelime(R.drawable.masa,"Desk","Sıra"));
        lsKelime.add(new Kelime(R.drawable.tabak,"Dish","Tabak"));
        lsKelime.add(new Kelime(R.drawable.bulasikmakinesi,"Dishwasher","Bulaşık makinesi"));
        lsKelime.add(new Kelime(R.drawable.kapi,"Door","Kapı"));
        lsKelime.add(new Kelime(R.drawable.cekmece,"Drawer","Çekmece"));
        lsKelime.add(new Kelime(R.drawable.mutfakrobotu,"Food proccessor","Mutfak robotu"));
        lsKelime.add(new Kelime(R.drawable.catal,"Fork","Çatal"));
        lsKelime.add(new Kelime(R.drawable.bardak,"Glass","Bardak"));
        lsKelime.add(new Kelime(R.drawable.isitici,"Heater","Isıtıcı"));
        lsKelime.add(new Kelime(R.drawable.utu,"Iron","Ütü"));
        lsKelime.add(new Kelime(R.drawable.mutfak,"Kitchen","Mutfak"));
        lsKelime.add(new Kelime(R.drawable.bicak,"Knife","Bıçak"));
        lsKelime.add(new Kelime(R.drawable.lamba,"Lamp","Lamba"));
        lsKelime.add(new Kelime(R.drawable.oturmaodasi,"Living Room","Oturma odası"));
        lsKelime.add(new Kelime(R.drawable.ayna,"Mirror","Ayna"));
        lsKelime.add(new Kelime(R.drawable.firin,"Oven","Fırın"));
        lsKelime.add(new Kelime(R.drawable.yastik,"Pillow","Yastık"));
        lsKelime.add(new Kelime(R.drawable.buzdolabi,"Refrigerator","Buzdolabı"));
        lsKelime.add(new Kelime(R.drawable.oturmaodasi,"Room","Oda"));
        lsKelime.add(new Kelime(R.drawable.makas,"Scissors","Makas"));
        lsKelime.add(new Kelime(R.drawable.sackurutma,"Spin dryer","Kurutma makinesi"));
        lsKelime.add(new Kelime(R.drawable.kasik,"Spoon","Kaşık"));
        lsKelime.add(new Kelime(R.drawable.masa,"Table","Masa"));
        lsKelime.add(new Kelime(R.drawable.musluk,"Tap","Musluk"));
        lsKelime.add(new Kelime(R.drawable.telefon,"Telephone","Telefon"));
        lsKelime.add(new Kelime(R.drawable.televizyon,"Tv,Television","Televizyon"));
        lsKelime.add(new Kelime(R.drawable.tuvalet,"Toilet","Tuvalet"));
        lsKelime.add(new Kelime(R.drawable.elfeneri,"Torch","El Feneri"));
        lsKelime.add(new Kelime(R.drawable.havlu,"Towel","Havlu"));
        lsKelime.add(new Kelime(R.drawable.elektriklisupurge,"Vacuum cleaner","Elektrikli Süpürge"));
        lsKelime.add(new Kelime(R.drawable.camasirmakinesi,"Washingmachine","Çamaşır makinesi"));
        lsKelime.add(new Kelime(R.drawable.pencere,"Window","Pencere"));


        adapter = new KelimeAdapter(this,lsKelime);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.armchair);

                }
                else if(position==1){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bathhub);
                }
                else if(position==2){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bathroom);
                }
                else if(position==3){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bed);
                }
                else if(position==4){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bedroom);
                }
                else if(position==5){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bin);
                }
                else if(position==6){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bookshelf);
                }
                else if(position==7){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.bottle);
                }
                else if(position==8){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.broom);
                }
                else if(position==9){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.carpet);
                }
                else if(position==10){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.chair);
                }
                else if(position==11){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.chandelier);
                }
                else if(position==12){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.clock);
                }
                else if(position==13){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.comb);
                }
                else if(position==14){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.cup);
                }
                else if(position==15){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.cupboard);
                }
                else if(position==16){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.curtain);
                }
                else if(position==17){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.decanter);
                }
                else if(position==18){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.desk);
                }
                else if(position==19){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.dish);
                }
                else if(position==20){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.dishwasher);
                }
                else if(position==21){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.door);
                }
                else if(position==22){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.drawer);
                }
                else if(position==23){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.foodproccessor);
                }
                else if(position==24){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.fork);
                }
                else if(position==25){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.glass);
                }
                else if(position==26){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.heater);
                }
                else if(position==27){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.iron);
                }
                else if(position==28){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.kitchen);
                }
                else if(position==29){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.knife);
                }
                else if(position==30){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.lamp);
                }
                else if(position==31){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.livingroom);
                }
                else if(position==32){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.mirror);
                }
                else if(position==33){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.oven);
                }
                else if(position==34){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.pillow);
                }
                else if(position==35){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.refrigerator);
                }
                else if(position==36){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.room);
                }
                else if(position==37){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.scissors);
                }
                else if(position==38){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.spindryer);
                }
                else if(position==39){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.spoon);
                }
                else if(position==40){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.table);
                }
                else if(position==41){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.tap);
                }
                else if(position==42){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.telephone);
                }
                else if(position==43){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.television);
                }
                else if(position==44){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.toilet);
                }
                else if(position==45){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.torch);
                }
                else if(position==46){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.towel);
                }
                else if(position==47){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.vacuumcleaner);
                }
                else if(position==48){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.washingmachine);
                }
                else if(position==49){

                    mediaPlayer = MediaPlayer.create(esyalarsayfa.this,R.raw.window);
                }


                mediaPlayer.start();
            }

        }
        );




    }

}
