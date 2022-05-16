package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para calcular sueldo
    public void Calcular (View v){
        Intent Calcular = new Intent(this,MainActivity2.class);
        startActivity(Calcular);
    }
    //Metodo pra calucular producto
    public void Producto(View p){
        Intent pro = new Intent(this,MainActivity4.class);
        startActivity(pro);
    }

    //Metodo para la serie ulam y fibonnaci
    public void ulam (View u){
        Intent ul = new Intent(this,MainActivity6.class);
        startActivity(ul);
    }

}