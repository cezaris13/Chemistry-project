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
    double vanduo=12;
    double sampunas=12;
    double zelatina=1.4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezodorantas1);
        skaiciuotidd=(Button)findViewById(R.id.skaiciuotid);
        ivestisdd=(EditText)findViewById(R.id.ivestisd);
        rezultatasdd=(TextView)findViewById(R.id.rezultatasd);
        rezultatasdd2=(TextView)findViewById(R.id.rezultatasd2);
        rezultatasdd3=(TextView)findViewById(R.id.rezultatasd3);
        // string ivedimas=ivestis.getText().toString();
        skaiciuotidd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                else if(ivedimas==""){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                //  else{
                int data=Integer.decode(ivestisdd.getText().toString());
                rezultatasdd.setText(String.valueOf(data*vanduo)+"ml vandens");
                rezultatasdd2.setText(String.valueOf(data*sampunas)+"ml sampuno");
                rezultatasdd3.setText(String.valueOf(data*zelatina)+"g zelatinos");

                // }
            }
        });
    }
}
