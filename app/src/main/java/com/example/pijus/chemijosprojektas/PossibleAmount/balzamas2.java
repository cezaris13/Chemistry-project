package com.example.pijus.chemijosprojektas.PossibleAmount;

import android.os.Bundle;

import com.example.pijus.chemijosprojektas.R;

public class balzamas2 extends BaseCalculatePortionsActivity {
    double alyvos = 23;
    double vaskas = 17;
    double medus = 6;
    double vandekas = 0.05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balzamas2);
        calculateButton = findViewById(R.id.buttonba3);
        editTexts.add(findViewById(R.id.ivestisba1));
        editTexts.add(findViewById(R.id.ivestisba2));
        editTexts.add(findViewById(R.id.ivestisba3));
        editTexts.add(findViewById(R.id.ivestisba4));
        ingredients.add(alyvos);
        ingredients.add(vaskas);
        ingredients.add(medus);
        ingredients.add(vandekas);
        answer = findViewById(R.id.textViewba2);
        calculateButton.setOnClickListener(v -> {
            calculatePortion();
        });
    }
}
