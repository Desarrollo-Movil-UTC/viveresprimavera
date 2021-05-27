package com.utc.aplicacionejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
@autores: Sandoval, Sanchez, Rovayo
@creado: 24/05/2021
@modificado: 26/05/2021
@descripcion: varias Activity - Pantalla productos - share preferences
*/

public class productosActivity extends AppCompatActivity {

    private EditText txtProducto, txtCantidad, txtPrecio, txtDescripcion, txtProveedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        Context context = this;
        SharedPreferences sharedprefs = getSharedPreferences("ArchivoSP", context.MODE_PRIVATE);

        txtProducto = (EditText) findViewById(R.id.txtProducto);
        txtCantidad = (EditText) findViewById(R.id.txtCantidad);
        txtPrecio = (EditText) findViewById(R.id.txtPrecio);
        txtDescripcion = (EditText) findViewById(R.id.txtDescripcion);
        txtProveedor = (EditText) findViewById(R.id.txtProveedor);
        txtProducto.setText(sharedprefs.getString("producto",""));
        txtCantidad.setText(sharedprefs.getString("cantidad",""));
        txtPrecio.setText(sharedprefs.getString("precio",""));
        txtDescripcion.setText(sharedprefs.getString("descripcion",""));
        txtProveedor.setText(sharedprefs.getString("proveedor",""));
    }

    //PROCESO 2: Boton registrar regresa a pantalla principal
    public void registrarProducto(View vista){
        SharedPreferences preferencias = getSharedPreferences("ArchivoSP", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("producto", txtProducto.getText().toString());
        editor.putString("cantidad", txtCantidad.getText().toString());
        editor.putString("precio", txtPrecio.getText().toString());
        editor.putString("descripcion", txtDescripcion.getText().toString());
        editor.putString("proveedor", txtProveedor.getText().toString());
        editor.commit();
        Intent pantallaPrincipal=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pantallaPrincipal);
    }

    //PROCESO 3: Boton cancelar cuenta
    public void cerrarPantallaProductos(View vista){
        finish(); //Cerrando la pantalla de registro
    }
}