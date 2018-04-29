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
        setContentView(R.layout.activity_kauke1);
        skaiciuotikk=(Button)findViewById(R.id.skaiciuotik);
        ivestiskk=(EditText)findViewById(R.id.ivestisk);
        rezultataskk=(TextView)findViewById(R.id.rezultatask);
        rezultataskk2=(TextView)findViewById(R.id.rezultatask2);
        rezultataskk3=(TextView)findViewById(R.id.rezultatask3);
        // string ivedimas=ivestis.getText().toString();
        skaiciuotikk.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                else if(ivedimas==""){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                //  else{
                int data=Integer.decode(ivestiskk.getText().toString());
                rezultataskk.setText(String.valueOf(data*vanduo)+"ml vandens");
                rezultataskk2.setText(String.valueOf(data*sampunas)+"ml sampuno");
                rezultataskk3.setText(String.valueOf(data*zelatina)+"g zelatinos");

                // }
            }
        });
    }
}
