package com.apkglobal.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Anxiety_category extends AppCompatActivity implements View.OnClickListener {
    Button btn_janushirsasana, btn_check, btn_nadishodhan, btn_katichakrasana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_category);


        btn_janushirsasana = (Button)findViewById(R.id.btn_janushirsasana);

        btn_check = (Button)findViewById(R.id.btn_check);

        btn_nadishodhan = (Button)findViewById(R.id.btn_nadishodhan);

        btn_katichakrasana = (Button)findViewById(R.id.btn_katichakrasana);


        btn_janushirsasana.setOnClickListener(this);
        btn_katichakrasana.setOnClickListener(this);
        btn_check.setOnClickListener(this);
        btn_nadishodhan.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_janushirsasana:
                Intent janushirsasana = new Intent(Anxiety_category.this, Janusirsasana.class);
                startActivity(janushirsasana);
                break;

            case R.id.btn_check:
                Intent sweep = new  Intent(Anxiety_category.this,MainActivity.class);
                startActivity(sweep);
                break;


            case R.id.btn_katichakrasana:
                Intent katichakrasana = new Intent(Anxiety_category.this,Kati_chakrasana.class);
                startActivity(katichakrasana);
                break;


            case R.id.btn_nadishodhan:
                Intent nadishodhan = new Intent(Anxiety_category.this, Nadi_Shodhan_pranayama.class);
                startActivity(nadishodhan);
                break;
        }
    }
}
