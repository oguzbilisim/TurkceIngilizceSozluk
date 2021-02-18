package com.example.myapplication;

public class Kelime {

    private int avatar;
    private String kelimeingilizcesi;
    private String kelimeturkcesi;

    public Kelime(int avatar, String kelimeingilizcesi, String kelimeturkcesi) {
        this.avatar = avatar;
        this.kelimeingilizcesi = kelimeingilizcesi;
        this.kelimeturkcesi = kelimeturkcesi;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getKelimeingilizcesi() {
        return kelimeingilizcesi;
    }

    public void setKelimeingilizcesi(String kelimeingilizcesi) {
        this.kelimeingilizcesi = kelimeingilizcesi;
    }

    public String getKelimeturkcesi() {
        return kelimeturkcesi;
    }

    public void setKelimeturkcesi(String kelimeturkcesi) {
        this.kelimeturkcesi = kelimeturkcesi;
    }
}
