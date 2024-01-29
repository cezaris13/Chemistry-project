package com.example.pijus.chemijosprojektas.PossibleAmount;

import android.os.Bundle;

import com.example.pijus.chemijosprojektas.R;

public class dezodorantas2 extends BaseCalculatePortionsActivity {
    double soda = 2;
    double krakmolas = 2;
    double kokosai = 2;
    double eter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezodorantas2);
        calculateButton = findViewById(R.id.buttond3);
        editTexts.add(findViewById(R.id.ivestisd1));
        editTexts.add(findViewById(R.id.ivestisd2));
        editTexts.add(findViewById(R.id.ivestisd3));
        editTexts.add(findViewById(R.id.ivestisd4));

        ingredients.add(soda);
        ingredients.add(krakmolas);
        ingredients.add(kokosai);
        ingredients.add(eter);
        answer = findViewById(R.id.textViewd2);
        calculateButton.setOnClickListener(v ->
                calculatePortion()
        );
    }
}
