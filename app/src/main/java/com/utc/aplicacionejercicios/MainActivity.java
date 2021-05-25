package com.utc.aplicacionejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/*
@autores: Sandoval, Sanchez, Rovayo
@creado: 24/05/2021
@modificado: 24/05/2021
@descripcion: varias Activity - Pantalla principal de viveres primavera
*/


public class MainActivity extends AppCompatActivity {

    //PROCESO 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //PROCESO 2: abrir pantalla de productos
    public void abrirPantallaProductos(View vista){
        Intent pantallaProductos=new Intent(getApplicationContext(),productosActivity.class);
        startActivity(pantallaProductos);

    //proceso2
    public void abrirActividadBuscarWeb(View vista){ //metodo para abrir ventana de registro
        Intent pantallaRegistro= new Intent(getApplicationContext(),buscarweb.class); //creando in intnt para invocar a registro activicty
        startActivity(pantallaRegistro); //iniciamos la pantalla de Registro


    }
}