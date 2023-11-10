package com.example.ejc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ciclo","on create");
    }
    public void onClickcambioactividad(View view) {
        if (view.getId() == R.id.Btn1) {
            //crear un objeto Inten
            Intent intent = new Intent(this, Activity2.class);
            // Realizar la llamada
            startActivity(intent);
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo","on start Act1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclo","on Restart Act1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo","on resume Act1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclo","on destroy Act1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclo","on stop Act1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclo","on pause Act1");
    }
}