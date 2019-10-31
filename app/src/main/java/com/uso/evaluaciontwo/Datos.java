package com.uso.evaluaciontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("HS16-I04-001");
        }
    }
}
