package com.example.pijus.chemijosprojektas.Quantity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pijus.chemijosprojektas.R;

public class kauke1 extends AppCompatActivity {
    Button skaiciuotikk;
    EditText ivestiskk;
    TextView rezultataskk;
    TextView rezultataskk2;
    TextView rezultataskk3;
    TextView receptaskau;
    double mieless = 5.5;
    double vanduoo = 1;
    double actass = 1.5;

    /*
           1. 5, 5 g sausų mielių;
           2. 1,5 lašai acto;
           3. 1 šaukštelis vandens.
        */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kauke1);
        skaiciuotikk = findViewById(R.id.skaiciuotik);
        ivestiskk = findViewById(R.id.ivestisk);
        rezultataskk = findViewById(R.id.rezultatask);
        rezultataskk2 = findViewById(R.id.rezultatask2);
        rezultataskk3 = findViewById(R.id.rezultatask3);
        receptaskau = findViewById(R.id.receptaska);
        skaiciuotikk.setOnClickListener(v -> {
            if (ivestiskk.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestiskk.getText().toString());
                rezultataskk.setText(data * mieless + " g mielių");
                rezultataskk2.setText(data * vanduoo + " šaukstelių vandens");
                rezultataskk3.setText(data * actass + " lašų acto");
                receptaskau.setText(" Darbo eiga: \n" +
                        "1.Indelyje maišykite mieles, actą ir vandenį, kol pasidarys tiršta masė. Jei reikia, įpilkite dar šiek tiek vandens, kad kaukę būtų galima tepti ant odos. \n" +
                        "2.Užtepkite kaukę ant odos. Palaikykite 10 – 15 min. \n" +
                        "3.Nuplaukite šiltu vandeniu ir nusausinkite.");
            }
        });
    }
}
