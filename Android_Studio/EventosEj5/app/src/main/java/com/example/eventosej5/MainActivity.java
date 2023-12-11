package com.example.eventosej5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TV;
    private RadioGroup RG;
    private RadioButton rbText;
    private RadioButton rbImg;
    private Button btnAc;
    private TextView Girar;
    private ImageView img;
    float angulo = 0;

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
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedID = RG.getCheckedRadioButtonId();
                TV.setVisibility(View.GONE);
                RG.setVisibility(View.GONE);
                btnAc.setVisibility(View.GONE);
                if (selectedID == rbText.getId()){
                    Girar.setVisibility(View.VISIBLE);
                    Girar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            angulo += 25;
                            Girar.setRotation(angulo);
                        }
                    });
                } else if (selectedID == rbImg.getId()) {
                    img.setVisibility(View.VISIBLE);
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            angulo += 25;
                            img.setRotation(angulo);
                        }
                    });


            }
            }


    });
}
}