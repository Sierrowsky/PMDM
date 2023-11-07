package com.example.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        //Recuperar el dato enviado desde Acrivity 1 med el intent
        Intent intent = getIntent();
        //Extraemos el Dato
        String datoRec = intent.getStringExtra("Mensaje");
        //Visualizar el dato en la text View
        TextView tv = findViewById(R.id.tvMSG);
        tv.setText(datoRec);
    }
}