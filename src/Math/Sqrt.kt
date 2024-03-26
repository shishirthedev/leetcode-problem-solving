package Math

fun main() {
   // println(mySqrt(2147395599))
   // println(mySqrt(0))
    println(mySqrt(1))
}
// 4
// 1, 2 ,3 ,4
fun mySqrt(x: Int): Int {
    if(x == 0) return 0
    var left = 1
    var right = x
    var ans = 0
    while (left <= right) {
        val mid = left + (right - left) / 2

        if (mid == (x / mid)) return mid
        else if (mid > (x / mid)) {
            right = mid - 1
        } else {
            ans = mid
            left = mid + 1
        }
    }
    return ans
}