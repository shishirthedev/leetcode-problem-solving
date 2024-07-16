package SlidingWindow

import kotlin.math.max

fun longestUniqueSubsttr(s: String): Int {
    var result = 0
    val set: HashSet<Char> = HashSet()
    var startIndex = 0
    var endIndex = 0

    while (endIndex < s.length) {
        val char = s[endIndex]
        if (set.contains(char)) {
            set.remove(s[startIndex])
            startIndex++
        } else {
            set.add(char)
            result = max(result, set.size)
            endIndex++
        }
    }
    return result
}

// https://www.youtube.com/watch?v=RqxIXM6eyiY