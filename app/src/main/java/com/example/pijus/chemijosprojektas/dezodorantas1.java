package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class dezodorantas1 extends AppCompatActivity {
    Button skaiciuotidd;
    EditText ivestisdd;
    TextView rezultatasdd;
    TextView rezultatasdd2;
    TextView rezultatasdd3;
    TextView rezultatasdd4;
    TextView receptasdez;
    double soda=2;
    double krakmolas=2;
    double kokosai=2;
    double eter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezodorantas1);
        skaiciuotidd=(Button)findViewById(R.id.skaiciuotid);
        ivestisdd=(EditText)findViewById(R.id.ivestisd);
        rezultatasdd=(TextView)findViewById(R.id.rezultatasd);
        rezultatasdd2=(TextView)findViewById(R.id.rezultatasd2);
        rezultatasdd3=(TextView)findViewById(R.id.rezultatasd3);
        rezultatasdd4=(TextView)findViewById(R.id.rezultatasd4);
        receptasdez=(TextView)findViewById(R.id.receptasde);
        final String ivedimas=ivestisdd.getText().toString();
        skaiciuotidd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
              /*  if(ivedimas.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
              if(ivestisdd.getText().toString().isEmpty()){
                  Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",500).show();
                  // ivestisdd.setError("Prasome ivesti kieki");
                    return;
                }
                  else{
                int data=Integer.decode(ivestisdd.getText().toString());
                rezultatasdd.setText(String.valueOf(data*soda)+" šaukštai sodos");
                rezultatasdd2.setText(String.valueOf(data*krakmolas)+" šaukštai krakmolo");
                rezultatasdd3.setText(String.valueOf(data*kokosai)+" šaukštai kokosų aliejaus");
                rezultatasdd4.setText(String.valueOf(data*eter)+" šaukštai eterinio aliejaus");
                receptasdez.setText("Darbo eiga: \n"+"Visas sudedamąsias dalys gerai išmaišyti, gautą masę sudėti į indą ir laikyti šaldytuve.");
                }
            }
        });
    }
}
