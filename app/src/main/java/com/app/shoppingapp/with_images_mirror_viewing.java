package com.app.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_mirror_viewing extends AppCompatActivity {

    ImageView charmont, von_howe, charmont_sorted, von_howe_sorted;

    TextView charmont_text, von_howe_text, charmont_sorted_text, von_howe_sorted_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_mirror_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture (With Images)");

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
        }

        else if(sorting_choice.equals("price")) {
            charmont_sorted.setVisibility(View.VISIBLE);
            charmont_sorted.setClickable(true);
            von_howe_sorted.setVisibility(View.VISIBLE);
            von_howe_sorted.setClickable(true);

            charmont_sorted_text.setVisibility(View.VISIBLE);
            von_howe_sorted_text.setVisibility(View.VISIBLE);
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
}