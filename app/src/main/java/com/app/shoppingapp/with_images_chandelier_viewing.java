package com.app.shoppingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_chandelier_viewing extends AppCompatActivity {

    ImageView chantilly, gothic, powder_boom, primitive, small_chat, chantilly_sorted, gothic_sorted, powder_boom_sorted, primitive_sorted, small_chat_sorted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_chandelier_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        Toast.makeText(with_images_chandelier_viewing.this, sorting_choice, Toast.LENGTH_SHORT).show();
        displaySortedItems(sorting_choice);
    }


    public void displaySortedItems(String sorting_choice) {

        // Alpha sorted
        chantilly = findViewById(R.id.with_images_chantilly);
        gothic = findViewById(R.id.with_images_gothic);
        powder_boom = findViewById(R.id.with_images_powder_boom);
        primitive = findViewById(R.id.with_images_primitive);
        small_chat = findViewById(R.id.with_images_small_chat);

        // Price sorted
        chantilly_sorted = findViewById(R.id.with_images_chantilly_sorted);
        gothic_sorted = findViewById(R.id.with_images_gothic_sorted);
        powder_boom_sorted = findViewById(R.id.with_images_powder_boom_sorted);
        primitive_sorted = findViewById(R.id.with_images_primitive_sorted);
        small_chat_sorted = findViewById(R.id.with_images_small_chat_sorted);

        if (sorting_choice.equals("alpha")) {
            chantilly.setVisibility(View.VISIBLE);
            chantilly.setClickable(true);
            gothic.setVisibility(View.VISIBLE);
            gothic.setClickable(true);
            powder_boom.setVisibility(View.VISIBLE);
            powder_boom.setClickable(true);
            primitive.setVisibility(View.VISIBLE);
            primitive.setClickable(true);
            small_chat.setVisibility(View.VISIBLE);
            small_chat.setClickable(true);
        }

        else if(sorting_choice.equals("price")) {
            chantilly_sorted.setVisibility(View.VISIBLE);
            chantilly_sorted.setClickable(true);
            gothic_sorted.setVisibility(View.VISIBLE);
            gothic_sorted.setClickable(true);
            powder_boom_sorted.setVisibility(View.VISIBLE);
            powder_boom_sorted.setClickable(true);
            primitive_sorted.setVisibility(View.VISIBLE);
            primitive_sorted.setClickable(true);
            small_chat_sorted.setVisibility(View.VISIBLE);
            small_chat_sorted.setClickable(true);
        }

    }
    public void onChantillyClick(View view) {
        Toast.makeText(with_images_chandelier_viewing.this, "Chantilly", Toast.LENGTH_SHORT).show();

    }

    public void onGothicClick(View view) {
        Toast.makeText(with_images_chandelier_viewing.this, "Gothic", Toast.LENGTH_SHORT).show();


    }

    public void onPowderBoomClick(View view) {
        Toast.makeText(with_images_chandelier_viewing.this, "Powder Boom", Toast.LENGTH_SHORT).show();


    }

    public void onPrimitiveClick(View view) {
        Toast.makeText(with_images_chandelier_viewing.this, "Primitive", Toast.LENGTH_SHORT).show();



    }

    public void onSmallChatClick(View view) {
        Toast.makeText(with_images_chandelier_viewing.this, "small Chat", Toast.LENGTH_SHORT).show();


    }
}