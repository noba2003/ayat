package com.example.myapplication.model;

public class Edition {
    private String identifier;

    private String language;

    private String name;

    private String englishName;

    private String format;

    private String type;

    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }
    public String getIdentifier(){
        return this.identifier;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
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
    public void setFormat(String format){
        this.format = format;
    }
    public String getFormat(){
        return this.format;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
