package com.example.ejc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.i("ciclo","on create Act2");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo","on start Act2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclo","on Restart Act2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo","on resume Act2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclo","on destroy Act2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclo","on stop Act2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclo","on pause Act2");
    }
}