package com.utc.aplicacionejercicios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

/*
   @autores:Sandoval, Sanchez,Rovayo
   @creación/ 24/05/2021
   @fModificación 24/05/2021
   @descripción: navegar por internet a traves de un webview
*/
public class buscarweb extends AppCompatActivity {
    EditText txtUrl; //definicion de variable para capturar la url ingresada por el usuario
    WebView webView1; //definicion de variable para mostrar las paginas web solicitadas por el usuario
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscarweb);
        //mapeo de elementos graficos (llamarlos a las actividades)
        txtUrl = (EditText) findViewById(R.id.txtUrl); //relacionar/mapear el elemento txtUrl
        webView1 = (WebView)findViewById(R.id.webView);//relacionar/maperar el elemento webview1
    }

    //proceso2
    public void buscarPaginaWeb(View vista){ //se recibe la vista desde la cual se va a ejecutar la funcion
        String urlIngresada = txtUrl.getText().toString();//capturar el valor ingresado por el usuario en el txturl y lo guardamos en urlIngresada
        webView1.setWebViewClient(new WebViewClient()); // crear un navegador cada vez que el usuario cree una nueva url
        webView1.getSettings().setJavaScriptEnabled(true); // habilitar todoslos elementos dentro de las paginas web que se esta buscando
        webView1.getSettings().setDomStorageEnabled(true); //habilitar todos los elementos de Dom de la pagina web
        webView1.loadUrl(urlIngresada); //cargando en el navegador la url ingresada por el usuario
        Toast.makeText(getApplicationContext(),"cargando pagina, por favor espere..",Toast.LENGTH_LONG).show(); //mostrar en la pantalla un mensaje informativo, salida2

    }
}