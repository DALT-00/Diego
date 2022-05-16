package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ed1 = (EditText)findViewById(R.id.ed);
        ed2 = (EditText)findViewById(R.id.ed2);
        ed3 = (EditText)findViewById(R.id.ed3);

    }

    // Metodo para regresar donde esta los botones
    public void Regresar (View r){
        Intent Regresar = new Intent(this, MainActivity.class);
        startActivity(Regresar);
    }

    //Metodo para calcular todas las cosas
    public void Calculara (View c){
        Intent i = new Intent(this, MainActivity3.class);
        i.putExtra("Nombre", ed1.getText().toString());
        i.putExtra("Apellidos", ed2.getText().toString());
        i.putExtra("Sueldo", ed3.getText().toString());
        startActivity(i);
    }
}