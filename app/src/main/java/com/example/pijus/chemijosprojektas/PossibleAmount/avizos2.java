package com.example.pijus.chemijosprojektas.PossibleAmount;

import android.os.Bundle;

import com.example.pijus.chemijosprojektas.R;


public class avizos2 extends BaseCalculatePortionsActivity {
    double dribsniai = 6;
    double miltai = 5;
    double vendens = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avizos2);
        calculateButton = findViewById(R.id.buttona3);
        editTexts.add(findViewById(R.id.ivestisa1));
        editTexts.add(findViewById(R.id.ivestisa2));
        editTexts.add(findViewById(R.id.ivestisa3));
        ingredients.add(dribsniai);
        ingredients.add(miltai);
        ingredients.add(vendens);
        answer = findViewById(R.id.textViewa2);
        calculateButton.setOnClickListener(v ->
                calculatePortion()
        );
    }
}
