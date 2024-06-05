package com.app.shoppingapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_home_page extends AppCompatActivity {
    boolean alreadyAlphaSorted = true;
    Button selected_alpha_sort, selected_price_sort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_home_page);
        selected_alpha_sort = findViewById(R.id.button_with_images_sort_alpha);
        selected_price_sort = findViewById(R.id.button_with_images_sort_price);
        selected_alpha_sort.setBackgroundColor(Color.BLUE);
    }

    public void onPriceSortClick(View view) {
        selected_alpha_sort.setBackgroundColor(Color.GRAY);
        selected_price_sort.setBackgroundColor(Color.BLUE);

    }

    public void onAlphaSortClick(View view) {
        selected_price_sort.setBackgroundColor(Color.GRAY);
        selected_alpha_sort.setBackgroundColor(Color.BLUE);

    }
    public void onChairClick(View view)
    {
        Toast.makeText(with_images_home_page.this, "Chair Selected", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(with_images_home_page.this, with_images_chair_viewing.class);
        startActivity(intent);

    }

    public void onTableClick(View view)
    {
        Toast.makeText(with_images_home_page.this, "Table selected", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(with_images_home_page.this, with_images_table_viewing.class);
        startActivity(intent);

    }

    public void onChandelierClick(View view)
    {
        Toast.makeText(with_images_home_page.this, "Chandelier selected", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(with_images_home_page.this, with_images_chandelier_viewing.class);
        startActivity(intent);

    }


    public void onMirrorClick(View view)
    {
        Toast.makeText(with_images_home_page.this, "Mirror selected", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(with_images_home_page.this, with_images_mirror_viewing.class);
        startActivity(intent);


    }

    public void onSofaClick(View view)
    {
        Toast.makeText(with_images_home_page.this, "Sofa selected", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(with_images_home_page.this, with_images_sofa_viewing.class);
        startActivity(intent);

    }

    // If they click on shopping cart button
    public void onShoppingCartClick(View view)
    {
        Toast.makeText(with_images_home_page.this, "Shopping Cart Not Yet Implemented", Toast.LENGTH_SHORT).show();
    }

}