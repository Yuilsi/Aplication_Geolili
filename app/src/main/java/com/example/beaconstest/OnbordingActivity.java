package com.example.beaconstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnbordingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onbording);

        //comitttt
    }

    public void goLogin(View view){
        Intent i = new Intent (this,IniciarSesionActivity.class);
        startActivity(i);

    }

    public void goRegister(View view){
        Intent i = new Intent(this,RegistroActivity.class);
        startActivity(i);

    }
}