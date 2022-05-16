package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    private EditText edt1, edt2, edt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        edt3 = (EditText) findViewById(R.id.edt3);

    }

    // metodo del boton para enviar las cosas al otro activity
    public void Cal (View cl){
        Intent Cal = new Intent(this,MainActivity5.class);
        Cal.putExtra("Producto", edt1.getText().toString());
        Cal.putExtra("Precio", edt2.getText().toString());
        Cal.putExtra("Cantidad",edt3.getText().toString());
        startActivity(Cal);
    }

    // Metodo para regresar al menu principal
    public void re (View r){
        Intent re = new Intent(this,MainActivity.class);
        startActivity(re);
    }
}