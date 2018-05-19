package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    double aliejus=22;
    double vaskas=12;
    double lasas=1;
    double alavijo=5;
    double E=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losjonas1);
        skaiciuotill=(Button)findViewById(R.id.skaiciuotil);
        ivestisll=(EditText)findViewById(R.id.ivestisl);
        rezultatasll=(TextView)findViewById(R.id.rezultatasl);
        rezultatasll2=(TextView)findViewById(R.id.rezultatasl2);
        rezultatasll3=(TextView)findViewById(R.id.rezultatasl3);
        rezultatasll4=(TextView)findViewById(R.id.rezultatasl4);
        rezultatasll5=(TextView)findViewById(R.id.rezultatasl5);
        receptaslos=(TextView)findViewById(R.id.receptaslo);
        final String ivedimas=ivestisll.getText().toString();
        skaiciuotill.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
               /*  if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/if(ivestisll.getText().toString().isEmpty()){
                  Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                    // ivestisll.setError("Prasome ivesti kieki");
                    return;
                }
                  else{
                int data=Integer.decode(ivestisll.getText().toString());
                rezultatasll.setText(String.valueOf(data*aliejus)+" g aliejaus");
                rezultatasll2.setText(String.valueOf(data*vaskas)+" g bičių vaško");
                rezultatasll3.setText(String.valueOf(data*lasas)+" lašų eterinio aliejaus");
                rezultatasll4.setText(String.valueOf(data*alavijo)+" lašų alavijo");
                rezultatasll5.setText(String.valueOf(data*E)+" tablečių vitamino E");
                receptaslos.setText("Darbo eiga: \n" +
                        "1. Aliejuje ištirpinti vašką. Neleisti užvirti.\n" +
                        "2.  Į šia masę pilti vitaminą E, eterinį aliejų ir alaviją. \n" +
                        "3. Visą masę gerai išmaišyti. \n" +
                        "4. Tepkite ant odos.");
                 }
            }
        });
    }
}
