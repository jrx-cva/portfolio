package com.iespablopicasso.sportyworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.time.Year;
import java.util.Calendar;

public class NuevaActividadActivity extends AppCompatActivity {

    protected Controlador miControlador;

    TextView tvSeleccionFechaQueVienenDeMainActivity;
    TextView tvSeleccionHoraQueVienenDeMainActivity;


    Calendar FechaSelector;
    Calendar Reloj;

    int day, month, year;
    int hour, minute;

    String format;


    TextView tvMinutosQueVienenDeMainActivity;
    TextView tvKGQueVienenDeMainActivity;
    TextView tvKcalQueVienenDeMainActivity;
    TextView tvEjercicioQueVienenDeMainActivity;
    TextView tvUsuarioQueVienenDeMainActivity;

    protected MainActivity myApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_actividad);
        miControlador = Controlador.getSingleton();

        //tv de fecha
        tvSeleccionFechaQueVienenDeMainActivity = (TextView) findViewById(R.id.tvSeleccionFechaQueVienenDeMainActivity);

        //calendario
        FechaSelector = Calendar.getInstance();


        //dia,fecha y año
        day = FechaSelector.get(Calendar.DAY_OF_MONTH);
        month = FechaSelector.get(Calendar.MONTH);
        year = FechaSelector.get(Calendar.YEAR);

        //le sumamos un mes porque empieza a contar desde 0
        month = month + 1;

        //seleccionamos texto al textview
        tvSeleccionFechaQueVienenDeMainActivity.setText(day + "/" + month + "/" + year);

        //tvfechaclick
        tvSeleccionFechaQueVienenDeMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(NuevaActividadActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear = monthOfYear + 1;
                        tvSeleccionFechaQueVienenDeMainActivity.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });


        //tv de hora
        tvSeleccionHoraQueVienenDeMainActivity = (TextView) findViewById(R.id.tvSeleccionHoraQueVienenDeMainActivity);

        //reloj
        Reloj = Calendar.getInstance();

        //hora y minutos
        hour = Reloj.get(Calendar.HOUR_OF_DAY);
        minute = Reloj.get(Calendar.MINUTE);

        selectedTimeFormat(hour);

        //seleccionamos texto al textview
        tvSeleccionHoraQueVienenDeMainActivity.setText(hour + ":" + minute + " " + format);

        //tvhoraclick
        tvSeleccionHoraQueVienenDeMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(NuevaActividadActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        selectedTimeFormat(hourOfDay);
                        tvSeleccionHoraQueVienenDeMainActivity.setText(hourOfDay + ":" + minute + " " + format);
                    }
                }, hour, minute, true);
                timePickerDialog.show();


            }
        });


        //pasar los datos de un et a un tv
        tvMinutosQueVienenDeMainActivity = (TextView) findViewById(R.id.tvMinutosQueVienenDeMainActivity);
        tvKGQueVienenDeMainActivity = (TextView) findViewById(R.id.tvKGQueVienenDeMainActivity);
        tvKcalQueVienenDeMainActivity = (TextView) findViewById(R.id.tvKcalQueVienenDeMainActivity);
        tvEjercicioQueVienenDeMainActivity = (TextView) findViewById(R.id.tvEjercicioQueVienenDeMainActivity);
        tvUsuarioQueVienenDeMainActivity = (TextView) findViewById(R.id.tvUsuarioQueVienenDeMainActivity);
        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            String minutos =String.valueOf( b.getFloat("minutos"));
            String kgs = String.valueOf(b.getFloat("kgs"));
            String descr =b.getString("descr");
            String usuario =b.getString("usuario");
            String resultado= b.getString("resultado");
            tvMinutosQueVienenDeMainActivity.setText(minutos);
            tvKGQueVienenDeMainActivity.setText(kgs);
            tvEjercicioQueVienenDeMainActivity.setText(descr);
            tvUsuarioQueVienenDeMainActivity.setText(usuario);
            tvKcalQueVienenDeMainActivity.setText(resultado);
        }


    }


    //metodo que da formato a la hora
    public void selectedTimeFormat(int hour) {

        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
    }


    public void onOkResgitrarActividadClick(View view) {

        String hora, fecha, usuario, ejercicio, kgs, minutos, Kcal;
        hora = ((TextView) findViewById(R.id.tvSeleccionHoraQueVienenDeMainActivity)).getText().toString();
        fecha = ((TextView) findViewById(R.id.tvSeleccionFechaQueVienenDeMainActivity)).getText().toString();
        usuario = ((TextView) findViewById(R.id.tvUsuarioQueVienenDeMainActivity)).getText().toString();
        ejercicio = ((TextView) findViewById(R.id.tvEjercicioQueVienenDeMainActivity)).getText().toString();
        kgs = ((TextView) findViewById(R.id.tvKGQueVienenDeMainActivity)).getText().toString();
        minutos = ((TextView) findViewById(R.id.tvMinutosQueVienenDeMainActivity)).getText().toString();
        Kcal=((TextView) findViewById(R.id.tvKcalQueVienenDeMainActivity)).getText().toString();


        miControlador.grabaNuevaActividad(hora, fecha, usuario, ejercicio, kgs, minutos, Kcal);

        //Toast mensaje2 = Toast.makeText(this,"Actividad2",Toast.LENGTH_LONG);
        //mensaje2.show();
        //Podriamos decir que se ha registrado la actividad pero cuando pongo un TOAST me falla, intentar mirar si hay tiempo

        Toast.makeText(this, "Actividad creada", Toast.LENGTH_SHORT).show();



    }

}



