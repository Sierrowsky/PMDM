package com.example.eventosej6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView TV;
    private RadioGroup RG;
    private RadioButton rbText;
    private RadioButton rbImg;
    private Button btnAc;
    private TextView Girar;
    private ImageView img;
    private EditText et;
    float angulo = 0;
    float rotacion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV = findViewById(R.id.TVM);
        RG = findViewById(R.id.RG);
        rbText = findViewById(R.id.rbTexto);
        rbImg = findViewById(R.id.rbImagen);
        btnAc = findViewById(R.id.btnAceptar);
        Girar = findViewById(R.id.Girar);
        img = findViewById(R.id.Img);
        et = findViewById(R.id.etang);

        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV.setText("");

                    angulo = Integer.parseInt(et.getText().toString());
                    if (angulo > 90 || angulo < 10){
                        Toast.makeText(MainActivity.this, "Introduzaca grados entre 10 y 90", Toast.LENGTH_SHORT).show();
                    } else if (angulo < 90 || angulo > 10) {
                         try {
                            if (rbText.isChecked()) {
                                TV.setText("HOLAAAAAAAA");
                                TV.setTextSize(50);
                                TV.setBackgroundColor(getResources().getColor(com.google.android.material.R.color.cardview_shadow_end_color));
                                TV.setTextColor(getResources().getColor(com.google.android.material.R.color.cardview_light_background));
                            }
                            else if (rbImg.isChecked()) {
                                TV.setBackground(getDrawable(R.drawable.th));
                            }

                            }
                        catch (Exception ex) {
                            Toast.makeText(MainActivity.this, "Valor de grados no valido", Toast.LENGTH_SHORT).show();
                        }
            }
            }

        });


        TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV.setRotation(rotacion);
                rotacion+=angulo;
                if (rotacion>=360){
                    rotacion=0;
                }
            }
        });
    }
}