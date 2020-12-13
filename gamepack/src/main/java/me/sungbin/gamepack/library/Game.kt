package me.sungbin.gamepack.library

import me.sungbin.gamepack.library.game.chosung.ChosungData
import me.sungbin.gamepack.library.game.chosung.ChosungType
import me.sungbin.gamepack.library.util.HangulParser
import me.sungbin.gamepack.library.util.Util.anyArrayOf
import kotlin.random.Random

object Game {

    fun chosungQuiz(type: ChosungType): ArrayList<Any> {
        val words = ChosungData.getData(type).split("\n")
        val index = Random.nextInt(words.size - 1)
        val word = words[index].trim()
        val chosungs = ArrayList<String>()
        for (element in word) { // Char
            chosungs.add(HangulParser.disassemble(element)[0])
        }
        return anyArrayOf(type.name, word, chosungs)
    }

    fun chosungQuiz() = chosungQuiz(getRandomChosungType())

    private fun getRandomChosungType() = arrayOf(
        ChosungType.FOOD(),
        ChosungType.ARTIST(),
        ChosungType.COUNTRY(),
        ChosungType.LOCATION(),
        ChosungType.MATH(),
        ChosungType.SPORT(),
        ChosungType.BRAND(),
        ChosungType.ELEMENT(),
        ChosungType.POCKETMON(),
        ChosungType.CHEMISTRY(),
        ChosungType.WORDS()
    ).random()

}