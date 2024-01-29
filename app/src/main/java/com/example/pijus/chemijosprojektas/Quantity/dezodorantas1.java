package com.example.pijus.chemijosprojektas.Quantity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pijus.chemijosprojektas.R;

public class dezodorantas1 extends AppCompatActivity {
    Button skaiciuotidd;
    EditText ivestisdd;
    TextView rezultatasdd;
    TextView rezultatasdd2;
    TextView rezultatasdd3;
    TextView rezultatasdd4;
    TextView receptasdez;
    double soda = 2;
    double krakmolas = 2;
    double kokosai = 2;
    double eter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezodorantas1);
        skaiciuotidd = findViewById(R.id.skaiciuotid);
        ivestisdd = findViewById(R.id.ivestisd);
        rezultatasdd = findViewById(R.id.rezultatasd);
        rezultatasdd2 = findViewById(R.id.rezultatasd2);
        rezultatasdd3 = findViewById(R.id.rezultatasd3);
        rezultatasdd4 = findViewById(R.id.rezultatasd4);
        receptasdez = findViewById(R.id.receptasde);
        skaiciuotidd.setOnClickListener(v -> {
            if (ivestisdd.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestisdd.getText().toString());
                rezultatasdd.setText(data * soda + " šaukštai sodos");
                rezultatasdd2.setText(data * krakmolas + " šaukštai krakmolo");
                rezultatasdd3.setText(data * kokosai + " šaukštai kokosų aliejaus");
                rezultatasdd4.setText(data * eter + " šaukštai eterinio aliejaus");
                receptasdez.setText("Darbo eiga: \n" + "Visas sudedamąsias dalys gerai išmaišyti, gautą masę sudėti į indą ir laikyti šaldytuve.");
            }
        });
    }
}
