package com.app.shoppingapp;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_chair_viewing extends AppCompatActivity {

    ImageView english_arm, loren_arm, louis_bar, louis_dining, louis_fireside, louis_library, louis_side, montalembert, queen_anne, tiges_arm;
    ImageView english_arm_sorted, loren_arm_sorted, louis_bar_sorted, louis_dining_sorted, louis_fireside_sorted, louis_library_sorted, louis_side_sorted, montalembert_sorted, queen_anne_sorted, tiges_arm_sorted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_chair_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        Toast.makeText(with_images_chair_viewing.this, sorting_choice, Toast.LENGTH_SHORT).show();
        displaySortedItems(sorting_choice);

    }

    public void displaySortedItems(String sorting_choice) {

        // Alpha Sorted Images
        english_arm = findViewById(R.id.with_images_english_arm);
        loren_arm = findViewById(R.id.with_images_loren_arm);
        louis_bar = findViewById(R.id.with_images_louis_bar);
        louis_dining = findViewById(R.id.with_images_louis_dining);
        louis_fireside = findViewById(R.id.with_images_louis_fireside);
        louis_library = findViewById(R.id.with_images_louis_library);
        louis_side = findViewById(R.id.with_images_louis_side);
        montalembert = findViewById(R.id.with_images_montalembert);
        queen_anne = findViewById(R.id.with_images_queen_anne);
        tiges_arm = findViewById(R.id.with_images_tiges_arm);

        // Price Sorted Images
        english_arm_sorted = findViewById(R.id.with_images_english_arm_sorted);
        loren_arm_sorted = findViewById(R.id.with_images_loren_arm_sorted);
        louis_bar_sorted = findViewById(R.id.with_images_louis_bar_sorted);
        louis_dining_sorted = findViewById(R.id.with_images_louis_dining_sorted);
        louis_fireside_sorted = findViewById(R.id.with_images_louis_fireside_sorted);
        louis_library_sorted = findViewById(R.id.with_images_louis_library_sorted);
        louis_side_sorted = findViewById(R.id.with_images_louis_side_sorted);
        montalembert_sorted = findViewById(R.id.with_images_montalembert_sorted);
        queen_anne_sorted = findViewById(R.id.with_images_queen_anne_sorted);
        tiges_arm_sorted = findViewById(R.id.with_images_tiges_arm_sorted);

        // Display the sorted chairs by alphabet
        if(sorting_choice.equals("alpha")) {
            english_arm.setVisibility(View.VISIBLE);
            english_arm.setClickable(true);
            loren_arm.setVisibility(View.VISIBLE);
            loren_arm.setClickable(true);
            louis_bar.setVisibility(View.VISIBLE);
            louis_bar.setClickable(true);
            louis_dining.setVisibility(View.VISIBLE);
            louis_dining.setClickable(true);
            louis_fireside.setVisibility(View.VISIBLE);
            louis_fireside.setClickable(true);
            louis_library.setVisibility(View.VISIBLE);
            louis_library.setClickable(true);
            louis_side.setVisibility(View.VISIBLE);
            louis_side.setClickable(true);
            montalembert.setVisibility(View.VISIBLE);
            montalembert.setClickable(true);
            queen_anne.setVisibility(View.VISIBLE);
            queen_anne.setClickable(true);
            tiges_arm.setVisibility(View.VISIBLE);
            tiges_arm.setClickable(true);
        }

        // Display the sorted chairs by price descending
        else if (sorting_choice.equals("price")) {
            english_arm_sorted.setVisibility(View.VISIBLE);
            english_arm_sorted.setClickable(true);
            loren_arm_sorted.setVisibility(View.VISIBLE);
            loren_arm_sorted.setClickable(true);
            louis_bar_sorted.setVisibility(View.VISIBLE);
            louis_bar_sorted.setClickable(true);
            louis_dining_sorted.setVisibility(View.VISIBLE);
            louis_dining_sorted.setClickable(true);
            louis_fireside_sorted.setVisibility(View.VISIBLE);
            louis_fireside_sorted.setClickable(true);
            louis_library_sorted.setVisibility(View.VISIBLE);
            louis_library_sorted.setClickable(true);
            louis_side_sorted.setVisibility(View.VISIBLE);
            louis_side_sorted.setClickable(true);
            montalembert_sorted.setVisibility(View.VISIBLE);
            montalembert_sorted.setClickable(true);
            queen_anne_sorted.setVisibility(View.VISIBLE);
            queen_anne_sorted.setClickable(true);
            tiges_arm_sorted.setVisibility(View.VISIBLE);
            tiges_arm_sorted.setClickable(true);
        }

    }

    public void onEnglishArmClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "English Arm", Toast.LENGTH_SHORT).show();
    }

    public void onLorenArmClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Loren Arm", Toast.LENGTH_SHORT).show();

    }

    public void onLouisBarClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Louis Bar", Toast.LENGTH_SHORT).show();

    }

    public void onLouisDiningClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Louis Dining", Toast.LENGTH_SHORT).show();

    }

    public void onFireSideClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Fireside", Toast.LENGTH_SHORT).show();

    }

    public void onLouisLibraryClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Louis Library", Toast.LENGTH_SHORT).show();


    }

    public void onLouisSideClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Louis Side", Toast.LENGTH_SHORT).show();

    }

    public void onMontalembertClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Montalembert", Toast.LENGTH_SHORT).show();


    }

    public void onQueenAnneClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Queen Anne", Toast.LENGTH_SHORT).show();


    }

    public void onTigesArmClick(View view) {
        Toast.makeText(with_images_chair_viewing.this, "Tiges Arm", Toast.LENGTH_SHORT).show();


    }
}