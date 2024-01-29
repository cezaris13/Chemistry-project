package com.example.pijus.chemijosprojektas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class losjonas1 extends AppCompatActivity {
    Button skaiciuotill;
    EditText ivestisll;
    TextView rezultatasll;
    TextView rezultatasll2;
    TextView rezultatasll3;
    TextView rezultatasll4;
    TextView rezultatasll5;
    TextView receptaslos;
    double aliejus = 22;
    double vaskas = 12;
    double lasas = 1;
    double alavijo = 5;
    double E = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losjonas1);
        skaiciuotill = findViewById(R.id.skaiciuotil);
        ivestisll = findViewById(R.id.ivestisl);
        rezultatasll = findViewById(R.id.rezultatasl);
        rezultatasll2 = findViewById(R.id.rezultatasl2);
        rezultatasll3 = findViewById(R.id.rezultatasl3);
        rezultatasll4 = findViewById(R.id.rezultatasl4);
        rezultatasll5 = findViewById(R.id.rezultatasl5);
        receptaslos = findViewById(R.id.receptaslo);
        skaiciuotill.setOnClickListener(v -> {
            if (ivestisll.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestisll.getText().toString());
                rezultatasll.setText(data * aliejus + " g aliejaus");
                rezultatasll2.setText(data * vaskas + " g bičių vaško");
                rezultatasll3.setText(data * lasas + " lašų eterinio aliejaus");
                rezultatasll4.setText(data * alavijo + " lašų alavijo");
                rezultatasll5.setText(data * E + " tablečių vitamino E");
                receptaslos.setText("Darbo eiga: \n" +
                        "1. Aliejuje ištirpinti vašką. Neleisti užvirti.\n" +
                        "2.  Į šia masę pilti vitaminą E, eterinį aliejų ir alaviją. \n" +
                        "3. Visą masę gerai išmaišyti. \n" +
                        "4. Tepkite ant odos.");
            }
        });
    }
}
