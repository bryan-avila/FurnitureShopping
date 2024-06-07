package com.app.shoppingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_sofa_viewing extends AppCompatActivity {

    ImageView lancaster, gainsborough, lancaster_sorted, gainsborough_sorted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_sofa_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        Toast.makeText(with_images_sofa_viewing.this, sorting_choice, Toast.LENGTH_SHORT).show();
        displaySortedItems(sorting_choice);
    }

    public void displaySortedItems(String sorting_choice) {

        // Alpha sorted
        lancaster = findViewById(R.id.with_images_lancaster);
        gainsborough = findViewById(R.id.with_images_gainsborough);

        // Price sorted
        lancaster_sorted = findViewById(R.id.with_images_lancaster_sorted);
        gainsborough_sorted = findViewById(R.id.with_images_gainsborough_sorted);

        if(sorting_choice.equals("alpha")){
            lancaster.setVisibility(View.VISIBLE);
            lancaster.setClickable(true);
            gainsborough.setVisibility(View.VISIBLE);
            gainsborough.setClickable(true);
        }

        else if (sorting_choice.equals("price")) {
            lancaster_sorted.setVisibility(View.VISIBLE);
            lancaster_sorted.setClickable(true);
            gainsborough_sorted.setVisibility(View.VISIBLE);
            gainsborough_sorted.setClickable(true);
        }

    }

    public void onGainsboroughClick(View view) {
        Toast.makeText(with_images_sofa_viewing.this, "Gainsborough", Toast.LENGTH_SHORT).show();
    }
    public void onLancasterClick(View view) {
        Toast.makeText(with_images_sofa_viewing.this, "Lancaster", Toast.LENGTH_SHORT).show();


    }
}