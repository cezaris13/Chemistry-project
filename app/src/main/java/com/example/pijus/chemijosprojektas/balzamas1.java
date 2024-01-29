package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balzamas1 extends AppCompatActivity {
    Button skaiciuotibbal;
    EditText ivestisbbal;
    TextView rezultatasbbal;
    TextView rezultatasbbal2;
    TextView rezultatasbbal3;
    TextView rezultatasbbal4;
    TextView receptasbalzamas1;
    double alyvos = 23;
    double vaskas = 17;
    double medus = 6;
    double vandekas = 0.05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balzamas1);
        skaiciuotibbal = findViewById(R.id.skaiciuotibal);
        ivestisbbal = findViewById(R.id.ivestisbal);
        rezultatasbbal = findViewById(R.id.rezultatasbal);
        rezultatasbbal2 = findViewById(R.id.rezultatasbal2);
        rezultatasbbal3 = findViewById(R.id.rezultatasbal3);
        rezultatasbbal4 = findViewById(R.id.rezultatasbal4);
        receptasbalzamas1 = findViewById(R.id.receptasbalzamas);
        skaiciuotibbal.setOnClickListener(v -> {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestisbbal.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestisbbal.getText().toString());
                rezultatasbbal.setText(data * alyvos + " g alyvuogių aliejaus");
                rezultatasbbal2.setText(data * vaskas + " g bicčių vaško");
                rezultatasbbal3.setText(data * medus + " g želatinos");
                rezultatasbbal4.setText(data * vandekas + " ml vandens");
                receptasbalzamas1.setText("Darbo eiga: \n" + "1.Aliejuje ištirpinti vašką. Neleisti užvirti \n" +
                        "2.Kai aliejus ir vaškas susimaišys, įmaišyti medų.\n" +
                        "3. Įlašinti vitaminą E.\n" +
                        "4. Gautą mišinį palikti atvėsti.\n" +
                        "5. Balzamą laikyti šaldytuve.\n" +
                        "6. Naudoti tik sustingusį."
                );
            }
        });
    }
}
