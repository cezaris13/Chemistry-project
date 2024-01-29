package com.example.pijus.chemijosprojektas.PossibleAmount;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BaseCalculatePortionsActivity extends AppCompatActivity {
    String toastMessage = "Prašome užpildyti visus langelius";
    ArrayList<EditText> editTexts = new ArrayList<>();
    Button calculateButton;
    TextView answer;
    ArrayList<Double> ingredients = new ArrayList<>();

    void calculatePortion() {
        answer.setText("");
        for (int i = 0; i < editTexts.size(); i++) {
            if (editTexts.get(i).toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
                return;
            }
        }

        double min = 100000;
        for (int i = 0; i < editTexts.size(); i++) {
            double value = Double.parseDouble(editTexts.get(i).getText().toString());
            if (min > value / ingredients.get(i))
                min = value / ingredients.get(i);
        }
        answer.setText(String.format("%.2f", min) + "porcijų");
    }
}
