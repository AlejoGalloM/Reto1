package com.thealejos.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    private EditText editTextNombre, editTextApellido, editTextTelefono;
    private Button btnRegistar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        editTextNombre = (EditText) findViewById(R.id.Nombre);
        editTextApellido = (EditText) findViewById(R.id.apellido);
        editTextTelefono = (EditText) findViewById(R.id.Telefono);
        btnRegistar = (Button) findViewById(R.id.Registrar);
        btnRegistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String telefono = editTextTelefono.getText().toString();

                if(nombre.equals("")){
                    Toast.makeText(getApplicationContext(), R.string.errorNombre, Toast.LENGTH_LONG).show();
                }
                if(apellido.equals("")){
                    Toast.makeText(getApplicationContext(), R.string.errorApellido, Toast.LENGTH_LONG).show();
                }
                if(telefono.equals("")){
                    Toast.makeText(getApplicationContext(), R.string.errorTelefono, Toast.LENGTH_LONG).show();
                }
                if(!nombre.equals("") && !apellido.equals("") && !telefono.equals("")){
                    Toast.makeText(getApplicationContext(), R.string.registroExitoso, Toast.LENGTH_LONG).show();
                    startActivity(new Intent(Formulario.this, MainActivity.class));
                }

            }
        });

    }

}