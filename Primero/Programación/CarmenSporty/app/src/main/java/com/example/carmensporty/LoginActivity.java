package com.example.carmensporty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    protected Controlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_login));
        controlador = Controlador.getSingleton();
        controlador.cargarUsuarios();

    }

    public void volverActivity(View view) {
        String password;
        String name;

        password = ((EditText) findViewById(R.id.etContraseña)).getText().toString();
        name = ((EditText) findViewById(R.id.etNombre)).getText().toString();
        TextView comprobar = (TextView) findViewById(R.id.tvError);

        if (controlador.estaBien(name, password)) {
            MainActivity.logeado = true;
            Intent intent = new Intent(LoginActivity.this,
                    MainActivity.class);
            startActivity(intent);
        } else {
            comprobar.setText("There ir an error in 'Name' or 'Password'");
        }
    }

    //el siguiente método te permite clickar un botón para que te lleve a la actividad "Register"
    public void registerActivity(View view){
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);

    }
}


