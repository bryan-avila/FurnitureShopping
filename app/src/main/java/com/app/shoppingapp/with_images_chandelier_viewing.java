package com.app.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class with_images_chandelier_viewing extends AppCompatActivity {

    ImageView chantilly, gothic, powder_boom, primitive, small_chat, chantilly_sorted, gothic_sorted, powder_boom_sorted, primitive_sorted, small_chat_sorted;

    TextView chantilly_text, gothic_text, powder_boom_text, primitive_text, small_chat_text;

    TextView chantilly_sorted_text, gothic_sorted_text, powder_boom_sorted_text, primitive_sorted_text, small_chat_sorted_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_images_chandelier_viewing);

        getSupportActionBar().setTitle("Fitt's Furniture (With Images)");

        // Get information from intent passed from with_images_home_page
        Bundle bundle = getIntent().getExtras();
        String sorting_choice = bundle.getString("sorting_choice");
        displaySortedItems(sorting_choice);
    }


    public void displaySortedItems(String sorting_choice) {

        // Alpha sorted
        chantilly = findViewById(R.id.with_images_chantilly);
        gothic = findViewById(R.id.with_images_gothic);
        powder_boom = findViewById(R.id.with_images_powder_boom);
        primitive = findViewById(R.id.with_images_primitive);
        small_chat = findViewById(R.id.with_images_small_chat);

        chantilly_text = findViewById(R.id.with_images_chantilly_text);
        gothic_text = findViewById(R.id.with_images_gothic_text);
        powder_boom_text = findViewById(R.id.with_images_powder_boom_text);
        primitive_text = findViewById(R.id.with_images_primitive_text);
        small_chat_text = findViewById(R.id.with_images_small_chat_text);

        // Price sorted
        chantilly_sorted = findViewById(R.id.with_images_chantilly_sorted);
        gothic_sorted = findViewById(R.id.with_images_gothic_sorted);
        powder_boom_sorted = findViewById(R.id.with_images_powder_boom_sorted);
        primitive_sorted = findViewById(R.id.with_images_primitive_sorted);
        small_chat_sorted = findViewById(R.id.with_images_small_chat_sorted);

        chantilly_sorted_text = findViewById(R.id.with_images_chantilly_sorted_text);
        gothic_sorted_text = findViewById(R.id.with_images_gothic_sorted_text);
        powder_boom_sorted_text = findViewById(R.id.with_images_powder_boom_sorted_text);
        primitive_sorted_text = findViewById(R.id.with_images_primitive_sorted_text);
        small_chat_sorted_text = findViewById(R.id.with_images_small_chat_sorted_text);

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

            chantilly_text.setVisibility(View.VISIBLE);
            gothic_text.setVisibility(View.VISIBLE);
            powder_boom_text.setVisibility(View.VISIBLE);
            primitive_text.setVisibility(View.VISIBLE);
            small_chat_text.setVisibility(View.VISIBLE);
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

            chantilly_sorted_text.setVisibility(View.VISIBLE);
            gothic_sorted_text.setVisibility(View.VISIBLE);
            powder_boom_sorted_text.setVisibility(View.VISIBLE);
            primitive_sorted_text.setVisibility(View.VISIBLE);
            small_chat_sorted_text.setVisibility(View.VISIBLE);
        }

    }
    public void onChantillyClick(View view) {
        Intent intent = new Intent(with_images_chandelier_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "chantilly");
        intent.putExtra("page", "chandelier");
        startActivity(intent);
    }

    public void onGothicClick(View view) {
        Intent intent = new Intent(with_images_chandelier_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "gothic");
        intent.putExtra("page", "chandelier");
        startActivity(intent);
    }

    public void onPowderBoomClick(View view) {
        Intent intent = new Intent(with_images_chandelier_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "powder_boom");
        intent.putExtra("page", "chandelier");
        startActivity(intent);
    }

    public void onPrimitiveClick(View view) {
        Intent intent = new Intent(with_images_chandelier_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "primitive");
        intent.putExtra("page", "chandelier");
        startActivity(intent);
    }

    public void onSmallChatClick(View view) {
        Intent intent = new Intent(with_images_chandelier_viewing.this, with_images_furniture_viewing.class);
        intent.putExtra("choice", "small_chateau");
        intent.putExtra("page", "chandelier");
        startActivity(intent);
    }
}