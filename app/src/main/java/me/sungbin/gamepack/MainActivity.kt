package me.sungbin.gamepack

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import me.sungbin.gamepack.library.game.wordchain.Word

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Word.init(applicationContext, "DCBDED09F8C5E95018DF72136030D9E6")
        log(Word.getWordMean("안녕").toString())
    }

    private fun log(message: String) {
        Log.w("AAAA", message)
    }

}