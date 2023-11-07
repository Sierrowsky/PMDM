package com.example.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        //Recuperar el dato enviado desde Acrivity 1 med el bundle del intent
        Intent intent= getIntent();
        //extraer Bundle
        Bundle bundle= intent.getExtras();
        // Recuperar el dato del Bundle
        String MGS = bundle.getString("bundle");
        //Unica sentencia
        String string = getIntent().getExtras().getString("bundle");
        TextView tv = findViewById(R.id.tvMSG);
        tv.setText(string);
    }
}