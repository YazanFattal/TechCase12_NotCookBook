package com.example.notacookbook

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)
        val names = arrayOf("Italian Cuisine", "French Cuisine", "Middle-Eastern Cuisine")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, I ->
            // Determine which item was clicked
            val clickedItem = names[i]

            // Start the corresponding activity based on the clicked item
            when (clickedItem) {
                "Italian Cuisine" -> startActivity(Intent(this, ItalianCuisineActivity::class.java))
                else -> Toast.makeText(this, "No page for this cuisine yet!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
