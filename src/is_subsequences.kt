fun main() {
    //printAllSubsequences("abc")
    // println(isSub(s = "abc", t = "ahbgdc"))
}


// print all subsequences
fun printAllSubsequences(str: String) {
    val n = str.length
    val totalSubsequences = (1 shl n) // Total number of subsequences is 2^n
    for (i in 0 until totalSubsequences) {
        val subsequence = StringBuilder()
        for (j in 0 until n) {
            // Check if jth bit in i is set, if it is, append corresponding character to subsequence
            if ((i and (1 shl j)) != 0) {
                subsequence.append(str[j])
            }
        }
        if (subsequence.isEmpty().not()) println(subsequence)
    }
}

// optimized to check is subsequence or not
fun isSub(s: String, t: String): Boolean {
    var i: Int = 0
    var j: Int = 0
    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++
            j++
        } else {
            j++
        }
    }
    return i == s.length
}