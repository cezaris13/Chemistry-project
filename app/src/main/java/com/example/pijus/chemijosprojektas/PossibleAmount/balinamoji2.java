package com.example.pijus.chemijosprojektas.PossibleAmount;

import android.os.Bundle;
import android.widget.Toast;

import com.example.pijus.chemijosprojektas.R;

public class balinamoji2 extends BaseCalculatePortionsActivity {
    double ciber = 1;
    double kokos = 1;
    double eteris = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balinamoji2);
        calculateButton = findViewById(R.id.buttonb3);
        editTexts.add(findViewById(R.id.ivestisb1));
        editTexts.add(findViewById(R.id.ivestisb2));
        editTexts.add( findViewById(R.id.ivestisb3));
        ingredients.add(ciber);
        ingredients.add(kokos);
        ingredients.add(eteris);
        answer = findViewById(R.id.textViewb2);
        calculateButton.setOnClickListener(v -> {
            calculatePortion();
        });
    }
}
