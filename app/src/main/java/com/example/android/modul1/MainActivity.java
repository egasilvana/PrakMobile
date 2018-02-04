package com.example.android.modul1;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Makan, Porsi;
    Intent intent;
    String restaurant, menu;
    int porsii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Makan = (EditText) findViewById(R.id.et_food);
        Porsi = (EditText) findViewById(R.id.et_portion);
        intent = new Intent(this, descriptionn.class);

    }

    public void onEatbus(View view) {
        menu = Makan.getText().toString();
        restaurant = "Eatbus";
        porsii = Integer.parseInt(Porsi.getText().toString());
        int total = 50000 * porsii;
        intent.putExtra("rm", restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsii);
        intent.putExtra("harga", total);
        Toast toast = Toast.makeText(getApplicationContext(), "Uang kamu gacukup buat makan disini!", Toast.LENGTH_SHORT);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = Makan.getText().toString();
        restaurant = "Abnormal";
        porsii = Integer.parseInt(Porsi.getText().toString());
        int total = 30000 * Integer.parseInt(Porsi.getText().toString());
        intent.putExtra("rm", restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsii);
        intent.putExtra("harga", total);
        Toast toast1 = Toast.makeText(getApplicationContext(), "Makan sini aja!", Toast.LENGTH_SHORT);
        startActivity(intent);
    }
}
