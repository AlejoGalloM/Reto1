package com.thealejos.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFormulario, btnEdad,btnEquipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFormulario = (Button) findViewById(R.id.button);
        btnEdad = (Button) findViewById(R.id.Edad);
        btnEquipo = (Button) findViewById(R.id.Equipo);

        btnFormulario.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, Formulario.class)));
        btnEdad.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, Edad.class)));
        btnEquipo.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, Equipo.class)));
    }


}
