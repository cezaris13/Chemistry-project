package com.example.pijus.chemijosprojektas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox pirmas;
    CheckBox antras;
    CheckBox trecias;
    CheckBox ketvirtas;
    CheckBox penktas;
    CheckBox sestas;
    CheckBox septintas;
    CheckBox astuntas;
    CheckBox devintas;
    int kelintaspage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pirmas=(CheckBox)findViewById(R.id.CheckBox);
        antras=(CheckBox)findViewById(R.id.CheckBox2);
        trecias=(CheckBox)findViewById(R.id.CheckBox3);
        ketvirtas=(CheckBox)findViewById(R.id.CheckBox4);
        penktas=(CheckBox)findViewById(R.id.CheckBox5);
        sestas=(CheckBox)findViewById(R.id.CheckBox6);
        septintas=(CheckBox)findViewById(R.id.CheckBox7);
        astuntas=(CheckBox)findViewById(R.id.CheckBox8);
        devintas=(CheckBox)findViewById(R.id.CheckBox9);
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(kelintaspage==0){
                    Toast.makeText(getApplicationContext(), "prasome pasirinkti nors viena recepta", 1000).show();
                }
                if(kelintaspage==1){
                    Intent vonia= new Intent(getApplicationContext(),vonioszele1.class);
                    startActivity(vonia);
                }
                if(kelintaspage==2){
                    Intent vonia= new Intent(getApplicationContext(),kauke1.class);
                    startActivity(vonia);

                }
                if(kelintaspage==3){
                    Intent vonia= new Intent(getApplicationContext(),unknown1.class);
                    startActivity(vonia);

                }
                if(kelintaspage==4){
                    Intent vonia= new Intent(getApplicationContext(),balzamas1.class);
                    startActivity(vonia);
                }
                if(kelintaspage==5){
                    Intent vonia= new Intent(getApplicationContext(),losjonas1.class);
                    startActivity(vonia);
                }
                if(kelintaspage==6){
                    Intent vonia= new Intent(getApplicationContext(),dezodorantas1.class);
                    startActivity(vonia);
                }
                if(kelintaspage==7){
                    Intent vonia= new Intent(getApplicationContext(),pasta1.class);
                    startActivity(vonia);
                }
                if(kelintaspage==8){
                    Intent vonia= new Intent(getApplicationContext(),balinamoji1.class);
                    startActivity(vonia);
                }
                if(kelintaspage==9){
                    Intent vonia= new Intent(getApplicationContext(),avizos1.class);
                    startActivity(vonia);
                }

            }
        });
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(kelintaspage==0){
                    Toast.makeText( getApplicationContext(), "prasome pasirinkti nors viena recepta", 1000).show();

                }
                if(kelintaspage==1){
                    Intent vonia= new Intent(getApplicationContext(),vonioszele2.class);
                    startActivity(vonia);
                }
                if(kelintaspage==2){
                    Intent vonia= new Intent(getApplicationContext(),kauke2.class);
                    startActivity(vonia);

                }
                if(kelintaspage==3){
                    Intent vonia= new Intent(getApplicationContext(),unknown2.class);
                    startActivity(vonia);

                }
                if(kelintaspage==4){
                    Intent vonia= new Intent(getApplicationContext(),balzamas2.class);
                    startActivity(vonia);
                }
                if(kelintaspage==5){
                    Intent vonia= new Intent(getApplicationContext(),losjonas2.class);
                    startActivity(vonia);
                }
                if(kelintaspage==6){
                    Intent vonia= new Intent(getApplicationContext(),dezodorantas2.class);
                    startActivity(vonia);
                }
                if(kelintaspage==7){
                    Intent vonia= new Intent(getApplicationContext(),pasta2.class);
                    startActivity(vonia);
                }
                if(kelintaspage==8){
                    Intent vonia= new Intent(getApplicationContext(),balinamoji2.class);
                    startActivity(vonia);
                }
                if(kelintaspage==9){
                    Intent vonia= new Intent(getApplicationContext(),avizos2.class);
                    startActivity(vonia);
                }

            }
        });

    }
    //problema: jei useris nuims savo pasirinkima bus blogai
    public void funkcija(View v) {
        if(pirmas.isChecked()) {
            antras.setChecked(false);
            trecias.setChecked(false);
            ketvirtas.setChecked(false);
            penktas.setChecked(false);
            sestas.setChecked(false);
            septintas.setChecked(false);
            astuntas.setChecked(false);
            devintas.setChecked(false);
            kelintaspage = 1;
        }

    }
    public void funkcija2(View v) {

        pirmas.setChecked(false);
        trecias.setChecked(false);
        ketvirtas.setChecked(false);
        penktas.setChecked(false);
        sestas.setChecked(false);
        septintas.setChecked(false);
        astuntas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=2;

    }
    public void funkcija3(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        ketvirtas.setChecked(false);
        penktas.setChecked(false);
        sestas.setChecked(false);
        septintas.setChecked(false);
        astuntas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=3;

    }
    public void funkcija4(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        trecias.setChecked(false);
        penktas.setChecked(false);
        sestas.setChecked(false);
        septintas.setChecked(false);
        astuntas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=4;
    }
    public void funkcija5(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        trecias.setChecked(false);
        ketvirtas.setChecked(false);
        sestas.setChecked(false);
        septintas.setChecked(false);
        astuntas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=5;

    }
    public void funkcija6(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        trecias.setChecked(false);
        ketvirtas.setChecked(false);
        penktas.setChecked(false);
        septintas.setChecked(false);
        astuntas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=6;

    }
    public void funkcija7(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        trecias.setChecked(false);
        ketvirtas.setChecked(false);
        penktas.setChecked(false);
        sestas.setChecked(false);
        astuntas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=7;

    }
    public void funkcija8(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        trecias.setChecked(false);
        ketvirtas.setChecked(false);
        penktas.setChecked(false);
        sestas.setChecked(false);
        septintas.setChecked(false);
        devintas.setChecked(false);
        kelintaspage=8;

    }
    public void funkcija9(View v) {
        pirmas.setChecked(false);
        antras.setChecked(false);
        trecias.setChecked(false);
        ketvirtas.setChecked(false);
        penktas.setChecked(false);
        sestas.setChecked(false);
        septintas.setChecked(false);
        astuntas.setChecked(false);
        kelintaspage=9;
    }
}