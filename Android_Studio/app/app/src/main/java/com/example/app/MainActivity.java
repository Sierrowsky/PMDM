package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickBtn(View view) {
        String mensaje = "Activando ALARMA SILIENCIOSA";
        int hora= 10;
        int minutos= 10;
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, mensaje).putExtra(AlarmClock.EXTRA_HOUR,hora).putExtra(AlarmClock.EXTRA_MINUTES,minutos);
        if (intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }else{
            Toast.makeText(this,"No se puesde",Toast.LENGTH_SHORT);
        }
    }
}