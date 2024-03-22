package ArrayString

fun main() {
    println(lengthOfLastWord("uffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    val trimmedStr = s.replace("\\s+".toRegex(), " ").trim()
    val splitStr = trimmedStr.split(" ").last().toString()
    return splitStr.length
}