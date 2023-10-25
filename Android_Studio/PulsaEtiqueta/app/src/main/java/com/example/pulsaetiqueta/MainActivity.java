package com.example.pulsaetiqueta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView TVSal;
    private float N=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVSal = findViewById(R.id.txtSalut);
        TVSal.setText("Click y te Saludan");
        TVSal.setTextSize(25);
        Aux Salut = new Aux();
        TVSal.setOnClickListener(Salut);
    }
    private class Aux implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            N += 45;
            TVSal.ROTATION.set(TVSal, N);
            TVSal.setTextSize(45);
            TVSal.setBackgroundColor(getResources().getColor(R.color.black));
            TVSal.setTextColor(getResources().getColor(R.color.white));
            TVSal.setText("Pues Giro ");

        }
    }
}