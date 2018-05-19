package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class dezodorantas2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    EditText ketvirtasvonia;
    TextView atsakymas;
    double soda=2;
    double krakmolas=2;
    double kokosai=2;
    double eter=1;
    int klintas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezodorantas2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttond3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisd1);
        antrasvonia=(EditText)findViewById(R.id.ivestisd2);
        treciasvonia=(EditText)findViewById(R.id.ivestisd3);
        ketvirtasvonia=(EditText)findViewById(R.id.ivestisd4);
        atsakymas=(TextView)findViewById(R.id.textViewd2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()|ketvirtasvonia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Prašome užpildyti visus langelius",1000).show();

                }
                else {
                    int vanduo1 = Integer.decode(pirmasvonia.getText().toString());
                    int vanduo2 = Integer.decode(antrasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double vanduo4 = Double.parseDouble(ketvirtasvonia.getText().toString());
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
                    if (klintas == 1) {
                        atsakymas.setText(String.valueOf(min / soda) + "porciju");
                    }
                    if (klintas == 2) {
                        atsakymas.setText(String.valueOf(min / kokosai) + "porciju");
                    }
                    if (klintas == 3) {
                        atsakymas.setText(String.valueOf(min / krakmolas) + "porciju");
                    }
                    if (klintas == 4) {
                        atsakymas.setText(String.valueOf(min / eter) + "porciju");
                    }
                }
            }
        });
    }
}
