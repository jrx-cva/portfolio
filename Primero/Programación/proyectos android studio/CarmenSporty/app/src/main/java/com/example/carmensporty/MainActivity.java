package com.example.carmensporty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Controlador myControlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner = findViewById(R.id.spinner);
        myControlador = Controlador.getSingleton(this, mySpinner);

        try {
            myControlador.iniciaDatos();
        } catch(IOException exception) {
            exception.printStackTrace();
            return;
        }
    }



    //Action Button
    public void ButCalcular(View view) {
        //Respuesta
        TextView tv4;
        Float minutos, kgr;
        String descripcion;

        minutos = Float.valueOf(((EditText)findViewById(R.id.et1)).getText().toString());
        kgr = Float.valueOf(((EditText)findViewById(R.id.et2)).getText().toString());
        descripcion = ((Spinner)findViewById(R.id.spinner)).getSelectedItem().toString();

        tv4 = findViewById(R.id.tv4);
        tv4.setText(myControlador.ButCalcular(minutos,kgr,descripcion) + " KCal");
    }
}
