package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Datail extends AppCompatActivity {
    private TextView tengame, Chitiet, Danhgia, Dungluong;
    private ImageView  anhgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datail);
        tengame = findViewById(R.id.tvTengame);
        Chitiet = findViewById(R.id.tvChitiet);
        Danhgia = findViewById(R.id.tvdanhgia);
        Dungluong = findViewById(R.id.tvDungluong);
        anhgame = findViewById(R.id.imageView);



        Intent intent = this.getIntent();

        if(intent != null){
            String name = intent.getStringExtra("name");
            String chitiet = intent.getStringExtra("chitiet");
            int anh = intent.getIntExtra("anh",R.drawable.amongus);
            String dungluong = intent.getStringExtra("dungluong");
            String danhgia = intent.getStringExtra("danhgia");

            tengame.setText(name);
            Chitiet.setText(chitiet);
            Danhgia.setText(danhgia);
            Dungluong.setText(dungluong);
            anhgame.setImageResource(anh);

        }
    }
}