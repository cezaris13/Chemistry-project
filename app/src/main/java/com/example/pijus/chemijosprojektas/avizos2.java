package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class avizos2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double dribsniai=6;
    double miltai=5;
    double vendens=1;
    int klintas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avizos2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttona3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisa1);
        antrasvonia=(EditText)findViewById(R.id.ivestisa2);
        treciasvonia=(EditText)findViewById(R.id.ivestisa3);
        atsakymas=(TextView)findViewById(R.id.textViewa2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vanduo1=Integer.decode(pirmasvonia.getText().toString());
                int vanduo2=Integer.decode(antrasvonia.getText().toString());
                double vanduo3=Double.parseDouble(treciasvonia.getText().toString());
                double min=100000;

                if(min>vanduo1){
                    min=vanduo1;
                    klintas=1;

                }
                if(min>vanduo2){
                    min=vanduo2;
                    klintas=2;

                }
                if(min>vanduo3){
                    min=vanduo3;
                    klintas=3;
                }
                if(klintas==1){
                    atsakymas.setText(String.valueOf(min/dribsniai )+"porciju");
                }
                if(klintas==2){
                    atsakymas.setText(String.valueOf(min/miltai)+"porciju");
                }
                if(klintas==3){
                    atsakymas.setText(String.valueOf(min/vendens)+"porciju");
                }
            }
        });
    }
}
