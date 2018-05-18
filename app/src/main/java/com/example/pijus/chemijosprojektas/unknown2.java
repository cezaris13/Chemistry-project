package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class unknown2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double mltai=15;
    double druska=5.6;
    double vanduoooo=8;


    int klintas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknown2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttonu3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisu1);
        antrasvonia=(EditText)findViewById(R.id.ivestisu2);
        treciasvonia=(EditText)findViewById(R.id.ivestisu3);
        atsakymas=(TextView)findViewById(R.id.textViewu2);
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
                    atsakymas.setText(String.valueOf(min/mltai)+"porciju");
                }
                if(klintas==2){
                    atsakymas.setText(String.valueOf(min/vanduoooo)+"porciju");
                }
                if(klintas==3){
                    atsakymas.setText(String.valueOf(min/druska)+"porciju");
                }
            }
        });
    }
}
