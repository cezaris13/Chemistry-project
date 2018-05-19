package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pasta2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double milteliaii=7.5;
    double druskaa=1;
    double gliceroliss=2.8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttonp3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisp1);
        antrasvonia=(EditText)findViewById(R.id.ivestisp2);
        treciasvonia=(EditText)findViewById(R.id.ivestisp3);
        atsakymas=(TextView)findViewById(R.id.textViewp2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Prašome užpildyti visus langelius",1000).show();
                }
                else {
                    double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                    double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double min = 100000;

                    if (min > vanduo1/milteliaii) {
                        min = vanduo1;
                    }
                    if (min > vanduo2/druskaa) {
                        min = vanduo2;
                    }
                    if (min > vanduo3/gliceroliss) {
                        min = vanduo3;
                    }
                    atsakymas.setText(String.valueOf(String.format("%.2f",min)) + "porcijų");

                }
            }
        });
    }
}
