package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class vonioszele1 extends AppCompatActivity {
    Button skaiciuoti;
    EditText ivestis;
    TextView rezultatas;
    TextView rezultatas2;
    TextView rezultatas3;
    TextView receptasvv;
    double vanduo=12;
    double sampunas=12;
    double zelatina=1.4;
    /*
           1. 5, 5 g sausų mielių;
           2. 1,5 lašai acto;
           3. 1 šaukštelis vandens.
        */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vonioszele1);
        skaiciuoti=(Button)findViewById(R.id.skaiciuoti);
        ivestis=(EditText)findViewById(R.id.ivestis);
        rezultatas=(TextView)findViewById(R.id.rezultatas);
        rezultatas2=(TextView)findViewById(R.id.rezultatas2);
        rezultatas3=(TextView)findViewById(R.id.rezultatas3);
        receptasvv=(TextView)findViewById(R.id.receptasv);
       final String ivedimas=ivestis.getText().toString();
                skaiciuoti.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
              /*   if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/if(ivestis.getText().toString().isEmpty()){
                    Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                   // ivestis.setError("Prasome ivesti kieki");
                    return;
                }
                else{
                    int data=Integer.decode(ivestis.getText().toString());
                    rezultatas.setText(String.valueOf(data*vanduo)+" ml vandens");
                    rezultatas2.setText(String.valueOf(data*sampunas)+" ml šampūno");
                    rezultatas3.setText(String.valueOf(data*zelatina)+" g želatinos");
                    receptasvv.setText("Darbo eiga: \n" +
                            "1. Į užvirintą vandenį supilti želatiną ir ją ištirpinti. \n" +
                            "2. Įmaišykite šampūną. \n" +
                            "3. Atvėsinkite gautą masę. \n" +
                            "4. Sustingusią masę galima naudoti prausimuisi.");
                }
            }
        });
    }
}
