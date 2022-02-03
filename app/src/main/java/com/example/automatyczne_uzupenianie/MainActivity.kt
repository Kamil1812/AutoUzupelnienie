package com.example.automatyczne_uzupenianie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.autoTextView)
        val kraje = resources.getStringArray(R.array.Kraje)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, kraje)
            autotextView.setAdapter(adapter)

        val button = findViewById<Button>(R.id.btn)
            if (button!= null) {
                button?.setOnClickListener(View.OnClickListener {
                      // val enteredText =
                      //  getString(R.string.submitted_country) + " " + autotextView.getText() Toast.makeText (this @MainActivity, enteredText, Toast.LENGTH_SHORT).show()

                    })
            }
    }
}