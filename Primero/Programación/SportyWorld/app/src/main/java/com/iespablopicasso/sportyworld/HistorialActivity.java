package com.iespablopicasso.sportyworld;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;

public class HistorialActivity extends AppCompatActivity {
    /*ESTADO*/
    private Controlador miControlador;
    TextView tvUsuarioHistorial;
    String usuario;
    ListaActividades actividades;
    ArrayList<String> actividadesUsuario;

    /*COMPORTAMIENTOS*/

    /*CONSTRUCTOR*/

    private ArrayAdapter<String> stringArrayAdapter;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        miControlador = Controlador.getSingleton();
        tvUsuarioHistorial = (TextView) findViewById(R.id.tvUsuarioHistorial);
        listview = (ListView) findViewById(R.id.liHistorial);

        Bundle datos = this.getIntent().getExtras();
        usuario = datos.getString("Usuario");
        tvUsuarioHistorial.setText(usuario);

        try {
            mostrarActividades();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        stringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, actividadesUsuario);
        listview.setAdapter(stringArrayAdapter);

    }

    private void mostrarActividades() throws IOException, ClassNotFoundException{
        actividadesUsuario = miControlador.getActividadesByUserToNewList(usuario);
    }
}
