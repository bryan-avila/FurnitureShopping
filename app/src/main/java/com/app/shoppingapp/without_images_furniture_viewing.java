package com.app.shoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class without_images_furniture_viewing extends AppCompatActivity {

    TextView product_price, product_eta, product_finish;

    private int product_id = 1;


    //TODO Change image sizes
    //TODO Reduce redundant code 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_images_furniture_viewing);

        TextView furniture_name = findViewById(R.id.text_view_furniture_product_name);

        // Get information from intent
        Bundle bundle = getIntent().getExtras();
        String choice = bundle.getString("choice");

        // ********** Chairs  **********
        if (choice.equals("louis_library")) {
            product_id = 19;
            furniture_name.setText("Louis Library Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_louis_library);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1800");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("english_arm")) {
            product_id = 10;
            furniture_name.setText("English Arm Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_english_arm);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1500");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 3 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("loren_arm")) {
            product_id = 11;
            furniture_name.setText("Loren Arm Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_loren_arm);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1300");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 3 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("louis_bar")) {
            product_id = 12;
            furniture_name.setText("Louis Bar Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_louis_bar);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1000");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("louis_dining")) {
            product_id = 13;
            furniture_name.setText("Louis Dining Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_louis_dining);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1000");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("louis_fireside")) {
            product_id = 14;
            furniture_name.setText("Louis Fireside Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_louis_fireside_wing_ottoman_combo);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $5500");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("louis_side")) {
            product_id = 15;
            furniture_name.setText("Louis Side Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_louis_side);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1200");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");

        } else if (choice.equals("montalembert")) {
            product_id = 16;
            furniture_name.setText("Montalembert Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_montalembert);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1800");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");

        } else if (choice.equals("queen_anne")) {
            product_id = 17;
            furniture_name.setText("Queen Anne Arm Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_queen_anne_arm);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1700");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Walnut");

        } else if (choice.equals("tiges_arm")) {
            product_id = 18;
            furniture_name.setText("Tiges Arm Chair", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chair_tiges_armchair);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1900");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");

        }


        // ********** MIRROR CHOICES **********
        // ********** MIRROR CHOICES **********
        // ********** MIRROR CHOICES **********

        else if (choice.equals("charmont")) {
            product_id = 21;
            furniture_name.setText("Charmont Mirror", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.mirror_charmont);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1400");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Walnut Wood");
        } else if (choice.equals("von_howe")) {
            product_id = 20;
            furniture_name.setText("Von Howe Mirror", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.mirror_von_howe);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1500");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        }


        // ********** TABLE CHOICES **********
        // ********** TABLE CHOICES **********
        // ********** TABLE CHOICES **********
        else if (choice.equals("chow_side")) {
            product_id = 29;
            furniture_name.setText("Chow Side Table", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.table_chow_side);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1750");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        } else if (choice.equals("antibes_cocktail")) {
            product_id = 22;
            furniture_name.setText("Antibes Cocktail Table", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.table_antibes_cocktail);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $2500");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 5 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        } else if (choice.equals("balustrade_base")) {
            product_id = 23;
            furniture_name.setText("Balustrade Base Table", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.table_balustrade_base);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1000");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Pine Wood");
        } else if (choice.equals("spanish_oval")) {
            product_id = 24;
            furniture_name.setText("Spanish Oval Dining Table", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.table_spanish_oval_dining);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $3500");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Walnut Wood");
        } else if (choice.equals("windsor_hexagonal")) {
            product_id = 25;
            furniture_name.setText("Windsor Hexagonal Table", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.table_windsor_hexagonal);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1500");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 2 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Walnut Wood");
        }

        // ********** CHANDELIERS CHOICES **********
        // ********** CHANDELIERS CHOICES **********
        // ********** CHANDELIERS CHOICES **********
        else if (choice.equals("chantilly")) {
            product_id = 30;
            furniture_name.setText("Chantilly Chandelier", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chandelier_chantilly);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1400");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        } else if (choice.equals("gothic")) {
            product_id = 31;
            furniture_name.setText("Gothic Chandelier", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chandelier_gothic);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1800");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 3 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        } else if (choice.equals("powder_boom")) {
            product_id = 32;
            furniture_name.setText("Powder Boom Chandelier", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chandelier_powder_boom);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1600");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 3 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        } else if (choice.equals("primitive")) {
            product_id = 33;
            furniture_name.setText("Primitive Chandelier", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chandelier_primitive);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1900");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        } else if (choice.equals("small_chateau")) {
            product_id = 34;
            furniture_name.setText("Small Chateau Chandelier", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.chandelier_small_chateau);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $1900");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Metal Finish");
        }

        // ********** SOFA CHOICES **********
        // ********** SOFA CHOICES **********
        // ********** SOFA CHOICES **********
        else if (choice.equals("gainsborough")) {
            product_id = 40;
            furniture_name.setText("Gainsborough Sofa", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.sofa_gainsborough);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $5000");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 4 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Mahogany Wood");
        } else if (choice.equals("lancaster")) {
            product_id = 41;
            furniture_name.setText("Lancaster Sofa", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.sofa_lancaster);
            product_price = findViewById(R.id.item_view_price);
            product_price.setText("Price: $7000");
            product_eta = findViewById(R.id.item_view_estimed_time_arrival);
            product_eta.setText("E.T.A.: 5 Days");
            product_finish = findViewById(R.id.item_view_material_finish);
            product_finish.setText("Material: Alder Wood");
        } else if (choice.equals("test")) {
            furniture_name.setText("Test", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.wood_chair);
        }

    }

    public void onPurchaseClick(View view) {
        Toast.makeText(without_images_furniture_viewing.this, "Bought!", Toast.LENGTH_SHORT).show();
    }

    // Display menu for home page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_page_menu, menu);
        return true;
    }

    // Give functionality to clicking on the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Get information from intent
        Bundle bundle = getIntent().getExtras();
        String page_from = bundle.getString("page");


        // If they came from price_sorted menu
        if (page_from.equals("price_sorted") && item.getItemId() == R.id.menu_item_home_page) {


            Intent intent = new Intent(without_images_furniture_viewing.this, without_images_home_page.class);
            startActivity(intent);
            return true;
        }

        // if they came from alpha sorted menu
        else if(page_from.equals("alpha_sorted") && item.getItemId() == R.id.menu_item_home_page) {

            Intent intent = new Intent(without_images_furniture_viewing.this, without_images_home_page.class);
            startActivity(intent);
            return true;

        }

        else
            return super.onOptionsItemSelected(item);

    }
}