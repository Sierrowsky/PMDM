package com.example.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ToggleButton toggleButton;
    private Switch swichWIFI;
    private CheckBox checkBoxAcepto;
    private EditText txtAlfanumerico, txtdecimal, txtnombre;
    private Button btnestandar;
    private RadioGroup grupoRad;
    private RadioButton radioSi, radioNo, radioA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ///////////////////////////////////////////
        //inicializar variables
        toggleButton = findViewById(R.id.toggle1pruebas);
        //asignar variables
        toggleButton.setOnClickListener(this);
        /////////////////////////////////////////////
        //inicializar variables
        swichWIFI = findViewById(R.id.swWifi);
        //asignar variables
        swichWIFI.setOnClickListener(this);
////////////////////////////////////////////////////////////
        //inicializar variables
        checkBoxAcepto = findViewById(R.id.chkverdad);
        //asignar variables
        checkBoxAcepto.setOnClickListener(this);
////////////////////////////////////////////////////
        //inicializar variables
        txtAlfanumerico = findViewById(R.id.etxtnumero);
        txtdecimal = findViewById(R.id.etxtdecimal);
        txtnombre = findViewById(R.id.etxtnombre);
        //asignar variables
        txtAlfanumerico.setOnClickListener(this);
        txtdecimal.setOnClickListener(this);
        txtnombre.setOnClickListener(this);
////////////////////////////////////////////////////////
        //inicializar variables
        btnestandar = findViewById(R.id.btnStandar);
        //asignar variables
        btnestandar.setOnClickListener(this);
///////////////////////////////////////////////////////
        //escuchador
        checkBoxAcepto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "cambio de Estado ACEPTO", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "cambio de Estado NO ACEPTO", Toast.LENGTH_SHORT).show();
                }
            }
        });
///////////////////////////////////////////////////////
        //inicializar variables
        grupoRad = findViewById(R.id.radioGrupo);
        //asignar variables
        grupoRad.setOnClickListener(this);
///////////////////////////////////////////////////////
        //inicializar variables
        radioSi = findViewById(R.id.rbtSI);
        radioNo = findViewById(R.id.rbtNO);
        radioA = findViewById(R.id.rbtAvcs);
        //asignar variables
        radioSi.setOnClickListener(this);
        radioNo.setOnClickListener(this);
        radioA.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.toggle1pruebas) {
            if (toggleButton.isChecked()) {
                Toast.makeText(this, "toggle activado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "toggle desactivado", Toast.LENGTH_SHORT).show();
            }
        }//end toogle
        else if (v.getId() == R.id.swWifi) {
            if (swichWIFI.isChecked()) {
                Toast.makeText(this, "swich activado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "swich desactivado", Toast.LENGTH_SHORT).show();
            }
        }//end toogle
        else if (v.getId() == R.id.chkverdad) {
            if (checkBoxAcepto.isChecked()) {
                Toast.makeText(this, "check activado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "check desactivado", Toast.LENGTH_SHORT).show();
            }
        }
        else if (v.getId() == R.id.btnStandar) {
           String mensaje;
           mensaje = txtnombre.getText().toString()+"\n"+
                   txtAlfanumerico.getText().toString()+"\n"+
                   txtdecimal.getText().toString();
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        }//entEtiquetaTexto
        else if (v.getId() == R.id.rbtSI) {
            Toast.makeText(this, "radio SI", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.rbtNO) {
            Toast.makeText(this, "radio NOO", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.rbtAvcs) {
            Toast.makeText(this, "radio A veces", Toast.LENGTH_SHORT).show();
        }

    }
}