package com.example.pijus.chemijosprojektas.Quantity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pijus.chemijosprojektas.R;

public class vonioszele1 extends AppCompatActivity {
    Button skaiciuoti;
    EditText ivestis;
    TextView rezultatas;
    TextView rezultatas2;
    TextView rezultatas3;
    TextView receptasvv;
    double vanduo = 12;
    double sampunas = 12;
    double zelatina = 1.4;

    /*
           1. 5, 5 g sausų mielių;
           2. 1,5 lašai acto;
           3. 1 šaukštelis vandens.
        */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vonioszele1);
        skaiciuoti = findViewById(R.id.skaiciuoti);
        ivestis = findViewById(R.id.ivestis);
        rezultatas = findViewById(R.id.rezultatas);
        rezultatas2 = findViewById(R.id.rezultatas2);
        rezultatas3 = findViewById(R.id.rezultatas3);
        receptasvv = findViewById(R.id.receptasv);
        skaiciuoti.setOnClickListener(v -> {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestis.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Prašome įvesti kiekį", Toast.LENGTH_SHORT).show();
            } else {
                int data = Integer.decode(ivestis.getText().toString());
                rezultatas.setText(data * vanduo + " ml vandens");
                rezultatas2.setText(data * sampunas + " ml šampūno");
                rezultatas3.setText(data * zelatina + " g želatinos");
                receptasvv.setText("Darbo eiga: \n" +
                        "1. Į užvirintą vandenį supilti želatiną ir ją ištirpinti. \n" +
                        "2. Įmaišykite šampūną. \n" +
                        "3. Atvėsinkite gautą masę. \n" +
                        "4. Sustingusią masę galima naudoti prausimuisi.");
            }
        });
    }
}
