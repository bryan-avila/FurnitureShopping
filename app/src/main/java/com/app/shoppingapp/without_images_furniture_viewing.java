package com.app.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class without_images_furniture_viewing extends AppCompatActivity {

    TextView product_price, product_eta, product_finish, furniture_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_images_furniture_viewing);
        getSupportActionBar().setTitle("Fitt's Furniture");

        // Get information from intent passed from without_images_home_page.java
        Bundle bundle = getIntent().getExtras();
        String choice = bundle.getString("choice");

        // ********** CHAIR CHOICES  **********
        if (choice.equals("louis_library")) {
            setFurnitureInformation("Louis Library Chair", R.drawable.chair_louis_library_big, "Price: $1800", "E.T.A.: 2 Days", "Material: Alder Wood");

        } else if (choice.equals("english_arm")) {
            setFurnitureInformation("English Arm Chair", R.drawable.chair_english_arm_big, "Price: $1500", "E.T.A.: 3 Days", "Material: Alder Wood");

        } else if (choice.equals("loren_arm")) {
            setFurnitureInformation("Loren Arm Chair", R.drawable.chair_loren_arm_big, "Price: $1300", "E.T.A.: 3 Days", "Material: Alder Wood");

        } else if (choice.equals("louis_bar")) {
            setFurnitureInformation("Louis Bar Chair", R.drawable.chair_louis_bar_big, "Price: $1000", "E.T.A.: 2 Days", "Material: Alder Wood");

        } else if (choice.equals("louis_dining")) {
            setFurnitureInformation("Louis Dining Chair", R.drawable.chair_louis_dining_big, "Price: $1000", "E.T.A.: 2 Days", "Material: Alder Wood");

        } else if (choice.equals("louis_fireside")) {
            setFurnitureInformation("Louis Fireside Chair", R.drawable.chair_louis_fireside_wing_ottoman_combo_big, "Price: $5500", "E.T.A.: 4 Days", "Material: Alder Wood");

        } else if (choice.equals("louis_side")) {
            setFurnitureInformation("Louis Side Chair", R.drawable.chair_louis_side_big, "Price: $1200", "E.T.A.: 2 Days", "Material: Alder Wood");

        } else if (choice.equals("montalembert")) {
            setFurnitureInformation("Montalembert Chair", R.drawable.chair_montalembert_big, "Price: $1800", "E.T.A.: 2 Days", "Material: Alder Wood");

        } else if (choice.equals("queen_anne")) {
            setFurnitureInformation("Queen Anne Arm Chair", R.drawable.chair_queen_anne_arm_big, "Price: $1700", "E.T.A.: 2 Days", "Material: Walnut");

        } else if (choice.equals("tiges_arm")) {
            setFurnitureInformation("Tiges Arm Chair", R.drawable.chair_tiges_armchair_big, "Price: $1900", "E.T.A.: 2 Days", "Material: Alder Wood");

        }

        // ********** MIRROR CHOICES **********
        else if (choice.equals("charmont")) {
            setFurnitureInformation("Charmont Mirror", R.drawable.mirror_charmont_big, "Price: $1400", "E.T.A.: 2 Days", "Material: Walnut Wood");

        } else if (choice.equals("von_howe")) {
            setFurnitureInformation("Von Howe Mirror", R.drawable.mirror_von_howe_big, "Price: $1500", "E.T.A.: 2 Days", "Material: Alder Wood");

        }

        // ********** TABLE CHOICES **********
        else if (choice.equals("chow_side")) {
            setFurnitureInformation("Chow Side Table", R.drawable.table_chow_side_big, "Price: $1750", "E.T.A.: 4 Days", "Material: Metal Finish");

        } else if (choice.equals("antibes_cocktail")) {
            setFurnitureInformation("Antibes Cocktail Table", R.drawable.table_antibes_cocktail_big, "Price: $2500", "E.T.A.: 5 Days", "Material: Metal Finish");

        } else if (choice.equals("balustrade_base")) {
            setFurnitureInformation("Balustrade Base Table", R.drawable.table_balustrade_base_big, "Price: $1000", "E.T.A.: 2 Days", "Material: Pine Wood");

        } else if (choice.equals("spanish_oval")) {
            setFurnitureInformation("Spanish Oval Dining Table", R.drawable.table_spanish_oval_dining_big, "Price: $3500", "E.T.A.: 4 Days", "Material: Walnut Wood");

        } else if (choice.equals("windsor_hexagonal")) {
            setFurnitureInformation("Windsor Hexagonal Table", R.drawable.table_windsor_hexagonal_big, "Price: $1500", "E.T.A.: 2 Days", "Material: Walnut Wood");

        }

        // ********** CHANDELIERS CHOICES **********
        else if (choice.equals("chantilly")) {
            setFurnitureInformation("Chantilly Chandelier", R.drawable.chandelier_chantilly_big, "Price: $1400", "E.T.A.: 4 Days", "Material: Metal Finish");

        } else if (choice.equals("gothic")) {
            setFurnitureInformation("Gothic Chandelier", R.drawable.chandelier_gothic_big, "Price: $1800", "E.T.A.: 3 Days", "Material: Metal Finish");

        } else if (choice.equals("powder_boom")) {
            setFurnitureInformation("Powder Boom Chandelier", R.drawable.chandelier_powder_boom_big, "Price: $1600", "E.T.A.: 3 Days", "Material: Metal Finish");

        } else if (choice.equals("primitive")) {
            setFurnitureInformation("Primitive Chandelier", R.drawable.chandelier_primitive_big, "Price: $1900", "E.T.A.: 4 Days", "Material: Metal Finish");

        } else if (choice.equals("small_chateau")) {
            setFurnitureInformation("Small Chateau Chandelier", R.drawable.chandelier_small_chateau_big, "Price: $1900", "E.T.A.: 4 Days", "Material: Metal Finish");

        }

        // ********** SOFA CHOICES **********
        else if (choice.equals("gainsborough")) {
            setFurnitureInformation("Gainsborough Sofa", R.drawable.sofa_gainsborough_big, "Price: $5000", "E.T.A.: 4 Days", "Material: Mahogany Wood");

        } else if (choice.equals("lancaster")) {
            setFurnitureInformation("Lancaster Sofa", R.drawable.sofa_lancaster_big, "Price: $7000", "E.T.A.: 5 Days", "Material: Alder Wood");

        } else if (choice.equals("test")) {
            furniture_name.setText("Test", TextView.BufferType.EDITABLE);
            furniture_name.setEnabled(false);
            ImageView imageView = findViewById(R.id.image_view);
            imageView.setImageResource(R.drawable.wood_chair);
        }

    }

    // Display top menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.furniture_view_menu, menu);
        return true;
    }

    // A function that displays the appropriate information
    public void setFurnitureInformation(String furnName, int furnPicture, String furnPrice, String furnETA, String furnMaterial) {
        furniture_name = findViewById(R.id.text_view_furniture_product_name);
        furniture_name.setText(furnName, TextView.BufferType.EDITABLE);
        furniture_name.setEnabled(false);
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(furnPicture);
        product_price = findViewById(R.id.item_view_price);
        product_price.setText(furnPrice);
        product_eta = findViewById(R.id.item_view_estimed_time_arrival);
        product_eta.setText(furnETA);
        product_finish = findViewById(R.id.item_view_material_finish);
        product_finish.setText(furnMaterial);
    }


    public void onPurchaseClick(View view) {
        Toast.makeText(without_images_furniture_viewing.this, "Bought!", Toast.LENGTH_SHORT).show();
    }


    // Give functionality to clicking on the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Get information from intent
        Bundle bundle = getIntent().getExtras();
        String page_from = bundle.getString("page");


        // If they came from price_sorted menu
        if (page_from.equals("price_sorted") && item.getItemId() == R.id.menu_item_home_page) {

            Intent intent = new Intent(without_images_furniture_viewing.this, without_images_home_page_sorted.class);
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