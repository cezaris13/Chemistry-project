package com.example.pijus.chemijosprojektas.Quantity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pijus.chemijosprojektas.R;

import java.util.ArrayList;

public class BaseQuantityActivity extends AppCompatActivity {
    private String toastMessage = "Prašome įvesti kiekį";
    ArrayList<TextView> results = new ArrayList<>();
    ArrayList<Double> ingredients = new ArrayList<>();
    ArrayList<String> ingredientText = new ArrayList<>();
    String recipe = "";

    Button calculateResults;
    EditText input;
    TextView recipeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balinamoji1);
        calculateResults = findViewById(R.id.skaiciuotib);
        input = findViewById(R.id.ivestisb);
        results.add(findViewById(R.id.rezultatasb));
        results.add(findViewById(R.id.rezultatasb2));
        results.add(findViewById(R.id.rezultatasb3));
        recipeView = findViewById(R.id.receptasbalinamoji);
        calculateResults.setOnClickListener(v -> {
            calculateButton();
        });
    }

    public void calculateButton() {
        if (input.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
            return;
        }

        int data = Integer.decode(input.getText().toString());
        for (int i = 0; i < results.size(); i++) {
            results.get(i).setText(data * ingredients.get(i) + ingredientText.get(i));
        }
        recipeView.setText(recipe);
    }
}
