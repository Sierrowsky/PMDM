package com.example.a2023_pablosierraperez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private TextView tvResultado,tvIMC;
    private ImageView ivIMCN,ivIMCS,ivIMCO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        tvResultado = findViewById(R.id.tvResultado);
        Intent intent = getIntent();
        String K =intent.getStringExtra("K");
        String M = intent.getStringExtra("M");
        float Metros= Float.parseFloat(K);
        float Kg = Float.parseFloat(M);
        float IMC = Kg/(Metros * Metros);
        tvIMC = findViewById(R.id.txtIMC);
        tvResultado.setText("IMC = " + IMC);
        ivIMCN = findViewById(R.id.ivIMCN);
        ivIMCS = findViewById(R.id.ivIMCS);
        ivIMCO = findViewById(R.id.ivIMCO);
        if (IMC<25){
            ivIMCN.setVisibility(View.VISIBLE);
            tvIMC.setText("NORMAL");
        }else if (IMC >=25 && IMC < 30){
            ivIMCS.setVisibility(View.VISIBLE);
            tvIMC.setText("SOBREPESO");
        } else if (IMC >= 30) {
            ivIMCO.setVisibility(View.VISIBLE);
            tvIMC.setText("OBESIDAD");


        }

    }
}