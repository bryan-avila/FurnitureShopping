package com.app.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Fitt's Furniture");
    }

    public void onWithImagesClick(View view) {
        Intent intent = new Intent(MainActivity.this, with_images_home_page.class);
        startActivity(intent);
    }

    public void onWithoutImagesClick(View view){
        Intent intent = new Intent(MainActivity.this, without_images_home_page.class);
        startActivity(intent);
    }
}