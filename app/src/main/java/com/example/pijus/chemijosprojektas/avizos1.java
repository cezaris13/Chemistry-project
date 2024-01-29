package com.example.pijus.chemijosprojektas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class avizos1 extends AppCompatActivity {
    Button skaiciuotia;
    EditText ivestisa;
    TextView rezultatasaa;
    TextView rezultatasaa2;
    TextView rezultatasaa3;
    TextView receptasavi;
    double dribsniai = 6;
    double miltai = 5;
    double vendens = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avizos1);
        skaiciuotia = findViewById(R.id.skaiciuotia);
        ivestisa = findViewById(R.id.ivestisa);
        rezultatasaa = findViewById(R.id.rezultatasa);
        rezultatasaa2 = findViewById(R.id.rezultatasa2);
        rezultatasaa3 = findViewById(R.id.rezultatasa3);
        receptasavi = findViewById(R.id.receptasav);
        skaiciuotia.setOnClickListener(v -> {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestisa.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestisa.getText().toString());
                rezultatasaa.setText(data * dribsniai + " g avižinių dribsnių");
                rezultatasaa2.setText(data * miltai + " g kepimo miltelių");
                rezultatasaa3.setText(data * vendens + " ml vandens");
                receptasavi.setText("Darbo eiga: \n" +
                        "1.Nusivalykite veido odą. \n" +
                        "2.Indelyje sumaišykite dribsnius su soda.\n" +
                        "3.Įpilkite drungno vandens, kad gautumėte pastą. \n" +
                        "4.Švelniai trinkite veidą. \n" +
                        "5.Nusiprauskite ir nusausinkite.");
            }
        });
    }
}
