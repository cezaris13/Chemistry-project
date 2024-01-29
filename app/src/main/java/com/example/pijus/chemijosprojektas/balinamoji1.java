package com.example.pijus.chemijosprojektas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balinamoji1 extends AppCompatActivity {
    Button skaiciuotibb;
    EditText ivestisbb;
    TextView rezultatasbb;
    TextView rezultatasbb2;
    TextView rezultatasbb3;
    TextView receptasbalinamoji1;
    double ciber = 1;
    double kokos = 1;
    double eteris = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balinamoji1);
        skaiciuotibb =  findViewById(R.id.skaiciuotib);
        ivestisbb =  findViewById(R.id.ivestisb);
        rezultatasbb =  findViewById(R.id.rezultatasb);
        rezultatasbb2 =  findViewById(R.id.rezultatasb2);
        rezultatasbb3 =  findViewById(R.id.rezultatasb3);
        receptasbalinamoji1 = findViewById(R.id.receptasbalinamoji);
        skaiciuotibb.setOnClickListener(v -> {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestisbb.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestisbb.getText().toString());
                rezultatasbb.setText(data * ciber + " arbatinių šaukštelių ciberžolės");
                rezultatasbb2.setText(data * kokos + " arbatinių šaukštelių kokosų aliejaus");
                rezultatasbb3.setText(data * eteris + " lašų metų eterinio aliejaus");
                receptasbalinamoji1.setText("Darbo eiga: \n" + "Viską sumaišyti ir valyti dantis 2-3 kartus per dieną.\n" +
                        "Kuo dažniau naudosite pastą, tuo greičiau pasieksite efektą.");
            }
        });
    }
}
