package com.example.imageapp;



import com.example.imageapp.Model.ImageResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface ApiInterface {

   @GET("wallpapers/API/index?action=wallpapers&page=1")
    Call<ImageResponse> getData();

}


