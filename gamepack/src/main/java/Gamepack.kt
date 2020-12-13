package me.sungbin.gamepack.library

import android.app.Application
import me.sungbin.gamepack.library.game.wordchain.Word

/**
 * Created by SungBin on 2020-12-14.
 */

class Gamepack : Application() {

    override fun onCreate() {
        super.onCreate()
        Word.context = applicationContext
    }

}