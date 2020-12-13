package me.sungbin.gamepack.library.util

import android.content.Context


/**
 * Created by SungBin on 2020-12-13.
 */

internal object Util {

    fun anyArrayOf(vararg value: Any) =  ArrayList<Any>().apply { addAll(value) }

    fun readAssets(context: Context, name: String): String {
        val assetManager = context.assets
        val inputStream= assetManager.open(name)
        return inputStream.bufferedReader().use { it.readText() }
    }
}