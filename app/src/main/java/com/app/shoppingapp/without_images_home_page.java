package com.app.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class without_images_home_page extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_images_home_page);
        getSupportActionBar().setTitle("Fitt's Furniture");
    }

    // Display menu in home page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.category_page_menu, menu);
        return true;
    }

    // Give functionality to clicking on the top bar menu sorting options
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
            Intent intent = new Intent(without_images_home_page.this, without_images_home_page_sorted.class);
            Toast.makeText(this, "Sorted By Price", Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish(); // Prevent users from going back via back button

            return true;
        }
        // Give functionality to sort alphabetically
        else if(item.getItemId() == R.id.menu_item_alpha_sort)
        {
            Toast.makeText(this, "Already sorted Alphabetically!", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }

    // Whichever furniture the user clicks, send it's data to without_images_furniture_viewing. Uses sendSelectedFurniture function to do so.
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        // CHAIR SELECTIONS--------------
        if(item.getItemId() == R.id.item_louis_library_chair)
        {
            return sendSelectedFurniture("choice", "louis_library", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_english_arm_chair)
        {
            return sendSelectedFurniture("choice", "english_arm", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_loren_arm_chair)
        {
            return sendSelectedFurniture("choice", "loren_arm", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_bar_chair)
        {
            return sendSelectedFurniture("choice", "louis_bar", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_dining_chair)
        {
            return sendSelectedFurniture("choice", "louis_dining", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_fireside_chair)
        {
            return sendSelectedFurniture("choice", "louis_fireside", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_louis_side_chair)
        {
            return sendSelectedFurniture("choice", "louis_side", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_montalembert_chair)
        {
            return sendSelectedFurniture("choice", "montalembert", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_queen_anne_chair)
        {
            return sendSelectedFurniture("choice", "queen_anne", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_tiges_chair)
        {
            return sendSelectedFurniture("choice", "tiges_arm", "page", "alpha_sorted");
        }

        // TABLE SELECTIONS-------------------
        else if(item.getItemId() == R.id.item_chow_side_table)
        {
            return sendSelectedFurniture("choice", "chow_side", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_antibes_cocktail_Table)
        {
            return sendSelectedFurniture("choice", "antibes_cocktail", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_balustrade_base_table)
        {
            return sendSelectedFurniture("choice", "balustrade_base", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_spanish_oval_table)
        {
            return sendSelectedFurniture("choice", "spanish_oval", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_windsor_hexagonal)
        {
            return sendSelectedFurniture("choice", "windsor_hexagonal", "page", "alpha_sorted");
        }

        // MIRROR SELECTIONS----------------
        else if(item.getItemId() == R.id.item_charmont_mirror)
        {
            return sendSelectedFurniture("choice", "charmont", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_von_howe)
        {
            return sendSelectedFurniture("choice", "von_howe", "page", "alpha_sorted");
        }

        // SOFA SELECTIONS--------------------
        else if(item.getItemId() == R.id.item_gainsborough_sofa)
        {
            return sendSelectedFurniture("choice", "gainsborough", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_lancaster_sofa)
        {
            return sendSelectedFurniture("choice", "lancaster", "page", "alpha_sorted");
        }

        // CHANDELIER SELECTIONS--------------
        else if(item.getItemId() == R.id.item_chantilly_chandelier)
        {
            return sendSelectedFurniture("choice", "chantilly", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_gothic_chandelier)
        {
            return sendSelectedFurniture("choice", "gothic", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_powder_boom_chandelier)
        {
            return sendSelectedFurniture("choice", "powder_boom", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_primitive_chandelier)
        {
            return sendSelectedFurniture("choice", "primitive", "page", "alpha_sorted");
        }

        else if(item.getItemId() == R.id.item_small_chateau_chandelier)
        {
            return sendSelectedFurniture("choice", "small_chateau", "page", "alpha_sorted");
        }

        // END OF IF STATEMENTS----------------------
        else
            return false;
    }

    // Function that sends the chosen furniture's information to without_images_furniture_viewing as intent extras
    public boolean sendSelectedFurniture(String furnKey, String furnName, String pageKey, String pageName){

        Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
        intent.putExtra(furnKey, furnName);
        intent.putExtra(pageKey, pageName);
        startActivity(intent);
        return true;
    }

    public void showChairsPopUp(View view) {
        PopupMenu chairs_popup = new PopupMenu(this, view);
        chairs_popup.setOnMenuItemClickListener(this);
        chairs_popup.inflate(R.menu.chairs_menu);
        chairs_popup.show();
    }

    public void showTablesPopUp(View view) {
        PopupMenu tables_popup = new PopupMenu(this, view);
        tables_popup.setOnMenuItemClickListener(this);
        tables_popup.inflate(R.menu.tables_menu);
        tables_popup.show();
    }

    public void showMirrorsPopUp(View view) {
        PopupMenu mirrors_popup = new PopupMenu(this, view);
        mirrors_popup.setOnMenuItemClickListener(this);
        mirrors_popup.inflate(R.menu.mirrors_menu);
        mirrors_popup.show();
    }

    public void showChandeliersPopUp(View view) {
        PopupMenu chandeliers_popup = new PopupMenu(this, view);
        chandeliers_popup.setOnMenuItemClickListener(this);
        chandeliers_popup.inflate(R.menu.chandeliers_menu);
        chandeliers_popup.show();
    }

    public void showSofaPopUp(View view) {
        PopupMenu sofa_popup = new PopupMenu(this, view);
        sofa_popup.setOnMenuItemClickListener(this);
        sofa_popup.inflate(R.menu.sofas_menu);
        sofa_popup.show();
    }
}