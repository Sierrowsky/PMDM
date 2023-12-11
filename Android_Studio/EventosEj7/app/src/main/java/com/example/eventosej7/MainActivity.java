package com.example.eventosej7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.jar.JarEntry;

public class MainActivity extends AppCompatActivity {
    private EditText EditNombre;
    private EditText EditAño;
    private Button btnSaludos;
    private TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditNombre = findViewById(R.id.etNombre);
        EditAño = findViewById(R.id.etNacimiento);
        btnSaludos = findViewById(R.id.btnSaludos);
        tvSaludo = findViewById(R.id.tvResultado);
        btnSaludos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String edad = comprobarEdad() ?"Eres mayor de edad\n" : "Eres menor de edad\n";
                    String Saludos = "Hola ," + EditNombre.getText() + edad;
                    tvSaludo.setText(Saludos);
                    tvSaludo.setVisibility(View.VISIBLE);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this,"Introduzca Datos",Toast.LENGTH_SHORT);
                }
            }
        });
    }
    private boolean comprobarEdad() {
        int y = Integer.parseInt(this.EditAño.getText().toString());
        int current = Calendar.getInstance().get(Calendar.YEAR);

        if ((current - y) >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

}