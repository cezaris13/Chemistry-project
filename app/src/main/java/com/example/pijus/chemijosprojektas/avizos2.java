package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class avizos2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double dribsniai=6;
    double miltai=5;
    double vendens=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avizos2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttona3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisa1);
        antrasvonia=(EditText)findViewById(R.id.ivestisa2);
        treciasvonia=(EditText)findViewById(R.id.ivestisa3);
        atsakymas=(TextView)findViewById(R.id.textViewa2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Prašome užpildyti visus langelius",1000).show();
                }
                else {
                    double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                    double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double min = 100000;

                    if (min > vanduo1/dribsniai) {
                        min = vanduo1/dribsniai;
                    }
                    if (min > vanduo2/miltai) {
                        min = vanduo2/miltai;
                    }
                    if (min > vanduo3/vendens) {
                        min = vanduo3/vendens;
                    }
                        atsakymas.setText(String.valueOf(String.format("%.2f",min )) + "porcijų");
                }
            }
        });
    }
}
