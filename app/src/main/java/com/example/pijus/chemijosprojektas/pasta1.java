package com.example.pijus.chemijosprojektas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pasta1 extends AppCompatActivity {
    Button skaiciuotipp;
    EditText ivestispp;
    TextView rezultataspp;
    TextView rezultataspp2;
    TextView rezultataspp3;
    double vanduo=12;
    double sampunas=12;
    double zelatina=1.4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta1);
        skaiciuotipp=(Button)findViewById(R.id.skaiciuotip);
        ivestispp=(EditText)findViewById(R.id.ivestisp);
        rezultataspp=(TextView)findViewById(R.id.rezultatasp);
        rezultataspp2=(TextView)findViewById(R.id.rezultatasp2);
        rezultataspp3=(TextView)findViewById(R.id.rezultatasp3);
        // string ivedimas=ivestis.getText().toString();
        skaiciuotipp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                else if(ivedimas==""){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                //  else{
                int data=Integer.decode(ivestispp.getText().toString());
                rezultataspp.setText(String.valueOf(data*vanduo)+"ml vandens");
                rezultataspp2.setText(String.valueOf(data*sampunas)+"ml sampuno");
                rezultataspp3.setText(String.valueOf(data*zelatina)+"g zelatinos");

                // }
            }
        });
    }
}
