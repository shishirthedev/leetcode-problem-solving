fun main() {
    val r = reverseWords("a good   example")
    println(r)
}

fun reverseWords(s: String): String {
    val trimmedStr = s.replace("\\s+".toRegex(), " ").trim()
    val splitStr = trimmedStr.split(" ")
    val strBuilder = StringBuilder()
    for (index in (splitStr.size - 1).downTo(0)) {
        strBuilder.append(splitStr[index].trim())
        if (index != 0) strBuilder.append(" ")
    }
    return strBuilder.toString()
}