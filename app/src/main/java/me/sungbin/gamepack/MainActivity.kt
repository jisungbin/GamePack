package me.sungbin.gamepack

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import me.sungbin.gamepack.library.Game
import me.sungbin.gamepack.library.game.chosung.ChosungType
import me.sungbin.gamepack.library.game.wordchain.Word

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Word.init(applicationContext)
        Word.loadUseableWord("안녕")

        findViewById<Button>(R.id.btn_refresh).setOnClickListener {
            val value = Game.chosungQuiz(ChosungType.WORDS())
            // log(value[0], value[1], value[2])
        }

    }

}