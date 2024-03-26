package com.example.notacookbook

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ItalianCuisineActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italian_cuisine)

        val italianDishImageView = findViewById<ImageView>(R.id.pizza)
        val ingredientsTextView = findViewById<TextView>(R.id.ingredientsTextView)

        // Set OnClickListener on the image view
        italianDishImageView.setOnClickListener {
            // Show ingredients
            ingredientsTextView.text = buildString {
                append("Ingredients:\n")
                append("\n")
                append("2 cups Flour\n")
                append("¼ cup Oil\n")
                append("Salt (to taste)\n")
                append("1 sachet Yeast\n")
                append("1 teaspoon Sugar\n")
                append("½ cup Pizza Sauce\n")
                append("½ cup Grilled Chicken (sliced)\n")
                append("1 cup Cheese (shredded)\n")
                append("Olives (as required, sliced)\n")
                append("Rocket Leaves (as required)")
            }
        }

        // Alternatively, you can set OnClickListener on the entire layout
        /*findViewById<View>(R.id.italianCuisineLayout).setOnClickListener {
            ingredientsTextView.text = "Spaghetti, Tomato Sauce, Basil, Olive Oil, Garlic"
        }*/
    }
}
