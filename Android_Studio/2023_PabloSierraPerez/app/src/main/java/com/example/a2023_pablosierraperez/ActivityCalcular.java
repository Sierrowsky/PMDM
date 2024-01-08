package com.example.a2023_pablosierraperez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityCalcular extends AppCompatActivity {
    private EditText textoMetros, textoKilos;
    private Button btnCalcular, btnFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular);
        textoMetros = findViewById(R.id.etAltura);
        textoKilos = findViewById(R.id.etPeso);

    }

    public void onClickCalcular(View view) {
        Intent intent= null;
        String M = textoMetros.getText().toString();
        String K = textoKilos.getText().toString();
        intent = new Intent(this, Resultado.class);
        intent.putExtra("M" , M );
        intent.putExtra("K",K);
        startActivity(intent);
    }
}