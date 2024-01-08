package com.example.a2023_pablosierraperez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ImagenInicio;
    private RadioGroup rgOpciones;
    private RadioButton rbIMC,rbInformacion;
    private Button Eleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        ImagenInicio = findViewById(R.id.imagenInicio);
        ImagenInicio.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                eleccion();
                return false;
            }
        });

    }
    protected void eleccion(){
        setContentView(R.layout.eleccion);
        rgOpciones=findViewById(R.id.rgOpciones);
        Eleccion=findViewById(R.id.btnEleccion);
        rbIMC=findViewById(R.id.calculoIMC);
        rbInformacion=findViewById(R.id.masInfo);

        rgOpciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.calculoIMC){
                    Eleccion.setText(R.string.rbIMC);


                } else if (checkedId==R.id.masInfo) {
                    Eleccion.setText(R.string.rbInformacion);

                }
            }
        });

    }
    public void onClick(View view) {
        Intent intent = null;
        if (rbIMC.isChecked() ){
            intent = new Intent(this, ActivityCalcular.class);
            startActivity(intent);
        } else if (rbInformacion.isChecked()) {
            intent = new Intent(this, ActivityInformacion.class);
            startActivity(intent);

        }
    }
}