package com.example.cuentaclicksv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TVMsg;
    private Button btnClk;
    private int N =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClk = findViewById(R.id.btnClk);
        TVMsg = findViewById(R.id.txtClick);
        Aux escuchadorClk = new Aux();
        btnClk.setOnClickListener(escuchadorClk);



    }
    private class Aux implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            TVMsg.setText("Has pulsado " + N);
            N++;
        }
    }


}
