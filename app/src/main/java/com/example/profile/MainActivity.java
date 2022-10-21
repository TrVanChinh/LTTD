package com.example.profile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnlogout).setOnClickListener(this);
        findViewById(R.id.iconback).setOnClickListener(this);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.list:
                        startActivity(new Intent(getApplicationContext(),Listview.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnlogout) {
            Intent intent = new Intent(this, signIn.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.iconback) {
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
        }
    }
}