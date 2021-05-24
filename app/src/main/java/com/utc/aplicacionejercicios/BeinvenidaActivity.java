package com.utc.aplicacionejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class BeinvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beinvenida);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //acciones que necesite agregar despues del timpo
                Intent ventanaPrincipal=new Intent(getApplicationContext(),MainActivity.class); //construyendo un objeto de tipo ventana para poder abrir la ventana de login
                startActivity(ventanaPrincipal); //solicitamos que habra la actividad principal
                finish(); //cerrando la activity de bienvenida
            }
        }, 4000);

    }
}