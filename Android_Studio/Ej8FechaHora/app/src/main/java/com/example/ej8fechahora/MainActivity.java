package com.example.ej8fechahora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TimePicker tp;
    private DatePicker dp;
    private String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp = findViewById(R.id.Time_Picker);
        dp = findViewById(R.id.datePicker);
    }

    public void OnClickBtn(View view) {
        mensaje = "Fecha : " + dp.getDayOfMonth() +"/"+ dp.getMonth() +"/"+ dp.getYear() + "\n" +
                "Hora : " +tp.getHour() +":"+ tp.getMinute();
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }
}