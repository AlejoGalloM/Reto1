package com.thealejos.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFormulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFormulario = (Button) findViewById(R.id.button);
        btnFormulario.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, Formulario.class)));
    }
}
