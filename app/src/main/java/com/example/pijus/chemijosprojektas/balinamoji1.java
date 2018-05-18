package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balinamoji1 extends AppCompatActivity {
    Button skaiciuotibb;
    EditText ivestisbb;
    TextView rezultatasbb;
    TextView rezultatasbb2;
    TextView rezultatasbb3;
    double ciber=1;
    double kokos=1;
    double eteris=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balinamoji1);
        skaiciuotibb=(Button)findViewById(R.id.skaiciuotib);
        ivestisbb=(EditText)findViewById(R.id.ivestisb);
        rezultatasbb=(TextView)findViewById(R.id.rezultatasb);
        rezultatasbb2=(TextView)findViewById(R.id.rezultatasb2);
        rezultatasbb3=(TextView)findViewById(R.id.rezultatasb3);
       final String ivedimasbalinamoji=ivestisbb.getText().toString();
        skaiciuotibb.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimasbalinamoji=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                */
               /* if(ivedimasbalinamoji.matches("")){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                    return;
                }*/
              /* if(TextUtils.isEmpty(ivedimasbalinamoji)){
                   ivestisbb.setError("Prasome ivest kieki");
                   return;
               }*/if(ivestisbb.getText().toString().isEmpty()){
                    ivestisbb.setError("Prasome ivest kieki");
                    return;
                }
                 else  {
                int data=Integer.decode(ivestisbb.getText().toString());
                rezultatasbb.setText(String.valueOf(data*ciber)+"arbatiniu sauksteliu ciberzoles");
                rezultatasbb2.setText(String.valueOf(data*kokos)+"arbatiniu sauksteliu kokosu aliejaus");
                rezultatasbb3.setText(String.valueOf(data*eteris)+"lasu metu eterinio aliejaus");
                return;
                 }
            }
        });
    }
}
