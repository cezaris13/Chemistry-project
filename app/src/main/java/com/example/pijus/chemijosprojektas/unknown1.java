package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        skaiciuotiuu= findViewById(R.id.skaiciuotiu);
        ivestisuu= findViewById(R.id.ivestisu);
        rezultatasuu= findViewById(R.id.rezultatasu);
        rezultatasuu2= findViewById(R.id.rezultatasu2);
        rezultatasuu3= findViewById(R.id.rezultatasu3);
        receptasunknown= findViewById(R.id.receptasun);
        skaiciuotiuu.setOnClickListener(v -> {
           if(ivestisuu.getText().toString().isEmpty()){
               Toast.makeText( getApplicationContext(),"Prašome įvesti kiekį",Toast.LENGTH_SHORT).show();
           }
            else{
            int data=Integer.decode(ivestisuu.getText().toString());
            rezultatasuu.setText(data * miltai +" g miltų");
            rezultatasuu2.setText(data * druska +" g druskos");
            rezultatasuu3.setText(data * vanduooo +" ml vandens");
            receptasunknown.setText("Darbo eiga: \n" +
                    "1. Iš sudėtinių dalių suminkykite tešlą. \n" +
                    "2. Gaminkite norimą skulptūrą.");
             }
        });
    }
}
