

fun strStr(haystack: String, needle: String): Int {
    return if (haystack.contains(needle)) {
        haystack.indexOf(needle)
    } else -1
}