package com.example.pijus.chemijosprojektas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kauke2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double mieless = 5.5;
    double vanduoo = 1;
    double actass = 1.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kauke2);
        voniaskaiciuoti = findViewById(R.id.buttonk3);
        pirmasvonia = findViewById(R.id.ivestisk1);
        antrasvonia = findViewById(R.id.ivestisk2);
        treciasvonia = findViewById(R.id.ivestisk3);
        atsakymas = findViewById(R.id.textViewk2);
        voniaskaiciuoti.setOnClickListener(v -> {
            atsakymas.setText("");
            if (pirmasvonia.getText().toString().isEmpty() || antrasvonia.getText().toString().isEmpty() || treciasvonia.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome užpildyti visus langelius", Toast.LENGTH_LONG).show();
            } else {
                double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                double min = 100000;
                if (min > vanduo1 / mieless) {
                    min = vanduo1 / mieless;
                }
                if (min > vanduo2 / actass) {
                    min = vanduo2 / actass;
                }
                if (min > vanduo3 / vanduoo) {
                    min = vanduo3 / vanduoo;
                }
                atsakymas.setText(String.format("%.2f", min) + "porcijų");

            }
        });
    }
}
