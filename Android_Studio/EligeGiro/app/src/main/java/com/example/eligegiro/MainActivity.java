package com.example.eligegiro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvG;
    private TextView giro2;
    private Button btnA;
    private LinearLayout ll1, ll2;
    private RadioButton rbT, rbI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tags();
        tvG.setText("Giramos?");
        tvG.setTextSize(25);
        if (rbT.isChecked()){
            Toast.makeText(this,"Funciono", Toast.LENGTH_SHORT);
            ll1.setVisibility(View.GONE);
            ll2.setVisibility(View.VISIBLE);
        }
    }
    public void tags(){
        tvG = findViewById(R.id.tvG);
        btnA = findViewById(R.id.btnA);
        rbT= findViewById(R.id.rbT);
        rbI = findViewById(R.id.rbI);
        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);
        giro2=findViewById(R.id.tvGiro);
    }
}