package com.giovanni.example.multiactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.btnAc1)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnAc2)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch(v.getId()) {
            case R.id.btnAc1:
                intent = new Intent(this, Activity1.class);
                break;
            case R.id.btnAc2:
                intent = new Intent(this, Activity2.class);
                break;
            default:
        }

        if (intent != null)
            startActivity(intent);
    }
}