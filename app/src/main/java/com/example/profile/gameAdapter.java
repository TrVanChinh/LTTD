package com.example.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class gameAdapter extends ArrayAdapter<game> {

    public gameAdapter(Context context, ArrayList<game> gameArrayAdapter) {

        super(context, R.layout.dong_game, gameArrayAdapter);
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        game game = getItem(position);

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.dong_game,parent,false);

        }



        TextView txtTen = (TextView) view.findViewById(R.id.tvTen);
        TextView txtMota = (TextView) view.findViewById(R.id.tvmota);
        TextView txtDanhGia = (TextView) view.findViewById(R.id.tvDanhGia);
        TextView txtDungluong = (TextView) view.findViewById(R.id.tvdungluong);
        ImageView imgStar = (ImageView) view.findViewById(R.id.imgSao);
        ImageView imgAnh = (ImageView) view.findViewById(R.id.logogame);
        TextView stt = (TextView) view.findViewById(R.id.tvStt);


        txtTen.setText(game.tengame);
        txtMota.setText(game.theloai);
        txtDanhGia.setText(game.danhgia);
        txtDungluong.setText(game.dungluong);
        imgStar.setImageResource(game.star);
        imgAnh.setImageResource(game.logogame);
        stt.setText(Integer.toString(game.stt));

        return  view;
    }
}

