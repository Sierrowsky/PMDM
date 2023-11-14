package com.example.intentsimplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickBtn(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btn_contactos:
                //Generar la accion del intent implicito: ACTION_VIEW
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(intent);
                break;
            case R.id.btn_Dial:
                //Generar la accion del intent implicito: ACTION_DIAL
                intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
                break;
            case R.id.btn_Dial_Premarcado:
                //Generar la accion del intent implicito: ACTION_DIAL con Número
                intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+34)986111111"));
                startActivity(intent);
                break;
            case R.id.btn_Llamada_Directa:
                //Generar la accion del intent implicito: ATCION_CALL
                intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:(+34)986222444"));
                startActivity(intent);
                break;
                //averiguar si el permiso ya ha sido concedido
            if(checkSelfPermission(Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
                //realizar la llamada
            }
        }//End Switch
    }
}