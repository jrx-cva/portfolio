package com.example.carmensporty;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private Controlador controlador;
    private TextView tvErrorRegistrar;
    private EditText etName;
    private EditText etLastName;
    private EditText etDni;
    private EditText etEmail;
    private EditText etUserName;
    private EditText etPassword;


    @Override
    //método que se va a utilizar cuando la actividad se cree
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_register));
        controlador = Controlador.getSingleton();
        controlador.cargarUsuarios();
        etName = (EditText) findViewById(R.id.etNombreRegistrar);
        etLastName = (EditText) findViewById(R.id.etApellidosRegistrar);
        etDni = (EditText) findViewById(R.id.etDniRegistrar);
        etEmail = (EditText) findViewById(R.id.etEmailRegistrar);
        etUserName = (EditText) findViewById(R.id.etUsuarioRegistrar);
        etPassword = (EditText) findViewById(R.id.etPasswordRegistrar);
        tvErrorRegistrar = (TextView) findViewById(R.id.tvErrorRegistrar);
    }

    public void crearUsuario(View view) {
        if (!(etName.getText().toString().isEmpty() || etLastName.getText().toString().isEmpty() || etDni.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty() || etUserName.getText().toString().isEmpty() || etPassword.getText().toString().isEmpty())) {
            if(controlador.estaBienRegister(etName.getText().toString())) {
                controlador.registrarse(etName.getText().toString(),etLastName.getText().toString(),etDni.getText().toString(),etEmail.getText().toString(),etUserName.getText().toString(), etPassword.getText().toString());
            }else {
                tvErrorRegistrar.setText("Este usuario ya está registrado");
            }
        }else {
            tvErrorRegistrar.setText("Algún campo no está completado");
        }

        }


}

