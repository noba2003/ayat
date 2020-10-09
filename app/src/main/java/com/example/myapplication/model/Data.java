package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
public class Data
{

    private List<Surahs> surahs;

    private Edition edition;

    public void setSurahs(List<Surahs> surahs){
        this.surahs = surahs;
    }
    public List<Surahs> getSurahs(){
        return this.surahs;
    }
    public void setEdition(Edition edition){
        this.edition = edition;
    }
    public Edition getEdition(){
        return this.edition;
    }
}