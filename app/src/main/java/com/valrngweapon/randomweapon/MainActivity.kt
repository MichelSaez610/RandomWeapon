package com.valrngweapon.randomweapon

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val randomButton: Button = findViewById(R.id.rngButton)
        val imageDisplay: ImageView = findViewById(R.id.imageRNG)

        imageDisplay.setImageResource(R.drawable.weap_knife)

        randomButton.setOnClickListener {
            var number = getRandomNum()

//            Switch case that shows a different immage depending on the random number generated
            when (number) {
                1 -> imageDisplay.setImageResource(R.drawable.weap_knife)
                2 -> imageDisplay.setImageResource(R.drawable.weap_classic)
                3 -> imageDisplay.setImageResource(R.drawable.weap_shorty)
                4 -> imageDisplay.setImageResource(R.drawable.weap_frenzy)
                5 -> imageDisplay.setImageResource(R.drawable.weap_ghost)
                6 -> imageDisplay.setImageResource(R.drawable.weap_sheriff)
                7 -> imageDisplay.setImageResource(R.drawable.weap_stinger)
                8 -> imageDisplay.setImageResource(R.drawable.weap_spectre)
                9 -> imageDisplay.setImageResource(R.drawable.weap_bucky)
                10 -> imageDisplay.setImageResource(R.drawable.weap_judge)
                11 -> imageDisplay.setImageResource(R.drawable.weap_bulldog)
                12 -> imageDisplay.setImageResource(R.drawable.weap_guardian)
                13 -> imageDisplay.setImageResource(R.drawable.weap_phantom)
                14 -> imageDisplay.setImageResource(R.drawable.weap_vandal)
                15 -> imageDisplay.setImageResource(R.drawable.weap_marshal)
                16 -> imageDisplay.setImageResource(R.drawable.weap_outlaw)
                17 -> imageDisplay.setImageResource(R.drawable.weap_operator)
                18 -> imageDisplay.setImageResource(R.drawable.weap_ares)
                19 -> imageDisplay.setImageResource(R.drawable.weap_odin)
            }
        }

    }

//    Function that returns a random number between 1 and 19.
    private fun getRandomNum(): Int {
        val rngNumber = Random.nextInt(1, 19)
        return rngNumber
    }
}