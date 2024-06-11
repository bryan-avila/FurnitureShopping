package com.app.shoppingapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_mirror_viewing extends AppCompatActivity {

    Boolean alreadyAlphaSorted, alreadyPriceSorted;
    ImageView charmont, von_howe, charmont_sorted, von_howe_sorted;

    TextView charmont_text, von_howe_text, charmont_sorted_text, von_howe_sorted_text;

    Button alpha_sort, price_sort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_mirror_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture (With Images)");


        // Buttons for sorting
        price_sort = findViewById(R.id.with_images_viewing_price_sort);
        alpha_sort = findViewById(R.id.with_images_viewing_alpha_sort);

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        displaySortedItems(sorting_choice);

    }

    public void displaySortedItems(String sorting_choice) {

        // Alpha sorted
        charmont = findViewById(R.id.with_images_charmont);
        von_howe = findViewById(R.id.with_images_von_howe);
        charmont_text = findViewById(R.id.with_images_charmont_text);
        von_howe_text = findViewById(R.id.with_images_von_howe_text);

        // Price sorted
        charmont_sorted = findViewById(R.id.with_images_charmont_sorted);
        von_howe_sorted = findViewById(R.id.with_images_von_howe_sorted);
        charmont_sorted_text = findViewById(R.id.with_images_charmont_sorted_text);
        von_howe_sorted_text = findViewById(R.id.with_images_von_howe_sorted_text);

        if(sorting_choice.equals("alpha")) {
            charmont.setVisibility(View.VISIBLE);
            charmont.setClickable(true);
            von_howe.setVisibility(View.VISIBLE);
            von_howe.setClickable(true);

            charmont_text.setVisibility(View.VISIBLE);
            von_howe_text.setVisibility(View.VISIBLE);

            // Update sorting buttons
            alpha_sort.setBackgroundResource(R.color.pumpkin_orange);
            alreadyAlphaSorted = true;
            alreadyPriceSorted = false;
        }

        else if(sorting_choice.equals("price")) {
            charmont_sorted.setVisibility(View.VISIBLE);
            charmont_sorted.setClickable(true);
            von_howe_sorted.setVisibility(View.VISIBLE);
            von_howe_sorted.setClickable(true);

            charmont_sorted_text.setVisibility(View.VISIBLE);
            von_howe_sorted_text.setVisibility(View.VISIBLE);

            // Update sorting buttons
            price_sort.setBackgroundResource(R.color.pumpkin_orange);
            alreadyPriceSorted = true;
            alreadyAlphaSorted = false;
        }

    }

    public void onCharmontClick(View view) {
        Intent intent = new Intent(with_images_mirror_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "charmont");
        intent.putExtra("page", "mirrors");
        startActivity(intent);
    }

    public void onVonHoweClick(View view) {
        Intent intent = new Intent(with_images_mirror_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "von_howe");
        intent.putExtra("page", "mirrors");
        startActivity(intent);
    }

    public void onAlphaSortClick(View view) {
        // If not yet alpha sorted, clear the price sorted view and then display the alpha sorted one
        if(!alreadyAlphaSorted) {
            alpha_sort.setBackgroundResource(R.color.pumpkin_orange);
            price_sort.setBackgroundColor(Color.GRAY);
            charmont_sorted.setVisibility(View.INVISIBLE);
            charmont_sorted.setClickable(false);
            von_howe_sorted.setVisibility(View.INVISIBLE);
            von_howe_sorted.setClickable(false);

            charmont_sorted_text.setVisibility(View.INVISIBLE);
            von_howe_sorted_text.setVisibility(View.INVISIBLE);

            alreadyAlphaSorted = true;
            alreadyPriceSorted = false;
            displaySortedItems("alpha");

        }

        else if(alreadyAlphaSorted) {
            Toast.makeText(with_images_mirror_viewing.this, "Already Alphabetically Sorted", Toast.LENGTH_SHORT).show();
        }

    }

    public void onPriceSortClick(View view) {
        // If not yet price sorted, clear the alpha sorted view and display the price sorted one
        if(!alreadyPriceSorted) {
            alpha_sort.setBackgroundColor(Color.GRAY);
            price_sort.setBackgroundResource(R.color.pumpkin_orange);
            charmont.setVisibility(View.INVISIBLE);
            charmont.setClickable(false);
            von_howe.setVisibility(View.INVISIBLE);
            von_howe.setClickable(false);

            charmont_text.setVisibility(View.INVISIBLE);
            von_howe_text.setVisibility(View.INVISIBLE);

            alreadyPriceSorted = true;
            alreadyAlphaSorted = false;
            displaySortedItems("price");
        }

        else if(alreadyPriceSorted) {
            Toast.makeText(with_images_mirror_viewing.this, "Already Price Sorted", Toast.LENGTH_SHORT).show();
        }

    }
}