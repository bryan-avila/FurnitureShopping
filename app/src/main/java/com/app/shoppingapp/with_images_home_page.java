package com.app.shoppingapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_home_page extends AppCompatActivity {
    boolean alreadyAlphaSorted, alreadyPriceSorted;
    Button selected_alpha_sort, selected_price_sort;
    String sorting_choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_home_page);

        getSupportActionBar().setTitle("Fitt's Furniture");


        // The default sorting is alphabetically. Signify this with color.
        selected_alpha_sort = findViewById(R.id.button_with_images_sort_alpha);
        selected_alpha_sort.setBackgroundResource(R.color.pumpkin_orange);
        sorting_choice = "alpha";
        alreadyAlphaSorted = true;

        selected_price_sort = findViewById(R.id.button_with_images_sort_price);
        alreadyPriceSorted = false;

    }

    public void onPriceSortClick(View view) {
        if(!alreadyPriceSorted) {
            selected_alpha_sort.setBackgroundColor(Color.GRAY);
            selected_price_sort.setBackgroundResource(R.color.pumpkin_orange);;
            alreadyPriceSorted = true; // Not yet price sorted? Now it is true, and alpha is false.
            sorting_choice = "price";
            alreadyAlphaSorted = false;
        }
        else if (alreadyPriceSorted) {
            Toast.makeText(with_images_home_page.this, "Already Price Sorted", Toast.LENGTH_SHORT).show();
        }
    }

    public void onAlphaSortClick(View view) {
        if(alreadyAlphaSorted) {
            Toast.makeText(with_images_home_page.this, "Already Alphabetically Sorted", Toast.LENGTH_SHORT).show();
        }
        else if(!alreadyAlphaSorted) {
            selected_price_sort.setBackgroundColor(Color.GRAY);
            selected_alpha_sort.setBackgroundResource(R.color.pumpkin_orange);;
            alreadyAlphaSorted = true; // Not yet alpha sorted? Now it is true and price is false.
            sorting_choice = "alpha";
            alreadyPriceSorted = false;
        }
    }
    public void onChairClick(View view) {
        Intent intent = new Intent(with_images_home_page.this, with_images_chair_viewing.class);
        intent.putExtra("sorting_choice", sorting_choice);
        startActivity(intent);
    }

    public void onTableClick(View view) {
        Intent intent = new Intent(with_images_home_page.this, with_images_table_viewing.class);
        intent.putExtra("sorting_choice", sorting_choice);
        startActivity(intent);
    }

    public void onChandelierClick(View view) {
        Intent intent = new Intent(with_images_home_page.this, with_images_chandelier_viewing.class);
        intent.putExtra("sorting_choice", sorting_choice);
        startActivity(intent);
    }


    public void onMirrorClick(View view) {
        Intent intent = new Intent(with_images_home_page.this, with_images_mirror_viewing.class);
        intent.putExtra("sorting_choice", sorting_choice);
        startActivity(intent);
    }

    public void onSofaClick(View view) {
        Intent intent = new Intent(with_images_home_page.this, with_images_sofa_viewing.class);
        intent.putExtra("sorting_choice", sorting_choice);
        startActivity(intent);
    }

    // If they click on shopping cart button
    public void onShoppingCartClick(View view) {
        Toast.makeText(with_images_home_page.this, "Shopping Cart Not Yet Implemented", Toast.LENGTH_SHORT).show();
    }

}