package me.sungbin.gamepack

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import me.sungbin.gamepack.library.Game
import me.sungbin.gamepack.library.game.chosung.ChosungType


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_refresh).setOnClickListener {
            val value = Game.chosungQuiz(ChosungType.WORDS())
            log(value[0], value[1], value[2])
        }

    }

    private fun <T> log(vararg value: T) {
        for ((index, element) in value.withIndex()) {
            Log.w("Game Logger", "[$index] $element")
        }
    }

}