package com.apkglobal.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                Intent one = new Intent(Categories.this, Anxiety_category.class);
                startActivity(one);
                break;
            case R.id.btn2:
                Intent two = new Intent(Categories.this, Beginners_category.class);
                startActivity(two);
                break;
            case R.id.btn3:
                Intent three = new Intent(Categories.this, Backpain_category.class);
                startActivity(three);
                break;
            case R.id.btn4:
                Intent four = new Intent(Categories.this, Fitness_category.class);
                startActivity(four);
                break;
        }
    }
}

