package com.example.myapplication.model;

import com.example.myapplication.model.Ayahs;

import java.util.List;

public class Surahs
{
    private int number;

    private String name;

    private String englishName;

    private String englishNameTranslation;

    private String revelationType;

    private List<Ayahs> ayahs;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEnglishName(String englishName){
        this.englishName = englishName;
    }
    public String getEnglishName(){
        return this.englishName;
    }
    public void setEnglishNameTranslation(String englishNameTranslation){
        this.englishNameTranslation = englishNameTranslation;
    }
    public String getEnglishNameTranslation(){
        return this.englishNameTranslation;
    }
    public void setRevelationType(String revelationType){
        this.revelationType = revelationType;
    }
    public String getRevelationType(){
        return this.revelationType;
    }
    public void setAyahs(List<Ayahs> ayahs){
        this.ayahs = ayahs;
    }
    public List<Ayahs> getAyahs(){
        return this.ayahs;
    }
}
