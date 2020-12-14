package me.sungbin.gamepack.library.util

import android.content.Context
import android.util.Log
import java.io.InputStreamReader
import java.net.URL


/**
 * Created by SungBin on 2020-12-13.
 */

internal object Util {

    fun anyArrayOf(vararg value: Any) = ArrayList<Any>().apply { addAll(value) }

    fun readAssets(context: Context, name: String): String {
        val assetManager = context.assets
        val inputStream = assetManager.open(name)
        return inputStream.bufferedReader().use { it.readText() }
    }

    fun <T> log(vararg value: T) {
        for ((index, element) in value.withIndex()) {
            Log.w("Game Logger", "[$index] $element")
        }
    }

    @Throws(Exception::class)
    fun getHtml(address: String, userAgent: String? = null): String? {
        return try {
            val url = URL(address)
            val con = url.openConnection()
            con?.let {
                con.connectTimeout = 5000
                if (userAgent != null) con.addRequestProperty("User-Agent", userAgent)
                con.useCaches = false
                val isr = InputStreamReader(con.getInputStream())
                return isr.buffered(1024 * 1024).use { it.readText() }
            }
            null
        } catch (exception: Exception) {
            throw exception
        }
    }

}