package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    double dribsniai=6;
    double miltai=5;
    double vendens=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avizos1);
        skaiciuotia=(Button)findViewById(R.id.skaiciuotia);
        ivestisa=(EditText)findViewById(R.id.ivestisa);
        rezultatasaa=(TextView)findViewById(R.id.rezultatasa);
        rezultatasaa2=(TextView)findViewById(R.id.rezultatasa2);
        rezultatasaa3=(TextView)findViewById(R.id.rezultatasa3);
       final String ivedimas=ivestisa.getText().toString();
        skaiciuotia.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                 if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                  else{
                int data=Integer.decode(ivestisa.getText().toString());
                rezultatasaa.setText(String.valueOf(data*dribsniai)+"g aviziniu dribsniu");
                rezultatasaa2.setText(String.valueOf(data*miltai)+"g kepimo milteliu");
                rezultatasaa3.setText(String.valueOf(data*vendens)+"ml vandens");

                 }
            }
        });
    }
}
