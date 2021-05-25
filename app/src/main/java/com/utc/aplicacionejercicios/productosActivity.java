package com.utc.aplicacionejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
@autores: Sandoval, Sanchez, Rovayo
@creado: 24/05/2021
@modificado: 24/05/2021
@descripcion: varias Activity - Pantalla productos
*/

public class productosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
    }

    //PROCESO 2: Boton registrar regresa a pantalla principal
    public void registrarProducto(View vista){
        Intent pantallaPrincipal=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pantallaPrincipal);
    }

    //PROCESO 3: Boton cancelar cuenta
    public void cerrarPantallaProductos(View vista){
        finish(); //Cerrando la pantalla de registro
    }
}