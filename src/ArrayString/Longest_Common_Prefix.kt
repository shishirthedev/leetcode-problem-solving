package ArrayString
fun main() {

}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    if (strs.size == 1) return strs.first()
    val builder = StringBuilder()
    val sortedStrs = strs.sortedBy { it.length }
    val firstStr = sortedStrs.first()
    for ((index, char) in firstStr.withIndex()) {
        var flag = true
        for (i in 1 until sortedStrs.size) {
            if (sortedStrs[i].get(index) != char) {
                flag = false
            }
        }
        if (flag) builder.append(char)
        else break
    }
    return if (builder.isEmpty()) "" else builder.toString()
}