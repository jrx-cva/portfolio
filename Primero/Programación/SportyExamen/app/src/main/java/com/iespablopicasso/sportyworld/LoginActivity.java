package com.iespablopicasso.sportyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    protected Controlador miControlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //añadimos cosas aquí
        miControlador = Controlador.getSingleton();

    }

    /** Called when the user touches the button */
    public void onLoginClick(View view) {
        // Do something in response to button click
        String user,passwd,dni;


        user = ((EditText)findViewById(R.id.user)).getText().toString();
        passwd = ((EditText)findViewById(R.id.passwd)).getText().toString();
        dni = ((EditText)findViewById(R.id.newdni)).getText().toString();

        //Comprobar si el usuario es  correcto y AÑADIR ACCESO
        if (miControlador.testLogin(user,passwd,dni)) {
            miControlador.cargaAccesos(user);
                finish();
        }  else  {
            ((TextView)findViewById(R.id.loginResult)).setText("login access error");
        }


    }

    public void onRegistrarClick(View view) {
        Intent miIntent = new Intent(miControlador.myApp, NewUserActivity.class);
        startActivity(miIntent);
    }

    @Override
        protected void onResume() {
            super.onResume();

            //¿¿Qué ha pasado en el registro??
            if (miControlador.estaUsuarioLogeado() && miControlador.esNuevoRegistro()) {
                miControlador.desactivaNuevoRegistro();
                finish();
            }

    }

}
