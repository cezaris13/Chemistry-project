package com.example.pijus.chemijosprojektas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pijus.chemijosprojektas.Recipes.Companion.getAllRecipes

class MainActivity : AppCompatActivity() {
    private val toastMessage = "Prašome pasirinkti nors vieną receptą"

    //    ArrayList<RadioButton>
    var radioButtons: ArrayList<RadioButton> = ArrayList()

    var radioGroup: RadioGroup? = null

    var kelintaspage = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        radioGroup = findViewById(R.id.radioGroup)
        radioButtons.add(findViewById(R.id.RadioButton))
        radioButtons.add(findViewById(R.id.RadioButton2))
        radioButtons.add(findViewById(R.id.RadioButton3))
        radioButtons.add(findViewById(R.id.RadioButton4))
        radioButtons.add(findViewById(R.id.RadioButton5))
        radioButtons.add(findViewById(R.id.RadioButton6))
        radioButtons.add(findViewById(R.id.RadioButton7))
        radioButtons.add(findViewById(R.id.RadioButton8))
        radioButtons.add(findViewById(R.id.RadioButton9))
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener { openPage(calculateAmount = false) }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener { openPage(calculateAmount = true) }
    }

    private fun openPage(calculateAmount: Boolean){
        if (kelintaspage == 0) {
            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
        } else {
            val recipeData = getAllRecipes()[kelintaspage+1]
            setContent {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "exampleComposeView") {
                    composable("exampleComposeView") {
                        if (calculateAmount) {
                            CalculateAmount(recipeData)
                        }
                        else {
                            CalculateQuantities(recipeData)
                        }
                    }
                }
            }
        }
    }

    private fun setRadioButton(radioButtonId: Int) {
        for (i in radioButtons.indices) {
            radioButtons[i].isChecked = radioButtonId == i
        }
        kelintaspage = radioButtonId
    }

    fun funkcija(v: View?) {
        setRadioButton(1)
    }

    fun funkcija2(v: View?) {
        setRadioButton(2)
    }

    fun funkcija3(v: View?) {
        setRadioButton(3)
    }

    fun funkcija4(v: View?) {
        setRadioButton(4)
    }

    fun funkcija5(v: View?) {
        setRadioButton(5)
    }

    fun funkcija6(v: View?) {
        setRadioButton(6)
    }

    fun funkcija7(v: View?) {
        setRadioButton(7)
    }

    fun funkcija8(v: View?) {
        setRadioButton(8)
    }

    fun funkcija9(v: View?) {
        setRadioButton(9)
    }
}