package com.app.shoppingapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_table_viewing extends AppCompatActivity {

    ImageView antibes, balustrade, chowside, windsor, spanish_oval, antibes_sorted, balustrade_sorted, chowside_sorted, windsor_sorted, spanish_oval_sorted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_table_viewing);


        getSupportActionBar().setTitle("Fitt's Furniture (With Images)");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        displaySortedItems(sorting_choice);
    }

    public void displaySortedItems(String sorting_choice) {

        // Alpha Sorted
        antibes = findViewById(R.id.with_images_antibes);
        balustrade = findViewById(R.id.with_images_balustrade);
        chowside = findViewById(R.id.with_images_chowside);
        windsor = findViewById(R.id.with_images_windsor);
        spanish_oval = findViewById(R.id.with_images_spanish_oval);

        // Price Sorted
        antibes_sorted = findViewById(R.id.with_images_antibes_sorted);
        balustrade_sorted = findViewById(R.id.with_images_balustrade_sorted);
        chowside_sorted = findViewById(R.id.with_images_chowside_sorted);
        windsor_sorted = findViewById(R.id.with_images_windsor_sorted);
        spanish_oval_sorted = findViewById(R.id.with_images_spanish_oval_sorted);

        if (sorting_choice.equals("alpha")) {
            antibes.setVisibility(View.VISIBLE);
            antibes.setClickable(true);
            balustrade.setVisibility(View.VISIBLE);
            balustrade.setClickable(true);
            chowside.setVisibility(View.VISIBLE);
            chowside.setClickable(true);
            windsor.setVisibility(View.VISIBLE);
            windsor.setClickable(true);
            spanish_oval.setVisibility(View.VISIBLE);
            spanish_oval.setClickable(true);
        }

        else if (sorting_choice.equals("price")) {
            antibes_sorted.setVisibility(View.VISIBLE);
            antibes_sorted.setClickable(true);
            balustrade_sorted.setVisibility(View.VISIBLE);
            balustrade_sorted.setClickable(true);
            chowside_sorted.setVisibility(View.VISIBLE);
            chowside_sorted.setClickable(true);
            windsor_sorted.setVisibility(View.VISIBLE);
            windsor_sorted.setClickable(true);
            spanish_oval_sorted.setVisibility(View.VISIBLE);
            spanish_oval_sorted.setClickable(true);
        }

    }

    public void onAntibesClick(View view) {
        Intent intent = new Intent(with_images_table_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "antibes_cocktail");
        intent.putExtra("page", "table");
        startActivity(intent);
    }

    public void onBalustradeClick(View view) {
        Intent intent = new Intent(with_images_table_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "balustrade_base");
        intent.putExtra("page", "table");
        startActivity(intent);
    }

    public void onChowsideClick(View view) {
        Intent intent = new Intent(with_images_table_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "chow_side");
        intent.putExtra("page", "table");
        startActivity(intent);
    }

    public void onWindsorClick(View view) {
        Intent intent = new Intent(with_images_table_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "windsor_hexagonal");
        intent.putExtra("page", "table");
        startActivity(intent);
    }

    public void onSpanishOvalClick(View view) {
        Intent intent = new Intent(with_images_table_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "spanish_oval");
        intent.putExtra("page", "table");
        startActivity(intent);
    }

}