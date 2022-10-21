package com.example.profile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class Listview extends AppCompatActivity {
    ListView lvGame;
    ArrayList<game> mListgame;
    gameAdapter gameAdt;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.list);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.list:
                        return true;

                }
                return false;
            }
        });
        AnhXa();


    }
    private void AnhXa(){
        lvGame = (ListView) findViewById(R.id.listviewgame);
        mListgame = new ArrayList<>();

        int[] stt = {1,2,3,4,5,6};
        String[] tengame = {"Among Us", "Garena Liên Quân Mobile", "PUBG Mobile","Loạn chiến Mobile","Garena Free Fire","Snake Lite"};
        String[] theloai = {"Hành động . Chiến thuật","Hành động . Phiêu lưu","Hành động . Bắn súng chiến thuật","Hành động","Hành động . Bắn súng","Hành động . Trò chơi io"};
        String[] danhgia = {"3.6","3.5","3.2","3.1","4.1","4.2"};
        int [] star = {R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24,R.drawable.ic_baseline_star_24};
        int [] imglogo = {R.drawable.amongus,R.drawable.lienquan,R.drawable.pubg,R.drawable.lienquan,R.drawable.freefire,R.drawable.sanke_lite};
        int [] anhgame = {R.drawable.anhamongus,R.drawable.anhlienquan,R.drawable.anhpubg,R.drawable.anhloanchien,R.drawable.anhfreefire,R.drawable.anhsankelite};
        String [] dungluong = {"76MB","187MB","167MB","364MB","507MB","45MB"};
        String [] chitiet = {"Tham gia phi đoàn của bạn trong một trò chơi nhiều người làm việc theo nhóm và phản bội!","Thắng bại tại kỹ năng!","Game Battle Royale đỉnh nhất","Game Moba mới - Xu hướng cuộc chơi!","Sinh tồn trong 10 phút","Đánh những con sâu khác để phát triển, chơi trò solid.io vui nhộn!"};

        for (int i = 0; i<stt.length;i++){
            game game = new game(stt[i],imglogo[i],anhgame[i],tengame[i],theloai[i],danhgia[i],dungluong[i],star[i],chitiet[i]);
            mListgame.add(game);
        }
        gameAdt = new gameAdapter(Listview.this,mListgame);
        lvGame.setAdapter(gameAdt);
        lvGame.setClickable(true);
        lvGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id    ) {
                Intent i = new Intent(Listview.this,Datail.class);
                i.putExtra("name",tengame[position]);
                i.putExtra("chitiet",chitiet[position]);
                i.putExtra("anh",anhgame[position]);
                i.putExtra("dungluong",dungluong[position]);
                i.putExtra("danhgia",danhgia[position]);
                startActivity(i);
            }
        });
    }
}