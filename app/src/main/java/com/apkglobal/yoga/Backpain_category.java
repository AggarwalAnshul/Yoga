package com.apkglobal.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Backpain_category extends AppCompatActivity implements View.OnClickListener {
    Button btn_chakrasana, btn_trikonaasana, btn_garudasana, btn_salabhasana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpain_category);

        btn_chakrasana = (Button)findViewById(R.id.btn_chakrasana);
        btn_trikonaasana = (Button)findViewById(R.id.btn_trikonaasana);
        btn_garudasana = (Button)findViewById(R.id.btn_garudasana);
        btn_salabhasana = (Button)findViewById(R.id.btn_salabhasana);

        btn_chakrasana.setOnClickListener(this);
        btn_trikonaasana.setOnClickListener(this);
        btn_garudasana.setOnClickListener(this);
        btn_salabhasana.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_chakrasana:
                Intent chakrasana = new Intent(Backpain_category.this, Urdhva_Dhanurasana.class);
                startActivity(chakrasana);
                break;

            case R.id.btn_trikonaasana:
                Intent trikonaasana = new Intent(Backpain_category.this, MainActivity.class);
                startActivity(trikonaasana);
                break;

            case R.id.btn_garudasana:
                Intent garudasana = new Intent(Backpain_category.this, Garudasana.class);
                startActivity(garudasana);
                break;

            case R.id.btn_salabhasana:
                Intent salabhasana = new Intent(Backpain_category.this, Ardh_Shalabasana.class);
                startActivity(salabhasana);
                break;

        }
    }
}
