package com.example.bt4_dichuyengiua2manhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.btnQuaylai).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}