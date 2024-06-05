package com.app.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class without_images_home_page_sorted extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_images_home_page_sorted);
        getSupportActionBar().setTitle("Fitt's Furniture");
    }

    // Display menu in home page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.category_page_menu, menu);
        return true;
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        // CHAIR SELECTIONS--------------
        if(item.getItemId() == R.id.item_louis_library_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "louis_library", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_english_arm_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "english_arm", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_loren_arm_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "loren_arm", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_bar_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "louis_bar", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_dining_price_sorted)
        {
            return sendSelectedFurniture("choice", "louis_dining", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_fireside_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "louis_fireside", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_side_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "louis_side", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_montalembert_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "montalembert", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_queen_anne_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "queen_anne", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_tiges_chair_price_sorted)
        {
            return sendSelectedFurniture("choice", "tiges_arm", "page", "price_sorted");
        }

        // TABLE SELECTIONS-------------------
        else if(item.getItemId() == R.id.item_chow_side_table_price_sorted)
        {
            return sendSelectedFurniture("choice", "chow_side", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_antibes_cocktail_table_price_sorted)
        {
            return sendSelectedFurniture("choice", "antibes_cocktail", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_balustrade_base_table_price_sorted)
        {
            return sendSelectedFurniture("choice", "balustrade_base", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_spanish_oval_table_price_sorted)
        {
            return sendSelectedFurniture("choice", "spanish_oval", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_windsor_hexagonal_table_price_sorted)
        {
            return sendSelectedFurniture("choice", "windsor_hexagonal", "page", "price_sorted");
        }

        // MIRROR SELECTIONS----------------
        else if(item.getItemId() == R.id.item_charmont_mirror_price_sorted)
        {
            return sendSelectedFurniture("choice", "charmont", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_von_howe_mirror_price_sorted)
        {
            return sendSelectedFurniture("choice", "von_howe", "page", "price_sorted");
        }

        // SOFA SELECTIONS--------------------
        else if(item.getItemId() == R.id.item_gainsborough_sofa_price_sorted)
        {
            return sendSelectedFurniture("choice", "gainsborough", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_lancaster_sofa_price_sorted)
        {
            return sendSelectedFurniture("choice", "lancaster", "page", "price_sorted");
        }

        // CHANDELIER SELECTIONS--------------
        else if(item.getItemId() == R.id.item_chantilly_chandelier_price_sorted)
        {
            return sendSelectedFurniture("choice", "chantilly", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_gothic_chandelier_price_sorted)
        {
            return sendSelectedFurniture("choice", "gothic", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_powder_boom_chandelier_price_sorted)
        {
            return sendSelectedFurniture("choice", "powder_boom", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_primitive_chandelier_price_sorted)
        {
            return sendSelectedFurniture("choice", "primitive", "page", "price_sorted");
        }

        else if(item.getItemId() == R.id.item_small_chateau_chandelier_price_sorted)
        {
            return sendSelectedFurniture("choice", "small_chateau", "page", "price_sorted");
        }

        // END OF IF STATEMENTS----------------------
        else
            return false;
    }

    // Function that sends the chosen furniture's information to without_images_furniture_viewing as intent extras
    public boolean sendSelectedFurniture(String furnKey, String furnName, String pageKey, String pageName){

        Intent intent = new Intent(without_images_home_page_sorted.this, without_images_furniture_viewing.class);
        intent.putExtra(furnKey, furnName);
        intent.putExtra(pageKey, pageName);
        startActivity(intent);
        return true;
    }

    public void showChairsPSPopUp(View view) {
        PopupMenu chairs_popup = new PopupMenu(this, view);
        chairs_popup.setOnMenuItemClickListener(this);
        chairs_popup.inflate(R.menu.chairs_price_sorted_menu);
        chairs_popup.show();
    }

    public void showTablesPSPopUp(View view) {
        PopupMenu tables_popup = new PopupMenu(this, view);
        tables_popup.setOnMenuItemClickListener(this);
        tables_popup.inflate(R.menu.tables_menu_price_sorted);
        tables_popup.show();
    }

    public void showMirrorsPSPopUp(View view) {
        PopupMenu mirrors_popup = new PopupMenu(this, view);
        mirrors_popup.setOnMenuItemClickListener(this);
        mirrors_popup.inflate(R.menu.mirrors_menu_price_sorted);
        mirrors_popup.show();
    }

    public void showSofaPSPopUp(View view) {
        PopupMenu sofa_popup = new PopupMenu(this, view);
        sofa_popup.setOnMenuItemClickListener(this);
        sofa_popup.inflate(R.menu.sofa_menu_price_sorted);
        sofa_popup.show();
    }

    public void showChandeliersPSPopUp(View view) {
        PopupMenu chandeliers_popup = new PopupMenu(this, view);
        chandeliers_popup.setOnMenuItemClickListener(this);
        chandeliers_popup.inflate(R.menu.chandeliers_menu_price_sorted);
        chandeliers_popup.show();
    }

    // Give functionality to clicking on the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.menu_item_shopping_cart)
        {
            Toast.makeText(this, "Shopping Cart Not Yet Implemented", Toast.LENGTH_SHORT).show();
            return true;
        }
        // Give functionality to the sort price
        else if(item.getItemId() == R.id.menu_item_price_sort)
        {
            Toast.makeText(this, "Already sorted by price!", Toast.LENGTH_SHORT).show();
            return true;
        }
        // Give functionality to sort alphabetically
        else if(item.getItemId() == R.id.menu_item_alpha_sort)
        {
            Intent intent = new Intent(without_images_home_page_sorted.this, without_images_home_page.class);
            Toast.makeText(this, "Sorted Alphabetically", Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish(); // Prevent users from going back via back button
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
}