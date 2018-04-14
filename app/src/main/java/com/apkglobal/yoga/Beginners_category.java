package com.apkglobal.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Beginners_category extends AppCompatActivity implements View.OnClickListener {
    Button btn_katichakrasana, btn_trikonaasana, btn_hastpadasana,
            btn_ardhachakrasana, btn_vrikshasana, btn_pashchimnamaskarasana, btn_utkatasana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginners_category);


        btn_katichakrasana = (Button) findViewById(R.id.btn_katichakrasana);
        btn_trikonaasana = (Button) findViewById(R.id.btn_trikonaasana);
        btn_hastpadasana=(Button)findViewById(R.id.btn_hastpadasana);
        btn_ardhachakrasana=(Button)findViewById(R.id.btn_ardhachakrasana);
        btn_vrikshasana=(Button)findViewById(R.id.btn_vrikshasana);
        btn_utkatasana=(Button)findViewById(R.id.btn_utkatasana);
        btn_pashchimnamaskarasana=(Button)findViewById(R.id.btn_pashchimnamaskarasana);


        btn_vrikshasana.setOnClickListener(this);
        btn_utkatasana.setOnClickListener(this);
        btn_ardhachakrasana.setOnClickListener(this);
        btn_hastpadasana.setOnClickListener(this);
        btn_trikonaasana.setOnClickListener(this);
        btn_katichakrasana.setOnClickListener(this);
        btn_pashchimnamaskarasana.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_katichakrasana:
                Intent intent = new Intent(Beginners_category.this, Kati_chakrasana.class);
                startActivity(intent);
                break;
            case R.id.btn_trikonaasana:
                Intent trikonaasana = new Intent(Beginners_category.this, MainActivity.class);
                startActivity(trikonaasana);
                break;

            case R.id.btn_hastpadasana:
                Intent hastpadasana = new Intent(Beginners_category.this, Hastpadasana.class);
                startActivity(hastpadasana);
                break;

            case R.id.btn_ardhachakrasana:
                Intent ardhachakrasana = new Intent(Beginners_category.this, ArdhaChakrasana.class);
                startActivity(ardhachakrasana);
                break;

            case R.id.btn_vrikshasana:
                Intent vrikshasana= new Intent(Beginners_category.this, Vrikshasana.class);
                startActivity(vrikshasana);
                break;

            case R.id.btn_pashchimnamaskarasana:
                Intent pashchimnamaskarasana = new Intent(Beginners_category.this, Pashchima_Namaskarasana.class);
                startActivity(pashchimnamaskarasana);
                break;


            case R.id.btn_utkatasana:
                Intent utkatasana = new Intent(Beginners_category.this, Utkatasana.class);
                startActivity(utkatasana);
                break;

        }
    }
}
