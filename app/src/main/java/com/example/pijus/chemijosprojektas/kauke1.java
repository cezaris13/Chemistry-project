package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kauke1 extends AppCompatActivity {
    Button skaiciuotikk;
    EditText ivestiskk;
    TextView rezultataskk;
    TextView rezultataskk2;
    TextView rezultataskk3;
    TextView receptaskau;
    double mieless=5.5;
    double vanduoo=1;
    double actass=1.5;
    /*
           1. 5, 5 g sausų mielių;
           2. 1,5 lašai acto;
           3. 1 šaukštelis vandens.
        */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kauke1);
        skaiciuotikk=(Button)findViewById(R.id.skaiciuotik);
        ivestiskk=(EditText)findViewById(R.id.ivestisk);
        rezultataskk=(TextView)findViewById(R.id.rezultatask);
        rezultataskk2=(TextView)findViewById(R.id.rezultatask2);
        rezultataskk3=(TextView)findViewById(R.id.rezultatask3);
        receptaskau=(TextView)findViewById(R.id.receptaska);
        final String ivedimas=ivestiskk.getText().toString();
        skaiciuotikk.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                /* if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                if(ivestiskk.getText().toString().isEmpty()){
                    Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                    // ivestiskk.setError("Prasome ivesti kieki");
                    return;
                }
                  else{
                int data=Integer.decode(ivestiskk.getText().toString());
                rezultataskk.setText(String.valueOf(data*mieless)+" g mielių");
                rezultataskk2.setText(String.valueOf(data*vanduoo)+" šaukstelių vandens");
                rezultataskk3.setText(String.valueOf(data*actass)+" lašų acto");
                receptaskau.setText(" Darbo eiga: \n" +
                        "1.Indelyje maišykite mieles, actą ir vandenį, kol pasidarys tiršta masė. Jei reikia, įpilkite dar šiek tiek vandens, kad kaukę būtų galima tepti ant odos. \n" +
                        "2.Užtepkite kaukę ant odos. Palaikykite 10 – 15 min. \n" +
                        "3.Nuplaukite šiltu vandeniu ir nusausinkite.");
                 }
            }
        });
    }
}
