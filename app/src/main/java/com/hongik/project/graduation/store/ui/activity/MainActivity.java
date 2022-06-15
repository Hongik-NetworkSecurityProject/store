package com.hongik.project.graduation.store.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageButton;


import com.hongik.project.graduation.store.R;
import com.hongik.project.graduation.store.ui.fragment.NaviContentFragment;
import com.hongik.project.graduation.store.ui.fragment.NaviHeaderFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment naviHeaderFragment = getSupportFragmentManager().findFragmentById(R.id.navigation_header_container);
        Fragment naviContentFragment = getSupportFragmentManager().findFragmentById(R.id.navigation_content_container);


        initMenuBar(naviHeaderFragment, naviContentFragment);


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

    private void initMenuBar(Fragment naviHeaderFragment, Fragment naviContentFragment) {
        if(naviHeaderFragment == null){
            NaviHeaderFragment headerFragment = new NaviHeaderFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.navigation_header_container, headerFragment)
                    .commit();
        }

        if(naviContentFragment == null){
            NaviContentFragment contentFragment = new NaviContentFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.navigation_content_container, contentFragment)
                    .commit();
        }
    }

}