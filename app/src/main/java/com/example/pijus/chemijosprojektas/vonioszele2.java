package com.example.pijus.chemijosprojektas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    double zelle = 12;
    double vanduoo = 12;
    double sampunass = 14 / 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vonioszele2);
        voniaskaiciuoti = findViewById(R.id.button3);
        pirmasvonia = findViewById(R.id.ivestis1);
        antrasvonia = findViewById(R.id.ivestis2);
        treciasvonia = findViewById(R.id.ivestis3);
        atsakymas = findViewById(R.id.textView2);
        voniaskaiciuoti.setOnClickListener(v -> {
            atsakymas.setText("");
            if (pirmasvonia.getText().toString().isEmpty() || antrasvonia.getText().toString().isEmpty() || treciasvonia.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome užpildyti visus langelius", Toast.LENGTH_LONG).show();
            } else {
                double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                double min = 100000;

                if (min > vanduo1 / zelle) {
                    min = vanduo1 / zelle;
                }
                if (min > vanduo2 / sampunass) {
                    min = vanduo2 / sampunass;
                }
                if (min > vanduo3 / vanduoo) {
                    min = vanduo3 / vanduoo;
                }
                atsakymas.setText(String.format("%.2f", min) + "porcijų");
            }
        });
    }
}
