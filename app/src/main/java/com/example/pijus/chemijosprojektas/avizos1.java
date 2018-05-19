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
    TextView receptasavi;
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
        receptasavi=(TextView)findViewById(R.id.receptasav);
       final String ivedimas=ivestisa.getText().toString();
        skaiciuotia.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
               /*  if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
               if(ivestisa.getText().toString().isEmpty()){
                   Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                   // ivestisa.setError("Prasome ivesti kieki");
                    return;
                }
                  else{
                int data=Integer.decode(ivestisa.getText().toString());
                rezultatasaa.setText(String.valueOf(data*dribsniai)+" g avižinių dribsnių");
                rezultatasaa2.setText(String.valueOf(data*miltai)+" g kepimo miltelių");
                rezultatasaa3.setText(String.valueOf(data*vendens)+" ml vandens");
                receptasavi.setText("Darbo eiga: \n" +
                        "1.Nusivalykite veido odą. \n" +
                        "2.Indelyje sumaišykite dribsnius su soda.\n" +
                        "3.Įpilkite drungno vandens, kad gautumėte pastą. \n" +
                        "4.Švelniai trinkite veidą. \n" +
                        "5.Nusiprauskite ir nusausinkite.");
                 }
            }
        });
    }
}
