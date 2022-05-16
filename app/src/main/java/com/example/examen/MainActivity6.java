package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    private EditText tv1,tv3;
    private TextView tv2,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        tv1 = (EditText) findViewById(R.id.fi1);
        tv2 = (TextView) findViewById(R.id.fi2);
        tv3 = (EditText) findViewById(R.id.ul1);
        tv4 = (TextView) findViewById(R.id.ul2);

    }
    //Este boton hace que la serie ulam haga su parte y le pase los datos al textview tv4
    public void ulam(View U){
        String num_string=tv3.getText().toString();
        int numeros= Integer.parseInt(num_string);
        if (numeros>0){

            while (numeros !=1){
                if (numeros%2 ==0){
                    numeros=numeros/2;
                }else{
                    numeros=numeros*3+1;
                }
                tv4.setText("El resultado es "+numeros);
            }

        }else {
            tv4.setText("Verifique el numero que ingreso");
        }

    }

       // Este boton hace que la serie fibonnaci haga su parte y que le pase los datos al textview tv2
    public void Fibo(View F){
        String numero_string=tv1.getText().toString();
        int n =Integer.parseInt(numero_string);
        int a=0,b=1,c;

        for (int i = 0; i<n; i++){
            c = a+b;
            a = b;
            b= c;
        }

        tv2.setText("Estes es el resultado "+a);

    }
    
    //Metodo para regresar para menu principal
    public void lo (View lo){
        Intent lop = new Intent(this, MainActivity.class);
        startActivity(lop);
    }
}