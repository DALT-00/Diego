package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Aqui estoy declarando las variables de java y esto se comunica con la parte grafica
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);

        //Aqui estoy agarrando los elementos que mande de la activity 2 nombre y apellido y sueldo
        String dato = getIntent().getStringExtra("Nombre");
        tv1.setText("Nombre " + dato);
        String dato2 = getIntent().getStringExtra("Apellidos");
        tv2.setText("Apellido " + dato2);
        String dato3 = getIntent().getStringExtra("Sueldo");
        tv3.setText("Sueldo " + dato3);

        //Aqui estoy haciendo los funciones para que calcule el igss, irtra, intecap, isr y bonoficacion

        double liquido = Double.parseDouble(dato3);
        double igss = (liquido * 4.83) / 100;
        double irtra = (liquido * 1) / 100;
        double intecap = (liquido * 1) / 100;
        double isr;
        double bono;
        if (liquido == 5000) {
            bono = (liquido * 0.05);
        } else if (liquido == 10000) {
            bono = (liquido * 0.07);
        } else if (liquido == 25000) {
            bono = (liquido * 0.12);
        } else {
            bono = 0;
        }

        if (liquido > 4900) {
            isr = ((liquido * 5) / 100);
        } else {
            isr = 0;
        }

        double st = liquido - (igss + irtra + intecap + isr);

        //Aqui estoy poniendo los resultados de java a la parte grafica
        String ig = String.valueOf(igss);
        tv4.setText("El IGSS es: " + ig);
        String ir = String.valueOf(irtra);
        tv5.setText("El IRTRA es: " + ir);
        String in = String.valueOf(intecap);
        tv6.setText("El INTECAP es:" + in);
        String is = String.valueOf(isr);
        tv7.setText("El ISR es: "+is);
        String sb = String.valueOf(st);
        tv8.setText("El sueldo total: "+sb);
        String bn = String.valueOf(bono);
        tv9.setText("La bonificación es: "+bn);




    }

    // Medoto para regresar para la segunda activity

    public void Regresar(View v){
        Intent Regresar = new Intent(this,MainActivity2.class);
        startActivity(Regresar);
    }
}