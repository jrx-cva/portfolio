package com.iespablopicasso.sportyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HistorialActivity extends AppCompatActivity {

    protected Controlador miControlador;

    private ListView listhistorial;
    private ArrayList<String> actividades;

    TextView tvUsuarioQueVienenDeMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        miControlador = Controlador.getSingleton();

        tvUsuarioQueVienenDeMainActivity = (TextView) findViewById(R.id.usuariohistorial);
        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            String usuario = (String) b.get("usuario");
            tvUsuarioQueVienenDeMainActivity.setText(usuario);
        }



        listhistorial=(ListView) findViewById(R.id.listhistorial);

        actividades = new ArrayList<String>();
        actividades=miControlador.cargaListaActividades();
        //actividades.add("Tabasco");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, actividades);
        listhistorial.setAdapter(adapter);


    }


}
