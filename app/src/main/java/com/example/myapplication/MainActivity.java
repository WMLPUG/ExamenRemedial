package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextLado = findViewById(R.id.editTextLado);
        Button btnGenerar = findViewById(R.id.btnGenerar);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el valor ingresado por el usuario
                String ladoStr = editTextLado.getText().toString();

                if (!ladoStr.isEmpty()) {
                    // Convertir el valor a double
                    double lado = Double.parseDouble(ladoStr);

                    // Calcular el área del cuadrado
                    double area = lado * lado;

                    // Mostrar el resultado usando un Toast
                    Toast.makeText(MainActivity.this, "Área del cuadrado: " + area, Toast.LENGTH_LONG).show();
                } else {
                    // Mostrar un mensaje si el campo está vacío
                    Toast.makeText(MainActivity.this, "Ingrese el lado del cuadrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
