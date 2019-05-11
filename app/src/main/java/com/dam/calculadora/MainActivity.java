package com.dam.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


TextView tv1,tv2,tv3,tv5;
Boolean Num=Boolean.TRUE;
String Acumulado1="",Acumulado2="", signo;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv5 = findViewById(R.id.textView5);
    }
    public void digito1 (View view){
            if (Num){
                Acumulado1=Acumulado1 +"1";
           tv1.setText(Acumulado1);
           }
           else
               Acumulado2=Acumulado2 +"1";
               tv3.setText(Acumulado2);

    }
    public void digito2 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"2";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"2";
        tv3.setText(Acumulado2);

    }
    public void digito3 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"3";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"3";
        tv3.setText(Acumulado2);

    }
    public void digito4 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"4";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"4";
        tv3.setText(Acumulado2);

    }
    public void digito5 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"5";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"5";
        tv3.setText(Acumulado2);

    }
    public void digito6 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"6";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"6";
        tv3.setText(Acumulado2);

    }
    public void digito7 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"7";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"7";
        tv3.setText(Acumulado2);

    }
    public void digito8 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"8";
            tv1.setText(Acumulado1);
        }
           else
        Acumulado2=Acumulado2 +"8";
        tv3.setText(Acumulado2);

    }
    public void digito9 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"9";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"9";
        tv3.setText(Acumulado2);

    }
    public void digito0 (View view){
        if (Num){
            Acumulado1=Acumulado1 +"0";
            tv1.setText(Acumulado1);
        }
        else
            Acumulado2=Acumulado2 +"0";
        tv3.setText(Acumulado2);


    }
    public void sumar (View view){
        if (Num){
            tv2.setText("+");
            signo="+";
            Num=Boolean.FALSE;
        }

    }
    public void restar (View view){
        if (Num){
            tv2.setText("-");
            signo="-";
            Num=Boolean.FALSE;
        }

    }
    public void multiplicar (View view){
        if (Num){
            tv2.setText("*");
            signo="*";
            Num=Boolean.FALSE;
        }

    }
    public void dividir (View view){
        if (Num){
            tv2.setText("/");
            signo="/";
            Num=Boolean.FALSE;
        }

    }
    public void igual (View view){

        int acumulado1_int= Integer.valueOf(Acumulado1);
        int acumulado2_int= Integer.valueOf(Acumulado2);


        switch (signo){

            case ("+"):{
                int solucion = acumulado1_int + acumulado2_int;
                String  solucion_st=String.valueOf(solucion);
                tv5.setText(solucion_st);
                break;
            }
            case ("-"):{
                int solucion = acumulado1_int - acumulado2_int;
                String  solucion_st=String.valueOf(solucion);
                tv5.setText(solucion_st);
                break;
            }
            case ("*"):{
                int solucion = acumulado1_int * acumulado2_int;
                String  solucion_st=String.valueOf(solucion);
                tv5.setText(solucion_st);
                break;
            }
            case ("/"):{
                int solucion = acumulado1_int / acumulado2_int;
                String  solucion_st=String.valueOf(solucion);
                tv5.setText(solucion_st);
                break;
            }
        }




    }

}
