package me.sungbin.gamepack.library.game.wordchain

import android.content.Context
import me.sungbin.gamepack.library.util.Util.readAssets


internal object Word {

    lateinit var context: Context
    private lateinit var WORDS: String

    val LIST: String
        get() {
            if (!::WORDS.isInitialized) {
                WORDS = readAssets(context, "words.txt")
            }
            return WORDS
        }

}