package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class unknown1 extends AppCompatActivity {
    Button skaiciuotiuu;
    EditText ivestisuu;
    TextView rezultatasuu;
    TextView rezultatasuu2;
    TextView rezultatasuu3;
    TextView receptasunknown;
    double miltai=15;
    double druska=5.6;
    double vanduooo=8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknown1);
        skaiciuotiuu=(Button)findViewById(R.id.skaiciuotiu);
        ivestisuu=(EditText)findViewById(R.id.ivestisu);
        rezultatasuu=(TextView)findViewById(R.id.rezultatasu);
        rezultatasuu2=(TextView)findViewById(R.id.rezultatasu2);
        rezultatasuu3=(TextView)findViewById(R.id.rezultatasu3);
        receptasunknown=(TextView)findViewById(R.id.receptasun);
         final String ivedimas=ivestisuu.getText().toString();
        skaiciuotiuu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
               /*  if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
               if(ivestisuu.getText().toString().isEmpty()){
                   Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                   // ivestisuu.setError("Prasome ivesti kieki");
                    return;
                }
                else{
                int data=Integer.decode(ivestisuu.getText().toString());
                rezultatasuu.setText(String.valueOf(data*miltai)+" g miltų");
                rezultatasuu2.setText(String.valueOf(data*druska)+" g druskos");
                rezultatasuu3.setText(String.valueOf(data*vanduooo)+" ml vandens");
                receptasunknown.setText("Darbo eiga: \n" +
                        "1. Iš sudėtinių dalių suminkykite tešlą. \n" +
                        "2. Gaminkite norimą skulptūrą.");

                 }
            }
        });
    }
}
