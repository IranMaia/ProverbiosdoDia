package com.example.provrbiosdodia

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton: Button = findViewById(R.id.button)
        playButton.setOnClickListener {

            raffleProverbs()

        }
        raffleProverbs()
    }

    private fun raffleProverbs() {
        val proverbs = Proverbs(6)
        val drawnProverbs = proverbs.proverbsRamdon()
        val proverbsImage: TextView = findViewById(R.id.textView)
        proverbsImage.text = drawnProverbs.toString()

        val drawableResource = when (drawnProverbs){

            1 -> R.string.provérbios1_1
            2 -> R.string.provérbios2_1__5
            3 -> R.string.provérbios3___2
            4 -> R.string.provérbios4_1__2
            5 -> R.string.provérbios5_1__6
            6 -> R.string.proverbios6_1__5
            7 -> R.string.proverbios7_1__3
            8 -> R.string.proverbios8_1__4
            9 -> R.string.proverbios9_1__6
            10 -> R.array.proverbios1_1teste

            else -> R.string.proverbios_salomao


        }

        proverbsImage.setText(drawableResource)

    }
}


class Proverbs(val numProverbs: Int) {

    fun proverbsRamdon(): Int {
        return (1..numProverbs).random()
    }
}