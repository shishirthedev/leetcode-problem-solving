package SlidingWindow

fun main() {
    val r = maxSum(intArrayOf(1, 4, 2, 10, 2, 3, 1, 0, 20), 4)
    val a = maxAverage(intArrayOf(1, 4, 2, 10, 2, 3, 1, 0, 20), 4)
    println(a)
}




fun maxSum(arr: IntArray, k: Int): Int {
    var maxSum = 0
    for (i in 0 until k) maxSum += arr[i]

    var windowSum = maxSum
    var startIndex = 0
    var endIndex = k

    while (endIndex < arr.size) {
        windowSum = windowSum - arr[startIndex] + arr[endIndex]
        maxSum = maxOf(maxSum, windowSum)
        startIndex++
        endIndex++
    }
    return maxSum
}

fun maxAverage(arr: IntArray, k: Int): Double {
    var maxSum = 0
    for (i in 0 until k) maxSum += arr[i]

    var startIndex = 0
    var endIndex = k
    var windowSum = maxSum
    while (endIndex < arr.size) {
        windowSum += arr[endIndex] - arr[startIndex]
        maxSum = maxOf(maxSum, windowSum)
        startIndex++
        endIndex++
    }
    return maxSum.toDouble() / k
}








