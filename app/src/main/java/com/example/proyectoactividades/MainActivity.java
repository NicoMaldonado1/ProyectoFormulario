package com.example.proyectoactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    DatePicker fecha;
    EditText telefono;
    EditText correo;
    EditText descripcion;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.etNombre);
        fecha = (DatePicker)findViewById((R.id.dpNacimiento));
        telefono = (EditText)findViewById(R.id.etTelefono);
        correo = (EditText)findViewById(R.id.etEmail);
        descripcion = (EditText)findViewById(R.id.etDescripcion);
        siguiente = (Button)findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= nombre.getText().toString();
                String fech = fecha.().toString();
                String tel = telefono.getText().toString();
                String mail = correo.getText().toString();
                String des = descripcion.getText().toString();

                Intent i = new Intent(MainActivity.this, ConfirmarDatos.class);
                i.putExtra("name",name);
                i.putExtra("fech",fech);
                i.putExtra("tel",tel);
                i.putExtra("mail",mail);
                i.putExtra("des",des);

                startActivity(i);
            }
        });
    }
}