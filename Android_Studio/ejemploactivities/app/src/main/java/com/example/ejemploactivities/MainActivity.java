package com.example.ejemploactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int CODIGO_LLAMADA_ACT5 = 0;
    private String datoEnvio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickcambioactividad(View view) {
        if (view.getId()==R.id.actividad2){
            //crear un objeto Inten
            Intent intent = new Intent(this, Activity2.class);
            // Realizar la llamada
            startActivity(intent);
        } else if (view.getId()==R.id.actividad3) {
            Intent intent= new Intent(this, Activity3.class);
            datoEnvio="Actividad 1 envia MSG a Actividad 3";
            //Agregar Datos al input del Intent
            intent.putExtra("Mensaje",datoEnvio);
            startActivity(intent);
        } else if ((view.getId()==R.id.actividad4)) {
            Intent intent = new Intent(this, Activity4.class);
            datoEnvio="Activdad 1 envcia MSG a Actividad 4 mediante Bundle";
            //Agregar objeto al obdle
            Bundle bundle= new Bundle();
            bundle.putString("bundle",datoEnvio);
            //asociar el bundle con el intent
            intent.putExtras(bundle);
            startActivity(intent);
        } else if ((view.getId()==R.id.actividad5)) {
            Intent intent = new Intent(this, Activity5.class);
            //llamada esperando respuesta
            startActivityForResult(intent, CODIGO_LLAMADA_ACT5);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        //vemos que activivty nos ersta constestando
        if (requestCode == CODIGO_LLAMADA_ACT5){
            if (resultCode==RESULT_OK){
                //operaciones si la actividad llamada finaliza según lo previsto
                Toast.makeText(this,"todo ok", Toast.LENGTH_SHORT);

            } else {
                //Operaciones si la actividad no finaliza segun lo previsto
                Toast.makeText(this,"todo no ok", Toast.LENGTH_SHORT);
            }
        }

    }
}