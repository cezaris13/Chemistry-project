package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezodorantas2);
        voniaskaiciuoti= findViewById(R.id.buttond3);
        pirmasvonia= findViewById(R.id.ivestisd1);
        antrasvonia= findViewById(R.id.ivestisd2);
        treciasvonia= findViewById(R.id.ivestisd3);
        ketvirtasvonia= findViewById(R.id.ivestisd4);
        atsakymas= findViewById(R.id.textViewd2);
        voniaskaiciuoti.setOnClickListener(v -> {
            atsakymas.setText("");
            if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()|ketvirtasvonia.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Prašome užpildyti visus langelius",Toast.LENGTH_LONG).show();

            }
            else {
                double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                double vanduo4 = Double.parseDouble(ketvirtasvonia.getText().toString());
                double min = 100000;

                if (min > vanduo1/soda) {
                    min = vanduo1/soda;
                }
                if (min > vanduo2/kokosai) {
                    min = vanduo2/kokosai;
                }
                if (min > vanduo3/krakmolas) {
                    min = vanduo3/krakmolas;
                }
                if (min > vanduo4/eter) {
                    min = vanduo4/eter;
                }
                atsakymas.setText(String.format("%.2f", min) + "porcijų");
            }
        });
    }
}
