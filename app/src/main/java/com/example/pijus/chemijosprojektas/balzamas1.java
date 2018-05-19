package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balzamas1 extends AppCompatActivity {
    Button skaiciuotibbal;
    EditText ivestisbbal;
    TextView rezultatasbbal;
    TextView rezultatasbbal2;
    TextView rezultatasbbal3;
    TextView rezultatasbbal4;
    TextView receptasbalzamas1;
    double alyvos=23;
    double vaskas=17;
    double medus=6;
    double vandekas =0.05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balzamas1);
        skaiciuotibbal=(Button)findViewById(R.id.skaiciuotibal);
        ivestisbbal=(EditText)findViewById(R.id.ivestisbal);
        rezultatasbbal=(TextView)findViewById(R.id.rezultatasbal);
        rezultatasbbal2=(TextView)findViewById(R.id.rezultatasbal2);
        rezultatasbbal3=(TextView)findViewById(R.id.rezultatasbal3);
        rezultatasbbal4=(TextView)findViewById(R.id.rezultatasbal4);
        receptasbalzamas1=(TextView)findViewById(R.id.receptasbalzamas);
         final String ivedimasbbal=ivestisbbal.getText().toString();
        skaiciuotibbal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimasbbal=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                /*if(ivedimasbbal.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/if(ivestisbbal.getText().toString().isEmpty()){
                    Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                    // ivestisbbal.setError("Prasome ivesti kieki");
                    return;
                }

                  else{
                int data=Integer.decode(ivestisbbal.getText().toString());
                rezultatasbbal.setText(String.valueOf(data*alyvos)+" g alyvuogių aliejaus");
                rezultatasbbal2.setText(String.valueOf(data*vaskas)+" g bicčių vaško");
                rezultatasbbal3.setText(String.valueOf(data*medus)+" g želatinos");
                rezultatasbbal4.setText(String.valueOf(data*vandekas)+" ml vandens");
                receptasbalzamas1.setText("Darbo eiga: \n"+"1.Aliejuje ištirpinti vašką. Neleisti užvirti \n"+
                                "2.Kai aliejus ir vaškas susimaišys, įmaišyti medų.\n" +
                                "3. Įlašinti vitaminą E.\n" +
                                "4. Gautą mišinį palikti atvėsti.\n" +
                                "5. Balzamą laikyti šaldytuve.\n" +
                                "6. Naudoti tik sustingusį."
                );
                 }
            }
        });
    }
}
