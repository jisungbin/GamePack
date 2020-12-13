package me.sungbin.gamepack.library.game.chosung

sealed class ChosungType(val name: String) {

    class FOOD : ChosungType("간식")
    class ARTIST : ChosungType("국내 가수")
    class COUNTRY : ChosungType("국가")
    class LOCATION : ChosungType("도시")
    class MATH : ChosungType("수학")
    class SPORT : ChosungType("스포츠")
    class BRAND : ChosungType("브랜드")
    class ELEMENT : ChosungType("원소")
    class POCKETMON : ChosungType("포켓몬")
    class CHEMISTRY : ChosungType("화학")
    class WORDS : ChosungType("단어")

}