package com.example.pijus.chemijosprojektas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balinamoji2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double ciber = 1;
    double kokos = 1;
    double eteris = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balinamoji2);
        voniaskaiciuoti = findViewById(R.id.buttonb3);
        pirmasvonia = findViewById(R.id.ivestisb1);
        antrasvonia = findViewById(R.id.ivestisb2);
        treciasvonia = findViewById(R.id.ivestisb3);
        atsakymas = findViewById(R.id.textViewb2);
        voniaskaiciuoti.setOnClickListener(v -> {
            atsakymas.setText("");
            if (pirmasvonia.getText().toString().isEmpty() || antrasvonia.getText().toString().isEmpty() || treciasvonia.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome užpildyti visus langelius", Toast.LENGTH_LONG).show();
            } else {
                double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                double min = 100000;

                if (min > vanduo1 / ciber) {
                    min = vanduo1 / ciber;
                }
                if (min > vanduo2 / kokos) {
                    min = vanduo2 / kokos;
                }
                if (min > vanduo3 / eteris) {
                    min = vanduo3 / eteris;
                }
                atsakymas.setText(String.format("%.2f", min) + "porcijų");

            }
        });
    }
}
