package com.uso.evaluaciontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("HS16-I04-001");
        }
    }
    public void OnClickCalculadora(View v){
        Intent i = new Intent(this,Calculadora.class);
        startActivity(i);
    }
    public void OnClickDatos(View v){
        Intent i = new Intent(this,Datos.class);
        startActivity(i);
    }
}
