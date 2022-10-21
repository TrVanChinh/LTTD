package com.example.profile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class home extends AppCompatActivity implements View.OnClickListener{
    private TextView profile, listgame;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        profile = findViewById(R.id.tvProfile);
        listgame = findViewById(R.id.tvListgame);
        findViewById(R.id.tvProfile).setOnClickListener(this);
        findViewById(R.id.tvListgame).setOnClickListener(this);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
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
        if(view.getId() == R.id.tvProfile) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.tvListgame){
            Intent intent = new Intent(this, Listview.class);
            startActivity(intent);
        }
    }

}