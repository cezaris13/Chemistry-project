package com.example.pijus.chemijosprojektas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.pijus.chemijosprojektas.PossibleAmount.avizos2;
import com.example.pijus.chemijosprojektas.PossibleAmount.balinamoji2;
import com.example.pijus.chemijosprojektas.PossibleAmount.balzamas2;
import com.example.pijus.chemijosprojektas.PossibleAmount.dezodorantas2;
import com.example.pijus.chemijosprojektas.PossibleAmount.kauke2;
import com.example.pijus.chemijosprojektas.PossibleAmount.losjonas2;
import com.example.pijus.chemijosprojektas.PossibleAmount.pasta2;
import com.example.pijus.chemijosprojektas.PossibleAmount.unknown2;
import com.example.pijus.chemijosprojektas.PossibleAmount.vonioszele2;
import com.example.pijus.chemijosprojektas.Quantity.avizos1;
import com.example.pijus.chemijosprojektas.Quantity.balinamoji1;
import com.example.pijus.chemijosprojektas.Quantity.balzamas1;
import com.example.pijus.chemijosprojektas.Quantity.dezodorantas1;
import com.example.pijus.chemijosprojektas.Quantity.kauke1;
import com.example.pijus.chemijosprojektas.Quantity.losjonas1;
import com.example.pijus.chemijosprojektas.Quantity.pasta1;
import com.example.pijus.chemijosprojektas.Quantity.unknown1;
import com.example.pijus.chemijosprojektas.Quantity.vonioszele1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String toastMessage = "prasome pasirinkti nors viena recepta";
    private ArrayList<Class> pages1 = new ArrayList<Class>() {{
        add(vonioszele1.class);
        add(kauke1.class);
        add(unknown1.class);
        add(balzamas1.class);
        add(losjonas1.class);
        add(dezodorantas1.class);
        add(pasta1.class);
        add(balinamoji1.class);
        add(avizos1.class);
    }};

    ArrayList<Class> pages2 = new ArrayList<Class>() {{
        add(vonioszele2.class);
        add(kauke2.class);
        add(unknown2.class);
        add(balzamas2.class);
        add(losjonas2.class);
        add(dezodorantas2.class);
        add(pasta2.class);
        add(balinamoji2.class);
        add(avizos2.class);
    }};

    //    ArrayList<RadioButton>
    RadioButton pirmas;
    RadioButton antras;
    RadioButton trecias;
    RadioButton ketvirtas;
    RadioButton penktas;
    RadioButton sestas;
    RadioButton septintas;
    RadioButton astuntas;
    RadioButton devintas;
    int kelintaspage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pirmas = findViewById(R.id.RadioButton);
        antras = findViewById(R.id.RadioButton2);
        trecias = findViewById(R.id.RadioButton3);
        ketvirtas = findViewById(R.id.RadioButton4);
        penktas = findViewById(R.id.RadioButton5);
        sestas = findViewById(R.id.RadioButton6);
        septintas = findViewById(R.id.RadioButton7);
        astuntas = findViewById(R.id.RadioButton8);
        devintas = findViewById(R.id.RadioButton9);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            if (kelintaspage == 0) {
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
            } else {
                startActivity(new Intent(getApplicationContext(), pages1.get(kelintaspage + 1)));
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            if (kelintaspage == 0) {
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
            } else {
                startActivity(new Intent(getApplicationContext(), pages2.get(kelintaspage + 1)));
            }
        });
    }

    //problema: jei useris nuims savo pasirinkima bus blogai
    public void funkcija(View v) {
        if (pirmas.isChecked()) {
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
        kelintaspage = 2;
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
        kelintaspage = 3;
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
        kelintaspage = 4;
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
        kelintaspage = 5;
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
        kelintaspage = 6;
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
        kelintaspage = 7;
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
        kelintaspage = 8;
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
        kelintaspage = 9;
    }
}