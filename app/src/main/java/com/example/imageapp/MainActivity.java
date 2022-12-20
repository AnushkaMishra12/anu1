package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.imageapp.Model.ImageResponse;
import com.example.imageapp.Model.Wallpaper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        getApiData();
    }

    private void getApiData() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<ImageResponse> call = apiInterface.getData();
        call.enqueue(new Callback<ImageResponse>() {
            @Override
            public void onResponse(Call<ImageResponse> call, Response<ImageResponse> response) {
                Log.d("response", response.body().getWallpapers().get(0).getImgavatar());
                setupListView(response.body().getWallpapers());
            }

            @Override
            public void onFailure(Call<ImageResponse> call, Throwable t) {

            }
        });


    }


    private void setupListView(List<Wallpaper> listItems) {

        ImageAdapterClass adaptor = new ImageAdapterClass(this, listItems);
        recyclerView.setAdapter(adaptor);
    }
}