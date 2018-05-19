package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class vonioszele2 extends AppCompatActivity {
Button voniaskaiciuoti;
EditText pirmasvonia;
EditText antrasvonia;
EditText treciasvonia;
TextView atsakymas;
double zelle=12;
double vanduoo=12;
double sampunass=14/10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vonioszele2);
        voniaskaiciuoti=(Button)findViewById(R.id.button3);
        pirmasvonia=(EditText)findViewById(R.id.ivestis1);
        antrasvonia=(EditText)findViewById(R.id.ivestis2);
        treciasvonia=(EditText)findViewById(R.id.ivestis3);
        atsakymas=(TextView)findViewById(R.id.textView2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Prašome užpildyti visus langelius", 1000).show();
                }
                else{
                    double vanduo1=Double.parseDouble(pirmasvonia.getText().toString());
                    double vanduo2=Double.parseDouble(antrasvonia.getText().toString());
                    double vanduo3=Double.parseDouble(treciasvonia.getText().toString());
                    double min=100000;

                    if(min>vanduo1/zelle){
                        min=vanduo1/zelle;
                    }
                    if(min>vanduo2/sampunass){
                        min=vanduo2/sampunass;
                    }
                    if(min>vanduo3/vanduoo){
                        min=vanduo3/vanduoo;
                    }
                    atsakymas.setText(String.valueOf(String.format("%.2f",min))+"porcijų");
                }
            }
        });
    }
}
