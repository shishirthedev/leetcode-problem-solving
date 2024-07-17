package SlidingWindow

import kotlin.math.max

fun main() {
    val r = maxVowels("abciiidef", 3)
    println(r)
}

fun maxVowels(s: String, k: Int): Int {
    var start = 0
    var end = k
    val setOfVowels = hashSetOf('a', 'e', 'i', 'o', 'u')
    var windowVowels = 0
    for (i in 0 until k) {
        if (setOfVowels.contains(s[i])) windowVowels++
    }
    var maxVowels = windowVowels
    while (end < s.length) {
        if(setOfVowels.contains(s[end])) windowVowels++
        if(setOfVowels.contains(s[start])) windowVowels--
        maxVowels = maxOf(maxVowels, windowVowels)
        start++
        end++
    }
    return maxVowels
}