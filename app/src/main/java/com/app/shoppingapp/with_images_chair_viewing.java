package com.app.shoppingapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class with_images_chair_viewing extends AppCompatActivity {
    boolean alreadyAlphaSorted, alreadyPriceSorted;
    ImageView english_arm, loren_arm, louis_bar, louis_dining, louis_fireside, louis_library, louis_side, montalembert, queen_anne, tiges_arm;
    ImageView english_arm_sorted, loren_arm_sorted, louis_bar_sorted, louis_dining_sorted, louis_fireside_sorted, louis_library_sorted, louis_side_sorted, montalembert_sorted, queen_anne_sorted, tiges_arm_sorted;
    TextView english_arm_text, loren_arm_text, louis_bar_text, louis_dining_text, louis_fireside_text, louis_library_text, louis_side_text, montalembert_text, queen_anne_text, tiges_arm_text;
    TextView english_arm_sorted_text, loren_arm_sorted_text, louis_bar_sorted_text, louis_dining_sorted_text, louis_fireside_sorted_text, louis_library_sorted_text, louis_side_sorted_text, montalembert_sorted_text, queen_anne_sorted_text, tiges_arm_sorted_text;
    Button price_sort, alpha_sort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_chair_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture (With Images)");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");

        // Buttons for sorting
        price_sort = findViewById(R.id.with_images_viewing_price_sort);
        alpha_sort = findViewById(R.id.with_images_viewing_alpha_sort);

        // Display items according to the sorting choice
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

        english_arm_text = findViewById(R.id.with_images_english_arm_text);
        loren_arm_text = findViewById(R.id.with_images_loren_arm_text);
        louis_bar_text = findViewById(R.id.with_images_louis_bar_text);
        louis_dining_text = findViewById(R.id.with_images_louis_dining_text);
        louis_fireside_text = findViewById(R.id.with_images_louis_fireside_text);
        louis_library_text = findViewById(R.id.with_images_louis_library_text);
        louis_side_text = findViewById(R.id.with_images_louis_side_text);
        montalembert_text = findViewById(R.id.with_images_montalembert_text);
        queen_anne_text = findViewById(R.id.with_images_queen_anne_text);
        tiges_arm_text = findViewById(R.id.with_images_tiges_arm_text);

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

        english_arm_sorted_text = findViewById(R.id.with_images_english_arm_sorted_text);
        loren_arm_sorted_text = findViewById(R.id.with_images_loren_arm_sorted_text);
        louis_bar_sorted_text = findViewById(R.id.with_images_louis_bar_sorted_text);
        louis_dining_sorted_text = findViewById(R.id.with_images_louis_dining_sorted_text);
        louis_fireside_sorted_text = findViewById(R.id.with_images_louis_fireside_sorted_text);
        louis_library_sorted_text = findViewById(R.id.with_images_louis_library_sorted_text);
        louis_side_sorted_text = findViewById(R.id.with_images_louis_side_sorted_text);
        montalembert_sorted_text = findViewById(R.id.with_images_montalembert_sorted_text);
        queen_anne_sorted_text = findViewById(R.id.with_images_queen_anne_sorted_text);
        tiges_arm_sorted_text = findViewById(R.id.with_images_tiges_arm_sorted_text);

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

            english_arm_text.setVisibility(View.VISIBLE);
            loren_arm_text.setVisibility(View.VISIBLE);
            louis_bar_text.setVisibility(View.VISIBLE);
            louis_dining_text.setVisibility(View.VISIBLE);
            louis_fireside_text.setVisibility(View.VISIBLE);
            louis_library_text.setVisibility(View.VISIBLE);
            louis_side_text.setVisibility(View.VISIBLE);
            montalembert_text.setVisibility(View.VISIBLE);
            queen_anne_text.setVisibility(View.VISIBLE);
            tiges_arm_text.setVisibility(View.VISIBLE);

            // Update the sorting buttons
            alpha_sort.setBackgroundResource(R.color.pumpkin_orange);
            alreadyAlphaSorted = true;
            alreadyPriceSorted = false;
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

            english_arm_sorted_text.setVisibility(View.VISIBLE);
            loren_arm_sorted_text.setVisibility(View.VISIBLE);
            louis_bar_sorted_text.setVisibility(View.VISIBLE);
            louis_dining_sorted_text.setVisibility(View.VISIBLE);
            louis_fireside_sorted_text.setVisibility(View.VISIBLE);
            louis_library_sorted_text.setVisibility(View.VISIBLE);
            louis_side_sorted_text.setVisibility(View.VISIBLE);
            montalembert_sorted_text.setVisibility(View.VISIBLE);
            queen_anne_sorted_text.setVisibility(View.VISIBLE);
            tiges_arm_sorted_text.setVisibility(View.VISIBLE);

            // Update the sorting buttons
            price_sort.setBackgroundResource(R.color.pumpkin_orange);
            alreadyAlphaSorted = false;
            alreadyPriceSorted = true;

        }

    }

    // Each furniture gets their own "onClick", taken from the XML.
    public void onEnglishArmClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "english_arm");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onLorenArmClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "loren_arm");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onLouisBarClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "louis_bar");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onLouisDiningClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "louis_dining");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onFireSideClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "louis_fireside");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onLouisLibraryClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "louis_library");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onLouisSideClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "louis_side");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onMontalembertClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "montalembert");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onQueenAnneClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "queen_anne");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onTigesArmClick(View view) {
        Intent intent = new Intent(with_images_chair_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "tiges_arm");
        intent.putExtra("page", "chairs");
        startActivity(intent);
    }

    public void onAlphaSortClick(View view) {
        // If not yet alpha sorted, then clear the price sorted view and display the alpha sorted one
        if(!alreadyAlphaSorted) {
            alpha_sort.setBackgroundResource(R.color.pumpkin_orange);
            price_sort.setBackgroundColor(Color.GRAY);

            english_arm_sorted.setVisibility(View.INVISIBLE);
            english_arm_sorted.setClickable(false);
            loren_arm_sorted.setVisibility(View.INVISIBLE);
            loren_arm_sorted.setClickable(false);
            louis_bar_sorted.setVisibility(View.INVISIBLE);
            louis_bar_sorted.setClickable(false);
            louis_dining_sorted.setVisibility(View.INVISIBLE);
            louis_dining_sorted.setClickable(false);
            louis_fireside_sorted.setVisibility(View.INVISIBLE);
            louis_fireside_sorted.setClickable(false);
            louis_library_sorted.setVisibility(View.INVISIBLE);
            louis_library_sorted.setClickable(false);
            louis_side_sorted.setVisibility(View.INVISIBLE);
            louis_side_sorted.setClickable(false);
            montalembert_sorted.setVisibility(View.INVISIBLE);
            montalembert_sorted.setClickable(false);
            queen_anne_sorted.setVisibility(View.INVISIBLE);
            queen_anne_sorted.setClickable(false);
            tiges_arm_sorted.setVisibility(View.INVISIBLE);
            tiges_arm_sorted.setClickable(false);

            english_arm_sorted_text.setVisibility(View.INVISIBLE);
            loren_arm_sorted_text.setVisibility(View.INVISIBLE);
            louis_bar_sorted_text.setVisibility(View.INVISIBLE);
            louis_dining_sorted_text.setVisibility(View.INVISIBLE);
            louis_fireside_sorted_text.setVisibility(View.INVISIBLE);
            louis_library_sorted_text.setVisibility(View.INVISIBLE);
            louis_side_sorted_text.setVisibility(View.INVISIBLE);
            montalembert_sorted_text.setVisibility(View.INVISIBLE);
            queen_anne_sorted_text.setVisibility(View.INVISIBLE);
            tiges_arm_sorted_text.setVisibility(View.INVISIBLE);

            alreadyAlphaSorted = true;
            alreadyPriceSorted = false;
            displaySortedItems("alpha");
        }

        // Else, give a toast warning that this is already alpha sorted
        else if(alreadyAlphaSorted) {
            Toast.makeText(with_images_chair_viewing.this, "Already Alphabetically Sorted", Toast.LENGTH_SHORT).show();
        }
    }

    public void onPriceSortClick(View view) {
        // If not yet price sorted, clear the alpha sorted view to display the price sorted one
        if(!alreadyPriceSorted) {
            alpha_sort.setBackgroundColor(Color.GRAY);
            price_sort.setBackgroundResource(R.color.pumpkin_orange);

            english_arm.setVisibility(View.INVISIBLE);
            english_arm.setClickable(false);
            loren_arm.setVisibility(View.INVISIBLE);
            loren_arm.setClickable(false);
            louis_bar.setVisibility(View.INVISIBLE);
            louis_bar.setClickable(false);
            louis_dining.setVisibility(View.INVISIBLE);
            louis_dining.setClickable(false);
            louis_fireside.setVisibility(View.INVISIBLE);
            louis_fireside.setClickable(false);
            louis_library.setVisibility(View.INVISIBLE);
            louis_library.setClickable(false);
            louis_side.setVisibility(View.INVISIBLE);
            louis_side.setClickable(false);
            montalembert.setVisibility(View.INVISIBLE);
            montalembert.setClickable(false);
            queen_anne.setVisibility(View.INVISIBLE);
            queen_anne.setClickable(false);
            tiges_arm.setVisibility(View.INVISIBLE);
            tiges_arm.setClickable(false);

            english_arm_text.setVisibility(View.INVISIBLE);
            loren_arm_text.setVisibility(View.INVISIBLE);
            louis_bar_text.setVisibility(View.INVISIBLE);
            louis_dining_text.setVisibility(View.INVISIBLE);
            louis_fireside_text.setVisibility(View.INVISIBLE);
            louis_library_text.setVisibility(View.INVISIBLE);
            louis_side_text.setVisibility(View.INVISIBLE);
            montalembert_text.setVisibility(View.INVISIBLE);
            queen_anne_text.setVisibility(View.INVISIBLE);
            tiges_arm_text.setVisibility(View.INVISIBLE);

            alreadyPriceSorted = true;
            alreadyAlphaSorted = false;
            displaySortedItems("price");
        }
        // Else, display a toast warning that view is already price sorted
        else if(alreadyPriceSorted) {
            Toast.makeText(with_images_chair_viewing.this, "Already Price Sorted", Toast.LENGTH_SHORT).show();
        }

    }
}