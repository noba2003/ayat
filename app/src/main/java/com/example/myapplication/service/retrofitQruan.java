package com.example.myapplication.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitQruan {
    private  static Retrofit retrofit;



  public   static interfaceQruran getService(){
      if(retrofit==null){
        retrofit=new Retrofit.Builder().baseUrl("https://raw.githubusercontent.com").addConverterFactory(GsonConverterFactory.create()).build();}
        return retrofit.create(interfaceQruran.class);


    }
}
