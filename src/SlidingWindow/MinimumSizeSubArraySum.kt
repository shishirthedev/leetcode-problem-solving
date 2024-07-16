package SlidingWindow


fun minSubArrLength(
    target: Int,
    nums: IntArray
): Int {
    var minLenWindow = Int.MAX_VALUE
    var startIndex = 0
    var endIndex = 0

    var sum = 0
    while (endIndex < nums.size) {
        sum += nums[endIndex]
        endIndex++
        while (sum >= target) {
            val currentWindowSize = endIndex - startIndex
            minLenWindow = minOf(minLenWindow, currentWindowSize)
            sum -= nums[startIndex]
            startIndex++
        }
    }
    return if (minLenWindow == Int.MAX_VALUE) 0 else minLenWindow
}






