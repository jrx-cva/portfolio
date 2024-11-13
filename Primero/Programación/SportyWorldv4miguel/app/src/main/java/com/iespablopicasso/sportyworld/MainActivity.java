package com.iespablopicasso.sportyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Controlador miControlador;

    EditText etMinutos;
    EditText etKgs;
    Spinner cbEjercicios;



    //Comportamiento de inicio de la aplicación
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner = (Spinner)findViewById(R.id.cbEjercicios);
        //mySpinner.setOnItemSelectedListener(this);
        miControlador = Controlador.getSingleton(this);


        try {
            ArrayList<String> ejercicios = miControlador.iniciaDatos();
            ArrayAdapter<String> itemsAdapter =
                    new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, ejercicios);
            ((Spinner)findViewById(R.id.cbEjercicios)).setAdapter(itemsAdapter);

            itemsAdapter.notifyDataSetChanged();

        } catch(IOException ex) {
            ex.printStackTrace();
        }


    }

    /** Called when the user touches the button */
    public void onCalcularClick(View view) {
        // Do something in response to button click
        TextView tvResultado;
        Float minutos, kgs;
        String descr;

        //Recogemos los valores de la pantalla
        minutos = Float.valueOf(((EditText)findViewById(R.id.etMinutos)).getText().toString());
        kgs = Float.valueOf(((EditText)findViewById(R.id.etKgs)).getText().toString());
        descr = ((Spinner)findViewById(R.id.cbEjercicios)).getSelectedItem().toString();

        //Obtenemos el Textview para mostrar el resultado
        tvResultado = findViewById(R.id.tvResultado);

        //Pedimos al controlador el cálculo y asignamos al TextView el resultado
        tvResultado.setText(miControlador.calculaKCal(minutos,kgs,descr) + " KCal");
    }



    /** Called when the user touches the button */
    public void mostrar_botones(){

        Button bCalcular=findViewById(R.id.bCalcular);
        Button bRegistrarActividad=findViewById(R.id.bResgistrarActividad);
        Button bHistorial=findViewById(R.id.bHistorial);

        if (miControlador.estaUsuarioLogeado()){

            bCalcular.setVisibility(View.GONE);
            bRegistrarActividad.setVisibility(View.VISIBLE);
            bHistorial.setVisibility(View.VISIBLE);

        } else{
            bCalcular.setVisibility(View.VISIBLE);
            bRegistrarActividad.setVisibility(View.GONE);
            bHistorial.setVisibility(View.GONE);
        }

    }



    public void onLoginClick(View view) {
        // Do something in response to button click

        //Nos movemos al activity de login
        Intent miIntent = new Intent(this, LoginActivity.class);
        startActivity(miIntent);

    }


    public void onRegistrarActividadClick(View view){

        TextView tvResultado;
        String resultado;
        Float minutos, kgs;
        String descr,usuario;

        //Recogemos los valores de la pantalla
        minutos = Float.valueOf(((EditText)findViewById(R.id.etMinutos)).getText().toString());
        kgs = Float.valueOf(((EditText)findViewById(R.id.etKgs)).getText().toString());
        descr = ((Spinner)findViewById(R.id.cbEjercicios)).getSelectedItem().toString();
        usuario =((TextView)findViewById(R.id.tvResultadoLogin)).getText().toString();

        //Obtenemos el Textview para mostrar el resultado
        tvResultado = (TextView)findViewById(R.id.tvResultado);

        //Pedimos al controlador el cálculo y asignamos al TextView el resultado
        tvResultado.setText(miControlador.calculaKCal(minutos,kgs,descr) + " KCal");

        resultado=tvResultado.getText().toString();

        /*

        //String minutos, kgs,descr,usuario;
        //Recogemos los valores de la pantalla
        minutos = ((EditText)findViewById(R.id.etMinutos)).getText().toString();
        kgs = ((EditText)findViewById(R.id.etKgs)).getText().toString();
        descr = ((Spinner)findViewById(R.id.cbEjercicios)).getSelectedItem().toString();
        usuario =((TextView)findViewById(R.id.tvResultadoLogin)).getText().toString();*/

        Intent miIntent = new Intent(this, NuevaActividadActivity.class);
        miIntent.putExtra("minutos",minutos);
        miIntent.putExtra("kgs",kgs);
        miIntent.putExtra("descr",descr);
        miIntent.putExtra("usuario",usuario);
        miIntent.putExtra("resultado", resultado);
        startActivity(miIntent);
    }

    public void onHistorialClick(View view) {
        String usuario;
        usuario =((TextView)findViewById(R.id.tvResultadoLogin)).getText().toString();

        Intent miIntent = new Intent(this, HistorialActivity.class);
        miIntent.putExtra("usuario",usuario);
        startActivity(miIntent);

    }

    @Override
    protected void onResume() {
        super.onResume();

        //¿¿Qué ha pasado en el login??
        if (miControlador.estaUsuarioLogeado()) {
            ((TextView)findViewById(R.id.tvResultadoLogin)).setText(miControlador.getUsuarioLogged());
        }

        mostrar_botones();
    }

    public EditText getEtMinutos() {
        return etMinutos;
    }

    public EditText getEtKgs() {
        return etKgs;
    }

    public Spinner getCbEjercicios() {
        return cbEjercicios;
    }
}
