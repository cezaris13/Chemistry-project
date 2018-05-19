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
                    double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                    double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                    double vanduo4 = Double.parseDouble(ketvirtasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double vanduo5 = Double.parseDouble(penktasvonia.getText().toString());
                    double min = 100000;

                    if (min > vanduo1/aliejus) {
                        min = vanduo1/aliejus;
                    }
                    if (min > vanduo2/vaskas) {
                        min = vanduo2/vaskas;
                    }
                    if (min > vanduo3/lasas) {
                        min = vanduo3/lasas;
                    }
                    if (min > vanduo4/alavijo) {
                        min = vanduo4/alavijo;
                    }
                    if (min > vanduo5/E) {
                        min = vanduo5/E;
                    }
                    atsakymas.setText(String.valueOf(String.format("%.2f",min)) + "porcijų");

                }
            }
        });
    }
}
