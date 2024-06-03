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

public class without_images_home_page extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_images_home_page);
    }

    // Display menu in home page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }


    // Give functionality to clicking on the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.menu_item_1)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_home_page.class);
            startActivity(intent);
            return true;
        }
        // Give functionality to the sort price
        else if(item.getItemId() == R.id.menu_item_price_sort)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_home_page.class);
            Toast.makeText(this, "Sorted By Price", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            return true;
        }
        // Give functionality to sort alphabetically
        else if(item.getItemId() == R.id.menu_item_alpha_sort)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_home_page.class);
            startActivity(intent);
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        // CHAIR SELECTIONS--------------
        if(item.getItemId() == R.id.item_louis_library_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "louis_library");
            intent.putExtra("page", "alpha_sorted");
            startActivity(intent);
            return true;

        }

        else if(item.getItemId() == R.id.item_english_arm_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "english_arm");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_loren_arm_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "loren_arm");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_louis_bar_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "louis_bar");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_louis_dining_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "louis_dining");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_louis_fireside_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "louis_fireside");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_louis_side_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "louis_side");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_montalembert_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "montalembert");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_queen_anne_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "queen_anne");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_tiges_chair)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "tiges_arm");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }


        // TABLE SELECTIONS-------------------
        else if(item.getItemId() == R.id.item_chow_side_table)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "chow_side");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_antibes_cocktail_Table)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "antibes_cocktail");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_balustrade_base_table)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "balustrade_base");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_spanish_oval_table)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "spanish_oval");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_windsor_hexagonal)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "windsor_hexagonal");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        // MIRROR SELECTIONS----------------
        else if(item.getItemId() == R.id.item_charmont_mirror)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "charmont");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_von_howe)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "von_howe");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        // SOFA SELECTIONS--------------------
        else if(item.getItemId() == R.id.item_gainsborough_sofa)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "gainsborough");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_lancaster_sofa)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "lancaster");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        // CHANDELIER SELECTIONS--------------
        else if(item.getItemId() == R.id.item_chantilly_chandelier)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "chantilly");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_gothic_chandelier)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "gothic");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_powder_boom_chandelier)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "powder_boom");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_primitive_chandelier)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "primitive");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        else if(item.getItemId() == R.id.item_small_chateau_chandelier)
        {
            Intent intent = new Intent(without_images_home_page.this, without_images_furniture_viewing.class);
            intent.putExtra("choice", "small_chateau");
            intent.putExtra("page", "alpha_sorted");

            startActivity(intent);
            return true;
        }

        // END OF IF STATEMENTS----------------------
        else
            return false;
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