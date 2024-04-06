package BinarySearch

fun main() {
    print(findPeakElement(intArrayOf(1, 2, 4, 3)))
}

fun findPeakElement(nums: IntArray): Int {
    val n = nums.size
    if (n == 1) return 0
    for (i in 0 until n) {
        val num = nums[i]
        if (i == 0) {
            if (num > nums[i + 1]) return i
        } else if (i == n - 1) {
            if (num > nums[i - 1]) return i
        } else {
            if (num > nums[i - 1] && num > nums[i + 1]) return i
        }
    }
    return -1
}