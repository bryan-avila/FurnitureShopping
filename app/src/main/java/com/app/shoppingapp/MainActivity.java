package com.app.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onWithImagesClick(View view) {
        Toast.makeText(MainActivity.this, "Selected With Images", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, with_images_home_page.class);
        startActivity(intent);
    }

    public void onWithoutImagesClick(View view){
        Toast.makeText(MainActivity.this, "Selected WITHOUT Images", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, without_images_home_page.class);
        startActivity(intent);
    }
}