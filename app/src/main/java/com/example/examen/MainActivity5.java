package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private TextView t, t2, t3, t4, t5, t6, t7, t8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //Aqui estoy declarando las variables de java que se van a comunicar con los id de la parte grafica
        t = (TextView) findViewById(R.id.tex);
        t2 = (TextView) findViewById(R.id.tex2);
        t3 = (TextView) findViewById(R.id.tex3);
        t4 = (TextView) findViewById(R.id.tex4);
        t5 = (TextView) findViewById(R.id.tex5);
        t6 = (TextView) findViewById(R.id.tex6);
        t7 = (TextView) findViewById(R.id.tex7);
        t8 = (TextView) findViewById(R.id.tex8);


        //Aqui estoy agarrando los datos que mande del activity 4 que son producto, cantidad, precio
        String dato = getIntent().getStringExtra("Producto");
        t.setText("El nombre del producto: "+dato);
        String dato1 = getIntent().getStringExtra("Precio");
        t2.setText("Este es el precio del producto: "+dato1);
        String dato2 = getIntent().getStringExtra("Cantidad");
        t3.setText("Esta es la cantidad de productos: "+dato2);

        //Aqui estoy haciendo la parte logica de la aplicacion o puede ser las funciones
        int cant =Integer.parseInt(dato2); //Esta funcion sirbe para combertir texto a numeros enteros
        double pre = Double.parseDouble(dato1); //Esta funcion sirbe para combertir texto a numero decimales
        double iva = (cant*pre*0.12);
        double des;
        String cliente = "";
        String cliente1 = "gacho";
        String cliente2 = "premuin";
        String cliente3 = "vip";


        if (cant>=3){
            des = (cant*0.05);
        }else if (cant>=12){
            des = (cant*0.10);
        }else{
            des=0;
        }

        if(cant>=3){
            cliente = cliente2;
        }else if (cant>=12){
            cliente = cliente2;
        }else {
            cliente = cliente1;
        }
        double sub = (pre*cant);
        double sub2 = (pre*cant)+iva-des;



        // Aqui estoy hacido que la parte logica le pase los datos a los textview
        String iv = String.valueOf(iva);
        t4.setText("Estes el IVA de todos sus productos. "+iv);
        String d = String.valueOf(des);
        t5.setText("Este es el descuento: "+d);
        String cl = String.valueOf(cliente);
        t6.setText("El estatus del cliente "+cl);
        String s1 = String.valueOf(sub);
        t7.setText("Este es el total a pagar sin descuento y sin iva: "+s1);
        String s2 = String.valueOf(sub2);
        t8.setText("Este es el total a pagar con descuento y con iva: "+s2);

    }

    //metodo para el boton de regresar
    public void di (View d){
        Intent di = new Intent(this,MainActivity4.class);
        startActivity(di);
    }
}