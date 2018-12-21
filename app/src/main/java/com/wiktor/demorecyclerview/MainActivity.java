package com.wiktor.demorecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_1:
                Intent intent1 = new Intent(this, ListViewActivity.class);
                startActivity(intent1);
                break;

            case R.id.button_2:
                Intent intent2 = new Intent(this, ResyclerViewActivity.class);
                startActivity(intent2);
                break;

            case R.id.button_3:
                Intent intent3 = new Intent(this, ResyclerViewActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
