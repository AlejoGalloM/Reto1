package com.thealejos.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;

public class Edad extends AppCompatActivity {


    TextView mensajeFecha;
    Button calcularEdad;

    Calendar calendar;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad);
        mensajeFecha = (TextView) findViewById(R.id.MensajeFecha);
        calcularEdad = (Button) findViewById(R.id.calcularEdad);

        calcularEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                datePickerDialog = new DatePickerDialog(Edad.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int nYear, int nMonth, int nDay) {
                        mensajeFecha.setText(calcularEdad(nYear, nMonth, year, month));
                    }
                },day,month,year);
                datePickerDialog.show();
            }
        });

    }

    public String calcularEdad(int anio, int mes, int anioActual, int mesActual){
        int years = 0;
        int months = 0;
        int days = 0;
        if(anio<anioActual){
            if(mesActual>=mes){
                years = anioActual - anio ;
                months = mesActual - mes;
            }else{
                years = anioActual - anio - 1;
                months = 12 - (mes-mesActual);
            }
            return "Edad: " + years + " años " + months + "meses";
        }else{
            return "Valor inválido";
        }

    }

}

