package com.example.a03_ciclo_de_vida_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //PASO 1. VARTIABLES DE LA VISTA

    private Button btnAbrir;




    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","6 - Ejecuto onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5 - Ejecuto onStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4 - Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3 - Ejecuto onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2 - Ejecuto onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // LA clase log nos muestra los fallos y el flujo de la aplicacion
        // podemos filtrar con la etiqueta que queramos y mensaje
        Log.e("ESTADOS","1 - Ejecuto onCreate");

    // ponemos la accion que va a realizar el boton
        btnAbrir = findViewById(R.id.btnAbrirMain);
        //LO QUE VA A REALIZAR CUANDO LE DEMOS CLICK
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                * Vehiculo conductor -> Intent (objeto encargado de avisar a android:
                * 1. quien quiere abrir una ventana (permisos y demás)
                * 2. Que activity quiere abrir)
                * */

                // Tengo dos tipos de intent
                // - implicitos => abren actividades del sistema, camara, galeria,contactos,telefono, no necesita permisos
                // - explicitos => actividad propia

                // indicamos que soy yo en main activity y que abra la segunda actividad -- this es el onclickListener, por eso tiene que tener el nombre delante
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //necesita el intent para saber que quiere hacer
                startActivity(intent);



            }
        });
    }





}