package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class losjonas2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    EditText ketvirtasvonia;
    EditText penktasvonia;
    TextView atsakymas;
    double aliejus=22;
    double vaskas=12;
    double lasas=1;
    double alavijo=5;
    double E=1;
    int klintas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losjonas2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttonl3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisl1);
        antrasvonia=(EditText)findViewById(R.id.ivestisl2);
        treciasvonia=(EditText)findViewById(R.id.ivestisl3);
        ketvirtasvonia=(EditText)findViewById(R.id.ivestisl4);
        penktasvonia=(EditText)findViewById(R.id.ivestisl5);
        atsakymas=(TextView)findViewById(R.id.textViewl2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()||ketvirtasvonia.getText().toString().isEmpty()||penktasvonia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Prašome užpildyti visus langelius", 1000).show();
                }
                else {
                    int vanduo1 = Integer.decode(pirmasvonia.getText().toString());
                    int vanduo2 = Integer.decode(antrasvonia.getText().toString());
                    double vanduo4 = Double.parseDouble(ketvirtasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double vanduo5 = Double.parseDouble(penktasvonia.getText().toString());
                    double min = 100000;

                    if (min > vanduo1) {
                        min = vanduo1;
                        klintas = 1;

                    }
                    if (min > vanduo2) {
                        min = vanduo2;
                        klintas = 2;

                    }
                    if (min > vanduo3) {
                        min = vanduo3;
                        klintas = 3;
                    }
                    if (min > vanduo4) {
                        min = vanduo4;
                        klintas = 4;

                    }
                    if (min > vanduo5) {
                        min = vanduo5;
                        klintas = 5;
                    }
                    if (klintas == 1) {
                        atsakymas.setText(String.valueOf(min / aliejus) + "porciju");
                    }
                    if (klintas == 2) {
                        atsakymas.setText(String.valueOf(min / vaskas) + "porciju");
                    }
                    if (klintas == 3) {
                        atsakymas.setText(String.valueOf(min / lasas) + "porciju");
                    }
                    if (klintas == 4) {
                        atsakymas.setText(String.valueOf(min / alavijo) + "porciju");
                    }
                    if (klintas == 5) {
                        atsakymas.setText(String.valueOf(min / E) + "porciju");
                    }
                }
            }
        });
    }
}
