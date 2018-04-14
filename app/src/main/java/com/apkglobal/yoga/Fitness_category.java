package com.apkglobal.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Fitness_category extends AppCompatActivity implements View.OnClickListener {
    Button btn_chakrasana,btn_salabhasana,btn_vrikshasana;
    Button btn_ums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_category);

        btn_chakrasana = (Button) findViewById(R.id.btn_chakrasana);
        btn_salabhasana = (Button) findViewById(R.id.btn_salabhasana);
        btn_vrikshasana = (Button) findViewById(R.id.btn_vrikshasana);
        btn_ums=(Button)findViewById(R.id.btn_ums);


        btn_chakrasana.setOnClickListener(this);
        btn_salabhasana.setOnClickListener(this);
        btn_vrikshasana.setOnClickListener(this);
        btn_ums.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_chakrasana:
                Intent intent1 = new Intent(Fitness_category.this, Urdhva_Dhanurasana.class);
                startActivity(intent1);
                break;
            case R.id.btn_salabhasana:
                Intent intent2 = new Intent(Fitness_category.this, Ardh_Shalabasana.class);
                startActivity(intent2);
                break;
            case R.id.btn_vrikshasana:
                Intent intent3 = new Intent(Fitness_category.this, Vrikshasana.class);
                startActivity(intent3);
                break;
            case R.id.btn_ums:
                Intent move = new Intent(Fitness_category.this, Urdhvamukha_shvanasana.class);
                startActivity(move);
                break;
/*
            case R.id.btn_urdhvamukha:
                Intent intent4 = new Intent(Fitness_category.this,Urdhvamukha_shvanasana.class);
                startActivity(intent4);
                break;
*/
        }
    }
}