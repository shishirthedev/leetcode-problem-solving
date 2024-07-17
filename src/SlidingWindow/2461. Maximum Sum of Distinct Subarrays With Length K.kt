package SlidingWindow


fun main() {
    var r = maxSlidingWindow(intArrayOf(1, 5, 4, 2, 9, 9, 9), 3)
    println(r)
}

fun maximumSubarraySum(nums: IntArray, k: Int): Long {
    val cnt = HashMap<Int, Int>(k)
    var windowSum: Long = 0
    for (i in 0 until k) {
        cnt[nums[i]] = cnt.getOrDefault(nums[i], 0) + 1
        windowSum += nums[i]
    }

    var ans = if (cnt.size == k) windowSum else 0
    var start = 0
    var end = k

    while (end < nums.size) {
        cnt[nums[end]] = cnt.getOrDefault(nums[end], 0) + 1

        if (cnt.getOrDefault(nums[start], 0) == 1) {
            cnt.remove(nums[start])
        } else {
            cnt[nums[start]] = cnt[nums[start]]!! - 1
        }

        windowSum += nums[end] - nums[start]
        if (cnt.size == k) ans = maxOf(ans, windowSum)

        start++
        end++
    }
    return ans
}


// way 2 more optimized
fun maximumSubarraySum2(nums: IntArray, k: Int): Long {
    val set = HashSet<Int>()
    var maxSum: Long = 0
    var windowSum: Long = 0
    var windowStart = 0

    for (windowEnd in nums.indices) {
        val currentValue = nums[windowEnd]

        while (set.contains(currentValue) || set.size == k) {
            set.remove(nums[windowStart])
            windowSum -= nums[windowStart].toLong() /
            windowStart++
        }

        windowSum += currentValue.toLong()
        set.add(currentValue)

        if (set.size == k) {
            maxSum = Math.max(maxSum, windowSum)
        }
    }
    return maxSum
}