package com.example.ejemploeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TVMesg;
    private Button btnSi, btnNo, btna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asociar el objeto TextView con la correspondiente vista del layout
        TVMesg = findViewById(R.id.TVMsg);
        btnSi=findViewById(R.id.btnSi);
        btnNo=findViewById(R.id.btnNo);
        btna=findViewById(R.id.btna);

    }
/*
    public void onClickbtnSi(View view) {
        //operaciones para gestionar la pulsacion del botón Si
        TVMesg.setText("Pulsaste Si");

    }
    public void onClickbtnNo(View view) {
        //operaciones para gestionar la pulsacion del botón No
        TVMesg.setText("Pulsaste No");
    }
    public void onClickbtnAveces(View view) {
        //operaciones para gestionar la pulsacion del botón A veces
        TVMesg.setText("Pulsaste ª");
    }

 */
    public void onClickbtn(View view){/*
        switch (view.getId()){
            case R.id.btnSi:
                TVMesg.setText("Pulsaste Si");
                break;
            case R.id.btnNo:
            TVMesg.setText("Pulsaste No");
                break;
            case R.id.btna:
                TVMesg.setText("Pulsaste ª");
            break;
        }*/
        if (view.getId() == R.id.btnSi){
            TVMesg.setText("Pulsaste Si");
        }else if (view.getId() == R.id.btnNo){
            TVMesg.setText("Pulsaste No");
        }else if(view.getId() == R.id.btna){
            TVMesg.setText("Pulsaste a");
        }
    }
}