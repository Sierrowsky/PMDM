package com.example.ejemploactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        btnReturn=findViewById(R.id.btnRespuesta);
        //escuchador del boton retorno
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Volver a la actividad 1 enviandole 1 dato
                String dato = "AH te envia saludos";
                Intent intent = new Intent();
                intent.putExtra("retorno",dato);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


}