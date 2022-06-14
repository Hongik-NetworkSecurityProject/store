package com.hongik.project.graduation.store.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageButton;


import com.hongik.project.graduation.store.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuButton = findViewById(R.id.menu_bar);
        drawerLayout = findViewById(R.id.drawer_layout);



        menuButton.setOnClickListener(view -> {

            if(!drawerLayout.isDrawerOpen(Gravity.LEFT)){
                drawerLayout.openDrawer(GravityCompat.START);
            } else {
                drawerLayout.closeDrawer(Gravity.LEFT);
            }

        });
    }

}