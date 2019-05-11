package com.dam.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


TextView tv1,tv2,tv3,tv5;
Boolean Num=Boolean.TRUE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv5 = (TextView)findViewById(R.id.textView5);
    }
    public void digito1 (View view){
            if (Num){
           tv1.setText("1");
           Num=Boolean.FALSE;}
           else
               tv3.setText("1");

    }
}
