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
double sampunass=1.4;
int klintas;
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
                        atsakymas.setText(String.valueOf(min/zelle)+"porciju");
                    }
                    if(klintas==2){
                        atsakymas.setText(String.valueOf(min/sampunass)+"porciju");
                    }
                    if(klintas==3){
                        atsakymas.setText(String.valueOf(min/vanduoo)+"porciju");
                    }
                }
            }
        });
    }
}
