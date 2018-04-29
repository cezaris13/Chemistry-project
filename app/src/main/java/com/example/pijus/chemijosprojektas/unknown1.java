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
    double vanduo=12;
    double sampunas=12;
    double zelatina=1.4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknown1);
        skaiciuotiuu=(Button)findViewById(R.id.skaiciuotiu);
        ivestisuu=(EditText)findViewById(R.id.ivestisu);
        rezultatasuu=(TextView)findViewById(R.id.rezultatasu);
        rezultatasuu2=(TextView)findViewById(R.id.rezultatasu2);
        rezultatasuu3=(TextView)findViewById(R.id.rezultatasu3);
        // string ivedimas=ivestis.getText().toString();
        skaiciuotiuu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
               /* if(ivedimas=="iveskite kieki"){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }
                else if(ivedimas==""){
                    Toast.makeText( getApplicationContext(),"iveskite pasirinkta kieki",1000).show();
                }*/
                //  else{
                int data=Integer.decode(ivestisuu.getText().toString());
                rezultatasuu.setText(String.valueOf(data*vanduo)+"ml vandens");
                rezultatasuu2.setText(String.valueOf(data*sampunas)+"ml sampuno");
                rezultatasuu3.setText(String.valueOf(data*zelatina)+"g zelatinos");

                // }
            }
        });
    }
}
