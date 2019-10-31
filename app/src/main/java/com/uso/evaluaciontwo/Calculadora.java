package com.uso.evaluaciontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    TextView txvResultado, txvOperacion;
    Button btnDEL, btnAC, btnMas, btnMenos, btnPor, btnEntre, btnIgual, btnPA, btnPC, btnPunto, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    public static String OPERACION = "";
    public static Object RESULTADO = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("HS16-I04-001");
        }
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAC = findViewById(R.id.btnAC);
        btnDEL = findViewById(R.id.btnDEL);
        btnMenos = findViewById(R.id.btnMenos);
        btnMas = findViewById(R.id.btnMas);
        btnEntre = findViewById(R.id.btnEntre);
        btnPor = findViewById(R.id.btnPor);
        btnIgual = findViewById(R.id.btnIgual);
        txvOperacion = findViewById(R.id.txvOperacion);
        txvResultado = findViewById(R.id.txvResultado);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnDEL.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnEntre.setOnClickListener(this);
        btnPor.setOnClickListener(this);
        btnIgual.setOnClickListener(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Se cumple que sea Landscape entonces llamo a mis controles
            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);
            btn3 = findViewById(R.id.btn3);
            btn4 = findViewById(R.id.btn4);
            btn5 = findViewById(R.id.btn5);
            btn6 = findViewById(R.id.btn6);
            btn7 = findViewById(R.id.btn7);
            btn8 = findViewById(R.id.btn8);
            btn9 = findViewById(R.id.btn9);
            btn0 = findViewById(R.id.btn0);
            btnAC = findViewById(R.id.btnAC);
            btnDEL = findViewById(R.id.btnDEL);
            btnMenos = findViewById(R.id.btnMenos);
            btnMas = findViewById(R.id.btnMas);
            btnEntre = findViewById(R.id.btnEntre);
            btnPor = findViewById(R.id.btnPor);
            btnIgual = findViewById(R.id.btnIgual);
            txvOperacion = findViewById(R.id.txvOperacion);
            txvResultado = findViewById(R.id.txvResultado);
            btnPunto = findViewById(R.id.btnPunto);
            btnPA = findViewById(R.id.btnPA);
            btnPC = findViewById(R.id.btnPC);
            btn1.setOnClickListener(this);
            btn2.setOnClickListener(this);
            btn3.setOnClickListener(this);
            btn4.setOnClickListener(this);
            btn5.setOnClickListener(this);
            btn6.setOnClickListener(this);
            btn7.setOnClickListener(this);
            btn8.setOnClickListener(this);
            btn9.setOnClickListener(this);
            btn0.setOnClickListener(this);
            btnAC.setOnClickListener(this);
            btnDEL.setOnClickListener(this);
            btnMenos.setOnClickListener(this);
            btnMas.setOnClickListener(this);
            btnEntre.setOnClickListener(this);
            btnPor.setOnClickListener(this);
            btnIgual.setOnClickListener(this);
            btnPA.setOnClickListener(this);
            btnPC.setOnClickListener(this);
            btnPunto.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                OPERACION = OPERACION + "0";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn1:
                OPERACION = OPERACION + "1";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn2:
                OPERACION = OPERACION + "2";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn3:
                OPERACION = OPERACION + "3";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn4:
                OPERACION = OPERACION + "4";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn5:
                OPERACION = OPERACION + "5";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn6:
                OPERACION = OPERACION + "6";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn7:
                OPERACION = OPERACION + "7";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn8:
                OPERACION = OPERACION + "8";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btn9:
                OPERACION = OPERACION + "9";
                txvOperacion.setText(OPERACION);
                break;
            case R.id.btnPA:
            {
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals(".") | OPERACION.substring(OPERACION.length() - 1).equals("(")) {

                    }else{
                        OPERACION=OPERACION+"(";
                        txvOperacion.setText(OPERACION);
                    }
                }else{
                    OPERACION=OPERACION+"(";
                    txvOperacion.setText(OPERACION);
                }
            }
                break;
            case R.id.btnPC:
            {
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals(".")) {

                    }else{
                        OPERACION=OPERACION+")";
                        txvOperacion.setText(OPERACION);
                    }
                }
            }
                break;
            case R.id.btnPunto:
            {
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals(".") |
                            OPERACION.substring(OPERACION.length() - 1).equals("+") |
                            OPERACION.substring(OPERACION.length() - 1).equals("-") |
                            OPERACION.substring(OPERACION.length() - 1).equals("/") |
                            OPERACION.substring(OPERACION.length() - 1).equals("*") |
                            OPERACION.substring(OPERACION.length() - 1).equals("(") |
                            OPERACION.substring(OPERACION.length() - 1).equals(")")) {

                    }else{
                        OPERACION=OPERACION+".";
                        txvOperacion.setText(OPERACION);
                    }
                }
            }
                break;
            case R.id.btnDEL:
                if(OPERACION.length() > 0) {
                    OPERACION = OPERACION.substring(0, OPERACION.length() - 1);
                    txvOperacion.setText(OPERACION);
                }else{

                }
                break;
            case R.id.btnAC:
                OPERACION = "";
                RESULTADO = null;
                txvOperacion.setText(OPERACION);
                txvResultado.setText("");
                break;
            case R.id.btnMas: {
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals("+") | OPERACION.substring(OPERACION.length() - 1).equals(".")) {

                    } else if (OPERACION.substring(OPERACION.length() - 1).equals("*") | OPERACION.substring(OPERACION.length() - 1).equals("-") | OPERACION.substring(OPERACION.length() - 1).equals("/")) {
                        OPERACION = OPERACION.substring(0, OPERACION.length() - 1);
                        txvOperacion.setText(OPERACION);
                        OPERACION = OPERACION + "+";
                        txvOperacion.setText(OPERACION);
                    } else {
                        OPERACION = OPERACION + "+";
                        txvOperacion.setText(OPERACION);
                    }
                }
            }
            break;
            case R.id.btnMenos:{
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals("-") | OPERACION.substring(OPERACION.length() - 1).equals(".")) {

                    } else if (OPERACION.substring(OPERACION.length() - 1).equals("+")) {
                        OPERACION = OPERACION.substring(0, OPERACION.length() - 1);
                        txvOperacion.setText(OPERACION);
                        OPERACION = OPERACION + "-";
                        txvOperacion.setText(OPERACION);
                    } else {
                        OPERACION = OPERACION + "-";
                        txvOperacion.setText(OPERACION);
                    }
                }else{
                    OPERACION=OPERACION+"-";
                    txvOperacion.setText(OPERACION);
                }
            }
                break;
            case R.id.btnPor: {
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals("*") | OPERACION.substring(OPERACION.length() - 1).equals(".")) {

                    } else if (OPERACION.substring(OPERACION.length() - 1).equals("-") |
                            OPERACION.substring(OPERACION.length() - 1).equals("+") |
                            OPERACION.substring(OPERACION.length() - 1).equals("/")) {

                        OPERACION = OPERACION.substring(0, OPERACION.length() - 1);
                        txvOperacion.setText(OPERACION);
                        OPERACION = OPERACION + "*";
                        txvOperacion.setText(OPERACION);
                    } else {
                        OPERACION = OPERACION + "*";
                        txvOperacion.setText(OPERACION);
                    }
                }
            }
                break;
            case R.id.btnEntre:{
                if (!OPERACION.isEmpty()) {
                    if (OPERACION.substring(OPERACION.length() - 1).equals("/") | OPERACION.substring(OPERACION.length() - 1).equals(".")) {

                    } else if (OPERACION.substring(OPERACION.length() - 1).equals("-") |
                            OPERACION.substring(OPERACION.length() - 1).equals("+") |
                            OPERACION.substring(OPERACION.length() - 1).equals("*")){

                        OPERACION = OPERACION.substring(0, OPERACION.length() - 1);
                        txvOperacion.setText(OPERACION);
                        OPERACION = OPERACION + "/";
                        txvOperacion.setText(OPERACION);
                    } else {
                        OPERACION = OPERACION + "/";
                        txvOperacion.setText(OPERACION);
                    }
                }
            }
                break;
            case R.id.btnIgual: {
            CalcularOperacion();
            }
                break;
        }
    }
    public void CalcularOperacion(){
        if(OPERACION.length() > 0) {
            if(OPERACION.substring(OPERACION.length() - 1).equals("+") | OPERACION.substring(OPERACION.length() - 1).equals("-") |
                    OPERACION.substring(OPERACION.length() - 1).equals("*") | OPERACION.substring(OPERACION.length() - 1).equals("/") |
                    OPERACION.substring(OPERACION.length() - 1).equals(".") | OPERACION.substring(OPERACION.length() - 1).equals("(")) {

            }else{
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                try {
                    RESULTADO = engine.eval(OPERACION);
                    txvResultado.setTextColor(Color.parseColor("#616161"));
                    txvResultado.setText(RESULTADO.toString());
                } catch (ScriptException e) {
                    Log.d("Calculadora", " ScriptEngine error: " + e.getMessage());
                    txvResultado.setTextColor(0xfff00000);
                    txvResultado.setText("Expresion incorrecta");
                }
                //NO realizar parsing mediante Integer.parseInt(...),
                //Ya que se perderían los puntos decimales.

            }
        }else{
            txvResultado.setText("");
        }
    }
}
