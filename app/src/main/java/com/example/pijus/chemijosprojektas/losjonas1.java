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
    double vanduo=12;
    double sampunas=12;
    double zelatina=1.4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losjonas1);
        skaiciuotill=(Button)findViewById(R.id.skaiciuotil);
        ivestisll=(EditText)findViewById(R.id.ivestisl);
        rezultatasll=(TextView)findViewById(R.id.rezultatasl);
        rezultatasll2=(TextView)findViewById(R.id.rezultatasl2);
        rezultatasll3=(TextView)findViewById(R.id.rezultatasl3);
        // string ivedimas=ivestis.getText().toString();
        skaiciuotill.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                else if(ivedimas==""){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                //  else{
                int data=Integer.decode(ivestisll.getText().toString());
                rezultatasll.setText(String.valueOf(data*vanduo)+"ml vandens");
                rezultatasll2.setText(String.valueOf(data*sampunas)+"ml sampuno");
                rezultatasll3.setText(String.valueOf(data*zelatina)+"g zelatinos");

                // }
            }
        });
    }
}
