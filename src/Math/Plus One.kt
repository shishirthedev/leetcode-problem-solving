package Math

fun main() {
//    val r = plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0))
//    val r = plusOne(intArrayOf(9, 9, 9))
//    r.forEach { print("$it ") }
    println(trailingZeroes(30))
}

fun plusOne(digits: IntArray): IntArray {
    for (i in (digits.size - 1) downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        } else {
            digits[i] = 0
        }
    }
    val ans = IntArray(digits.size + 1)
    ans[0] = 1
    return ans
}

//fun trailingZeroes(n: Int): Int {
//    var factNumber: Long = 1
//    for (i in 1..n) {
//        factNumber *= i
//    }
//    var zeroCount = 0
//    println(factNumber)
//    val charArr = factNumber.toString().toCharArray()
//    for(i in (charArr.size - 1) downTo 0){
//        if(charArr[i] == '0') zeroCount++
//        else break
//    }
//    return zeroCount
//}