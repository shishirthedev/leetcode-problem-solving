package Hashmap

fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,0,1,1), 1))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    for (i in nums.indices) {
        val iThValue = nums[i]
        for (j in (i + 1) until nums.size) {
            val jThValue = nums[j]
            if (iThValue == jThValue && Math.abs(i - j) <= k) return true
        }
    }
    return false
}