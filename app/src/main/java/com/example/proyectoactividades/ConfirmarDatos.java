package com.example.proyectoactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvNombre,tvNacimiento,tvTelefono,tvEmail,tvDescripcion;
    Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvNacimiento = (TextView)findViewById(R.id.tvNacimiento);
        tvTelefono = (TextView)findViewById(R.id.tvTelefono);
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvDescripcion = (TextView)findViewById(R.id.tvDescripcion);
        btnEditar = (Button)findViewById(R.id.btnEditar);
        mostrarDatos();

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmarDatos.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }

    private void mostrarDatos(){
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String fecha = datos.getString("fech");
        String telefono = datos.getString("tel");
        String email = datos.getString("mail");
        String descripcion = datos.getString("des");

        tvNombre.setText(nombre);
        tvNacimiento.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
    }
}