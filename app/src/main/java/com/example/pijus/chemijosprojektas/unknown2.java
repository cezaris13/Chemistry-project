package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class unknown2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    TextView atsakymas;
    double mltai=15;
    double druska=5.6;
    double vanduoooo=8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknown2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttonu3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisu1);
        antrasvonia=(EditText)findViewById(R.id.ivestisu2);
        treciasvonia=(EditText)findViewById(R.id.ivestisu3);
        atsakymas=(TextView)findViewById(R.id.textViewu2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Prašome užpildyti visus langelius", 1000).show();
                }
                else {
                    double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                    double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double min = 100000;

                    if (min > vanduo1/mltai) {
                        min = vanduo1/mltai;
                    }
                    if (min > vanduo2/vanduoooo) {
                        min = vanduo2/vanduoooo;
                    }
                    if (min > vanduo3/druska) {
                        min = vanduo3/druska;
                    }
                    atsakymas.setText(String.valueOf(String.format("%.2f", min)) + "porcijų");

                }
            }
        });
    }
}
