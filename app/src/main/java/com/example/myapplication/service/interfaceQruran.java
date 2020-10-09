package com.example.myapplication.service;

import retrofit2.Call;
import retrofit2.http.GET;

import com.example.myapplication.model.Data;
import com.example.myapplication.model.Root;

public interface interfaceQruran {
    @GET ("MahmoudMabrok/QuranyApp/master/app/src/main/assets/quran.json")
    Call<Root>call();
}
