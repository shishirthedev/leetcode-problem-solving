package SlidingWindow

fun main() {
    var r = countGoodSubstrings("xyzzaz")
    println(r)
}
fun countGoodSubstrings(s: String): Int {
    if(s.length < 3) return 0
    var start = 0
    var end = 3
    val map = HashMap<Char, Int>()
    var goodStringCount = 0
    for (i in 0 until end) {
        map.put(s[i], map.getOrDefault(s[i], 0) + 1)
    }
    if (map.size == 3) goodStringCount++
    while (end < s.length) {
        val startCharCount = map.getOrDefault(s[start], 0)
        if(startCharCount <= 1) map.remove(s[start])
        else map.put(s[start], startCharCount - 1)
        map.put(s[end], map.getOrDefault(s[end], 0) + 1)
        if (map.size == 3) goodStringCount++
        start++
        end++
    }
    return goodStringCount
}