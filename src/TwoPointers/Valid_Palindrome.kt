package TwoPointers

fun main() {
    // println(isPalindrome("race a car"))
    //printAllSubsequences("abc")
    print(isPalindromeNumber(121))
}

fun isPalindrome(s: String): Boolean {
    val fs = s.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
    val rs = fs.reversed()
    return fs == rs
}

// 123
// 12  3
// 1   32
fun isPalindromeNumber(num: Int): Boolean {
    var mNum = num
    var rNum = 0
    while (mNum > 0) {
        val r = mNum % 10
        rNum = (rNum * 10) + r
        mNum /= 10
    }
    return (rNum == num)
}