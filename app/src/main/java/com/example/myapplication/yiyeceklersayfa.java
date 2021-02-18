package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class yiyeceklersayfa extends AppCompatActivity {

    private ListView lv;
    private KelimeAdapter adapter;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyeceklersayfa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Yiyecekler-80");

        lv = findViewById(R.id.lv);

        List<Kelime> lsKelime = new ArrayList<>();
        lsKelime.add(new Kelime(R.drawable.elma, "Apple", "Elma"));
        lsKelime.add(new Kelime(R.drawable.kayisi, "Apricot", "Kayısı"));
        lsKelime.add(new Kelime(R.drawable.avokado, "Avocado", "Avokado"));
        lsKelime.add(new Kelime(R.drawable.muz, "Banana", "Muz"));
        lsKelime.add(new Kelime(R.drawable.bogurtlen, "Blackberry", "Böğürtlen"));
        lsKelime.add(new Kelime(R.drawable.haslanmisyumurta, "Boiled egg", "Haşlanmış yumurta"));
        lsKelime.add(new Kelime(R.drawable.ekmek, "Bread", "Ekmek"));
        lsKelime.add(new Kelime(R.drawable.tereyag, "Butter", "Tereyağı"));
        lsKelime.add(new Kelime(R.drawable.kek, "Cake", "Kek"));
        lsKelime.add(new Kelime(R.drawable.seker, "Candy", "Şeker"));
        lsKelime.add(new Kelime(R.drawable.havuc, "Carrot", "Havuç"));
        lsKelime.add(new Kelime(R.drawable.peynir, "Cheese", "Peynir"));
        lsKelime.add(new Kelime(R.drawable.kiraz, "Cherry", "Kiraz"));
        lsKelime.add(new Kelime(R.drawable.cikolata, "Chocolate", "Çikolata"));
        lsKelime.add(new Kelime(R.drawable.hindistanceviz, "Coconut", "Hindistan cevizi"));
        lsKelime.add(new Kelime(R.drawable.kahve, "Coffee", "Kahve"));
        lsKelime.add(new Kelime(R.drawable.kola, "Coke", "Kola"));
        lsKelime.add(new Kelime(R.drawable.kurabiye, "Cookie", "Kurabiye"));
        lsKelime.add(new Kelime(R.drawable.misir, "Corn", "Mısır"));
        lsKelime.add(new Kelime(R.drawable.salatalik, "Cucumber", "Salatalık"));
        lsKelime.add(new Kelime(R.drawable.kek, "Dessert", "Tatlı"));
        lsKelime.add(new Kelime(R.drawable.yumurta, "Egg", "Yumurta"));
        lsKelime.add(new Kelime(R.drawable.incir, "Fig", "İncir"));
        lsKelime.add(new Kelime(R.drawable.patateskizartmasi, "French fries", "Patates kızartması"));
        lsKelime.add(new Kelime(R.drawable.sarimsak, "Garlic", "Sarımsak"));
        lsKelime.add(new Kelime(R.drawable.greyfurt, "Grapefruit", "Greyfurt"));
        lsKelime.add(new Kelime(R.drawable.uzum, "Grapes", "Üzüm"));
        lsKelime.add(new Kelime(R.drawable.sakiz, "Gum", "Sakız"));
        lsKelime.add(new Kelime(R.drawable.et, "Ham", "Jambon"));
        lsKelime.add(new Kelime(R.drawable.findik, "Hazelnut", "Fındık"));
        lsKelime.add(new Kelime(R.drawable.bal, "Honey", "Bal"));
        lsKelime.add(new Kelime(R.drawable.hotdog, "Hot dog", "Sosisli"));
        lsKelime.add(new Kelime(R.drawable.dondurma, "Ice cream", "Dondurma"));
        lsKelime.add(new Kelime(R.drawable.recel, "Jam", "Reçel"));
        lsKelime.add(new Kelime(R.drawable.meyvesuyu, "Juice", "Meyve suyu"));
        lsKelime.add(new Kelime(R.drawable.ketcap, "Ketchup", "Ketçap"));
        lsKelime.add(new Kelime(R.drawable.limon, "Lemon", "Limon"));
        lsKelime.add(new Kelime(R.drawable.limonata, "Lemonade", "Limonata"));
        lsKelime.add(new Kelime(R.drawable.seker, "Lollipop", "Lolipop"));
        lsKelime.add(new Kelime(R.drawable.et, "Meat", "Et"));
        lsKelime.add(new Kelime(R.drawable.kavun, "Melon", "Kavun"));
        lsKelime.add(new Kelime(R.drawable.sut, "Milk", "Süt"));
        lsKelime.add(new Kelime(R.drawable.milkshake, "Milkshake", "Milkshake"));
        lsKelime.add(new Kelime(R.drawable.mantar, "Mushroom", "Mantar"));
        lsKelime.add(new Kelime(R.drawable.kuruyemis, "Nut", "Kuruyemiş"));
        lsKelime.add(new Kelime(R.drawable.zeytin, "Olive", "Zeytin"));
        lsKelime.add(new Kelime(R.drawable.sogan, "Onion", "Soğan"));
        lsKelime.add(new Kelime(R.drawable.portakal, "Orange", "Portakal"));
        lsKelime.add(new Kelime(R.drawable.makarna, "Pasta", "Makarna"));
        lsKelime.add(new Kelime(R.drawable.seftali, "Peach", "Şeftali"));
        lsKelime.add(new Kelime(R.drawable.armut, "Pear", "Armut"));
        lsKelime.add(new Kelime(R.drawable.bezelye, "Peas", "Bezelye"));
        lsKelime.add(new Kelime(R.drawable.biber, "Pepper", "Biber"));
        lsKelime.add(new Kelime(R.drawable.tursu, "Pickle", "Turşu"));
        lsKelime.add(new Kelime(R.drawable.ananas, "Pineapple", "Ananas"));
        lsKelime.add(new Kelime(R.drawable.pizza, "Pizza", "Pizza"));
        lsKelime.add(new Kelime(R.drawable.erik, "Plum", "Erik"));
        lsKelime.add(new Kelime(R.drawable.nar, "Pomegranate", "Nar"));
        lsKelime.add(new Kelime(R.drawable.patlamismisir, "Popcorn", "Patlamış mısır"));
        lsKelime.add(new Kelime(R.drawable.patates, "Potato", "Patates"));
        lsKelime.add(new Kelime(R.drawable.cips, "Potato chip", "Patates cipsi"));
        lsKelime.add(new Kelime(R.drawable.kabak, "Pumpkin", "Kabak"));
        lsKelime.add(new Kelime(R.drawable.ayva, "Quince", "Ayva"));
        lsKelime.add(new Kelime(R.drawable.turp, "Radish", "Turp"));
        lsKelime.add(new Kelime(R.drawable.ahududu, "Raspberry", "Ahududu"));
        lsKelime.add(new Kelime(R.drawable.tuz, "Salt", "Tuz"));
        lsKelime.add(new Kelime(R.drawable.sosis, "Sausage", "Sosis"));
        lsKelime.add(new Kelime(R.drawable.omlet, "Scrambled eggs", "Omlet"));
        lsKelime.add(new Kelime(R.drawable.cekirdek, "Seed", "Çekirdek"));
        lsKelime.add(new Kelime(R.drawable.dilim, "Slice", "Dilim"));
        lsKelime.add(new Kelime(R.drawable.corba, "Soup", "Çorba"));
        lsKelime.add(new Kelime(R.drawable.cilek, "Strawberry", "Çilek"));
        lsKelime.add(new Kelime(R.drawable.caysekeri, "Sugar", "Şeker"));
        lsKelime.add(new Kelime(R.drawable.mandalina, "Tangerine", "Mandalina"));
        lsKelime.add(new Kelime(R.drawable.cay, "Tea", "Çay"));
        lsKelime.add(new Kelime(R.drawable.domates, "Tomato", "Domates"));
        lsKelime.add(new Kelime(R.drawable.ceviz, "Walnut", "Ceviz"));
        lsKelime.add(new Kelime(R.drawable.su, "Water", "Su"));
        lsKelime.add(new Kelime(R.drawable.karpuz, "Watermelon", "Karpuz"));
        lsKelime.add(new Kelime(R.drawable.yogurt, "Yoghurt", "Yoğurt"));


        adapter = new KelimeAdapter(this, lsKelime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                          if (position == 0) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.apple);
                                          } else if (position == 1) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.apricot);
                                          } else if (position == 2) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.avocado);
                                          } else if (position == 3) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.banana);
                                          } else if (position == 4) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.blackberry);
                                          } else if (position == 5) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.boiledegg);
                                          } else if (position == 6) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.bread);
                                          } else if (position == 7) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.butter);
                                          } else if (position == 8) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.cake);
                                          } else if (position == 9) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.candy);
                                          } else if (position == 10) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.carrot);
                                          } else if (position == 11) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.cheese);
                                          } else if (position == 12) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.cherry);
                                          } else if (position == 13) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.chocolate);
                                          } else if (position == 14) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.coconut);
                                          } else if (position == 15) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.coffee);
                                          } else if (position == 16) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.coke);
                                          } else if (position == 17) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.cookie);
                                          } else if (position == 18) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.corn);
                                          } else if (position == 19) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.cucumber);
                                          } else if (position == 20) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.dessert);
                                          } else if (position == 21) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.egg);
                                          } else if (position == 22) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.fig);
                                          } else if (position == 23) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.frenchfries);
                                          } else if (position == 24) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.garlic);
                                          } else if (position == 25) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.grapefruit);
                                          } else if (position == 26) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.grapes);
                                          } else if (position == 27) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.gum);
                                          } else if (position == 28) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.ham);
                                          } else if (position == 29) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.hazelnut);
                                          } else if (position == 30) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.honey);
                                          } else if (position == 31) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.hotdog);
                                          } else if (position == 32) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.icecream);
                                          } else if (position == 33) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.jam);
                                          } else if (position == 34) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.juice);
                                          } else if (position == 35) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.ketchup);
                                          } else if (position == 36) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.lemon);
                                          } else if (position == 37) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.lemonade);
                                          } else if (position == 38) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.lollipop);
                                          } else if (position == 39) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.meat);
                                          } else if (position == 40) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.melon);
                                          } else if (position == 41) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.milk);
                                          } else if (position == 42) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.milkshake);
                                          } else if (position == 43) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.mushroom);
                                          } else if (position == 44) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.nut);
                                          } else if (position == 45) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.olive);
                                          } else if (position == 46) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.onion);
                                          } else if (position == 47) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.orange);
                                          } else if (position == 48) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pasta);
                                          } else if (position == 49) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.peach);
                                          } else if (position == 50) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pear);
                                          } else if (position == 51) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.peas);

                                          }  else if (position == 52) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pepper);
                                          }

                                          else if (position == 53) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pickle);
                                          } else if (position == 54) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pineapple);
                                          } else if (position == 55) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pizza);
                                          } else if (position == 56) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.plum);
                                          } else if (position == 57) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pomegranate);
                                          } else if (position == 58) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.popcorn);
                                          } else if (position == 59) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.potato);
                                          } else if (position == 60) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.potatochip);
                                          } else if (position == 61) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.pumpkin);
                                          } else if (position == 62) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.quince);
                                          } else if (position == 63) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.radish);
                                          } else if (position == 64) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.raspberry);
                                          } else if (position == 65) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.salt);
                                          } else if (position == 66) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.sausage);
                                          } else if (position == 67) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.scrambledeggs);
                                          } else if (position == 68) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.seed);
                                          } else if (position == 69) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.slice);
                                          } else if (position == 70) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.soup);
                                          } else if (position == 71) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.strawberry);
                                          } else if (position == 72) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.sugar);
                                          } else if (position == 73) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.tangerine);
                                          } else if (position == 74) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.tea);
                                          } else if (position == 75) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.tomato);
                                          } else if (position == 76) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.walnut);
                                          } else if (position == 77) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.water);
                                          } else if (position == 78) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.watermelon);
                                          } else if (position == 79) {

                                              mediaPlayer = MediaPlayer.create(yiyeceklersayfa.this, R.raw.yoghurt);
                                          }

                                          mediaPlayer.start();
                                      }

                                  }
        );
    }
}
