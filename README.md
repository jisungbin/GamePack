# GamePack [![](https://jitpack.io/v/sungbin5304/GamePack.svg)](https://jitpack.io/#sungbin5304/GamePack)
android gamepack library

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
## ChosungQuiz
```kotlin
# Specific Type
Game.chosungQuiz(type: ChosungType): ArrayList<Any>

# Random Type
Game.chosungQuiz(): ArrayList<Any>
```

### Result `index`
1. quiz type name
2. answer
3. chosung

### `ChosungType`
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

// todo
