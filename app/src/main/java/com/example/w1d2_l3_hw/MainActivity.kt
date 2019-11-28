package com.example.w1d2_l3_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.nio.file.Files.size
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.Random


class MainActivity : AppCompatActivity() {
    var arrayFood = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textFood.setText(arrayFood.get(Random().nextInt(arrayFood.size)))
    }


    fun decideFood(view: View) {
        val random = Random()
        textFood.setText(arrayFood.get(random.nextInt(arrayFood.size)))

    }

    fun addFood(view: View) {
        var editTextHello = editTextFood.text.toString()
        arrayFood.add(editTextHello)
        textFood.setText(arrayFood.get(arrayFood.size - 1))
        editTextFood.text.clear()

    }


}
