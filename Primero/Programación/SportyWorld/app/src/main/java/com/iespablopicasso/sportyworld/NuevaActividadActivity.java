package com.iespablopicasso.sportyworld;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class NuevaActividadActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String CERO = "0";
    private static final String BARRA = "/";
    private static final String DOS_PUNTOS = ":";
    private Controlador miControlador;

    //Calendario para obtener fecha & hora
    public final Calendar c = Calendar.getInstance();

    //FECHA
    //Variables para obtener la fecha
    final int mes = c.get(Calendar.MONTH);
    final int dia = c.get(Calendar.DAY_OF_MONTH);
    final int anio = c.get(Calendar.YEAR);

    //HORA
    //Variables para obtener la hora hora
    final int hora = c.get(Calendar.HOUR_OF_DAY);
    final int minuto = c.get(Calendar.MINUTE);

    TextView tvMinutesNewActivity;
    TextView tvKgsNewActivity;
    TextView tvActividadNewActivity;
    TextView tvUsuarioNewActivity;

    String minutos;
    String kg;
    String ejercicio;
    String usuario;

    //Widgets FECHA
    EditText etFecha;
    ImageButton ibObtenerFecha;

    //Widgets HORA
    EditText etHora;
    ImageButton ibObtenerHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_actividad);
        //FECHA
        //Widget EditText donde se mostrara la fecha obtenida
        etFecha = (EditText) findViewById(R.id.etFecha);
        //Widget ImageButton del cual usaremos el evento clic para obtener la fecha
        ibObtenerFecha = (ImageButton) findViewById(R.id.ib_obtener_fecha);
        //Evento setOnClickListener - clic
        ibObtenerFecha.setOnClickListener(this);

        //HORA
        //Widget EditText donde se mostrara la hora obtenida
        etHora = (EditText) findViewById(R.id.etHora);
        //Widget ImageButton del cual usaremos el evento clic para obtener la hora
        ibObtenerHora = (ImageButton) findViewById(R.id.ib_obtener_hora);
        //Evento setOnClickListener - clic
        ibObtenerHora.setOnClickListener(this);

        //Demas Textviews
        tvMinutesNewActivity = (TextView) findViewById(R.id.tvMinutesNewActivity);
        tvKgsNewActivity = (TextView) findViewById(R.id.tvKgrNewActivity);
        tvActividadNewActivity = (TextView) findViewById(R.id.tvActividadNewActivity);
        tvUsuarioNewActivity = (TextView) findViewById(R.id.tvUsuarioHistorial);

        Bundle datos = this.getIntent().getExtras();
        kg = datos.getString("Kg");
        minutos = datos.getString("Minutos");
        ejercicio = datos.getString("Ejercicio");
        usuario = datos.getString("Usuario");

        tvUsuarioNewActivity.setText(usuario);
        tvMinutesNewActivity.setText(minutos);
        tvKgsNewActivity.setText(kg);
        tvActividadNewActivity.setText(ejercicio);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_obtener_fecha:
                obtenerFecha();
                break;
            case R.id.ib_obtener_hora:
                obtenerHora();
                break;
        }
    }

    private void obtenerFecha() {
        DatePickerDialog recogerFecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                //Esta variable lo que realiza es aumentar en uno el mes ya que comienza desde 0 = enero
                final int mesActual = month + 1;
                //Formateo el día obtenido: antepone el 0 si son menores de 10
                String diaFormateado = (dayOfMonth < 10) ? CERO + String.valueOf(dayOfMonth) : String.valueOf(dayOfMonth);
                //Formateo el mes obtenido: antepone el 0 si son menores de 10
                String mesFormateado = (mesActual < 10) ? CERO + String.valueOf(mesActual) : String.valueOf(mesActual);
                //Muestro la fecha con el formato deseado
                etFecha.setText(diaFormateado + BARRA + mesFormateado + BARRA + year);
            }

            //Estos valores deben ir en ese orden, de lo contrario no mostrara la fecha actual
            /**
             *También puede cargar los valores que usted desee
             */
        }, anio, mes, dia);
        //Muestro el widget
        recogerFecha.show();
    }


    private void obtenerHora(){
        TimePickerDialog recogerHora = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                //Formateo el hora obtenido: antepone el 0 si son menores de 10
                String horaFormateada =  (hourOfDay < 10)? String.valueOf(CERO + hourOfDay) : String.valueOf(hourOfDay);
                //Formateo el minuto obtenido: antepone el 0 si son menores de 10
                String minutoFormateado = (minute < 10)? String.valueOf(CERO + minute):String.valueOf(minute);
                //Obtengo el valor a.m. o p.m., dependiendo de la selección del usuario
                String AM_PM;
                if(hourOfDay < 12) {
                    AM_PM = "a.m.";
                } else {
                    AM_PM = "p.m.";
                }
                //Muestro la hora con el formato deseado
                etHora.setText(horaFormateada + DOS_PUNTOS + minutoFormateado + " " + AM_PM);
            }
            //Estos valores deben ir en orden
            // Al colocar en false se muestra en formato 12 horas y true en formato 24 horas
            //Pero el sistema devuelve la hora en formato 24 horas
        }, hora, minuto, false);

        recogerHora.show();
    }

    public void onRegistrarse (View view){
        String thora = etHora.getText().toString();
        String tfecha = etFecha.getText().toString();
        String tusuario = tvUsuarioNewActivity.getText().toString();
        String tejercicio = tvActividadNewActivity.getText().toString();
        String tminutos = tvMinutesNewActivity.getText().toString();
        String tkg = tvKgsNewActivity.getText().toString();
        if (thora.isEmpty() || tfecha.isEmpty() || tusuario.isEmpty() || tejercicio.isEmpty() || tminutos.isEmpty() || tkg.isEmpty()) {
            Toast.makeText(this, "Faltan Datos", Toast.LENGTH_SHORT).show();
        } else {
            miControlador.RegisterActivity(thora,tfecha,tusuario,tejercicio,tminutos,tkg);
            Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT).show();

        }

    }

}
