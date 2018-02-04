package com.example.android.modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class descriptionn extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPortion, tvPrice;
    String restaurant,menu;
    int portion, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_descriptionn);
        tvRestaurant = (TextView)findViewById(R.id.tv_restaurant); //mengambil id dari xml
        tvMenu = (TextView)findViewById(R.id.tv_menu);
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvPrice = (TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent(); //mengambil data dari activity sebelumnya
        restaurant = intent.getStringExtra("rm");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("porsi", 0);
        price = intent.getIntExtra("harga", 0);

        tvRestaurant.setText(restaurant); //untuk mengisi komponen dengan datanya
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvPrice.setText(""+price);
    }
}