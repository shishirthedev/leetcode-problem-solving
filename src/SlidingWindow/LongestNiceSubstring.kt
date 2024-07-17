package SlidingWindow

fun main() {
  //  allSubString("abc")
    var r = longestNiceSubstring("YazaAay")
    println(r)
}

fun allSubString(s: String) {
    for (i in s.indices) {
        for (j in (i + 1)..s.length) {
            val substring = s.substring(i, j)
            println(substring)
        }
    }
}


fun longestNiceSubstring(s: String): String {
    if (s.isEmpty()) return ""
    var longestNice = ""
    for (i in s.indices) {
        for (j in i + 1..s.length) {
            val substring = s.substring(i, j)
            if (isNiceString(substring) && substring.length > longestNice.length) {
                longestNice = substring
            }
        }
    }
    return longestNice
}

fun isNiceString(string: String): Boolean {
    for (char in string) {
        if (char.isLowerCase() && char.uppercaseChar() !in string) return false
        if (char.isUpperCase() && char.lowercaseChar() !in string) return false
    }
    return true
}