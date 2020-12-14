# GamePack [![](https://jitpack.io/v/sungbin5304/GamePack.svg)](https://jitpack.io/#sungbin5304/GamePack) [![time tracker](https://wakatime.com/badge/github/sungbin5304/GamePack.svg)](https://wakatime.com/badge/github/sungbin5304/GamePack)
android korean gamepack library

-----

# Download
```Gradle
repositories {
  maven { 
    url 'https://jitpack.io' 
  }
}

dependencies {
  implementation 'com.github.sungbin5304:GamePack:{version}'
}
```

# Usage
## Init
```kotlin
# If you use word-mean searching method, must input `apiKey`
Game.init(context: Context, apiKey: String = "")
```

### apiKey
You can get `apiKey` from [here](https://stdict.korean.go.kr/openapi/openApiInfo.do).

## ChosungQuiz
```kotlin
# Specific Type
Game.chosungQuiz(type: ChosungType): ArrayList<Any>

# Random Type
Game.chosungQuiz(): ArrayList<Any>
```

### Result `index`
1. quiz type name // `string`
2. answer // `string`
3. chosung // `ArrayList<String>`

### ChosungType
1. `FOOD` : 음식
2. `ARTIST` : 국내 가수
3. `COUNTRY` : 국가
4. `LOCATION` : 도시
5. `MATH` : 수학
6. `SPORT` : 스포츠
7. `BRAND` : 브랜드
8. `ELEMENT` : 원소
9. `POCKETMIN` : 포켓몬
10. `CHEMISTRY` : 화학
11. `WORDS` : 단어

## WordChain
```kotlin
Word.checkDuum(fullWord: String): String?
Word.loadUseableWord(fullWord: String): String? 
Word.clearUseWord() 
Word.isRealWord(fullWord: String): Boolean
Word.isUseableWord(fullWord: String): Boolean
Word.useWord(fullWord: String)
Word.checkIsUsed(fullWord: String): Boolean

@Throws(Exception::class) # This method is require `apiKey` at `Word.init(//)`.
Word.getWordMean(fullWord: String): String?
```

-----

# License
`GamePack` license is under the [MIT](https://github.com/sungbin5304/GamePack/blob/master/LICENSE) License.

# Happy Coding :)
