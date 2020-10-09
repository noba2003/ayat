package com.example.myapplication.model;
public class Ayahs
{
    private int number;

    private String text;

    private int numberInSurah;

    private int juz;

    private int manzil;

    private int page;

    private int ruku;

    private int hizbQuarter;

    private Object sajda;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setNumberInSurah(int numberInSurah){
        this.numberInSurah = numberInSurah;
    }
    public int getNumberInSurah(){
        return this.numberInSurah;
    }
    public void setJuz(int juz){
        this.juz = juz;
    }
    public int getJuz(){
        return this.juz;
    }
    public void setManzil(int manzil){
        this.manzil = manzil;
    }
    public int getManzil(){
        return this.manzil;
    }
    public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setRuku(int ruku){
        this.ruku = ruku;
    }
    public int getRuku(){
        return this.ruku;
    }
    public void setHizbQuarter(int hizbQuarter){
        this.hizbQuarter = hizbQuarter;
    }
    public int getHizbQuarter(){
        return this.hizbQuarter;
    }
    public void setSajda(Object sajda){
        this.sajda = sajda;
    }
    public Object getSajda(){
        return this.sajda;
    }
}