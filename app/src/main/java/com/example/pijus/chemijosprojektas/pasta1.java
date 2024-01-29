package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    TextView receptaspp;
    double milteliai=7.5;
    double druska=1;
    double glizerolis=1.8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta1);
        skaiciuotipp= findViewById(R.id.skaiciuotip);
        ivestispp= findViewById(R.id.ivestisp);
        rezultataspp= findViewById(R.id.rezultatasp);
        rezultataspp2= findViewById(R.id.rezultatasp2);
        rezultataspp3= findViewById(R.id.rezultatasp3);
        receptaspp= findViewById(R.id.receptaspp);
        skaiciuotipp.setOnClickListener(v -> {//to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if(ivestispp.getText().toString().isEmpty()){
                Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",Toast.LENGTH_SHORT).show();
            }
            else{
            int data=Integer.decode(ivestispp.getText().toString());
            rezultataspp.setText(data * milteliai +" g kepimo miltelių");
            rezultataspp2.setText(data * druska +" g druskos");
            rezultataspp3.setText(data * glizerolis +" ml glicerolio");
            receptaspp.setText(" Darbo eiga: \n" +
                    "1. Sumašykite miltelius ir druską. \n" +
                    "2. Spilkite glicerolį. \n" +
                    "3. Pilkite iš lėto vandenį, kol gausite tinkamos konsistencijos masę.");
             }
        });
    }
}
