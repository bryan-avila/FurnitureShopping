package com.app.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_sofa_viewing extends AppCompatActivity {

    ImageView lancaster, gainsborough, lancaster_sorted, gainsborough_sorted;

    TextView lancaster_text, gainsborough_text, lancaster_sorted_text, gainsborough_sorted_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_sofa_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture (With Images)");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        displaySortedItems(sorting_choice);
    }

    public void displaySortedItems(String sorting_choice) {

        // Alpha sorted
        lancaster = findViewById(R.id.with_images_lancaster);
        gainsborough = findViewById(R.id.with_images_gainsborough);
        lancaster_text = findViewById(R.id.with_images_lancaster_text);
        gainsborough_text = findViewById(R.id.with_images_gainsborough_text);

        // Price sorted
        lancaster_sorted = findViewById(R.id.with_images_lancaster_sorted);
        gainsborough_sorted = findViewById(R.id.with_images_gainsborough_sorted);
        lancaster_sorted_text = findViewById(R.id.with_images_lancaster_sorted_text);
        gainsborough_sorted_text = findViewById(R.id.with_images_gainsborough_sorted_text);

        if(sorting_choice.equals("alpha")){
            lancaster.setVisibility(View.VISIBLE);
            lancaster.setClickable(true);
            gainsborough.setVisibility(View.VISIBLE);
            gainsborough.setClickable(true);

            lancaster_text.setVisibility(View.VISIBLE);
            gainsborough_text.setVisibility(View.VISIBLE);
        }

        else if (sorting_choice.equals("price")) {
            lancaster_sorted.setVisibility(View.VISIBLE);
            lancaster_sorted.setClickable(true);
            gainsborough_sorted.setVisibility(View.VISIBLE);
            gainsborough_sorted.setClickable(true);

            lancaster_sorted_text.setVisibility(View.VISIBLE);
            gainsborough_sorted_text.setVisibility(View.VISIBLE);
        }

    }

    public void onGainsboroughClick(View view) {
        Intent intent = new Intent(with_images_sofa_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "gainsborough");
        intent.putExtra("page", "sofa");
        startActivity(intent);
    }
    public void onLancasterClick(View view) {
        Intent intent = new Intent(with_images_sofa_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "lancaster");
        intent.putExtra("page", "sofa");
        startActivity(intent);
    }
}