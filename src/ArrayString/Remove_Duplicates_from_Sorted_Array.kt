package ArrayString

fun main() {
    println(removeDuplicates(nums = intArrayOf(-3, -1, 0, 0, 0, 3, 3)))
}

fun removeDuplicates(nums: IntArray): Int {
    val expectedNums = arrayListOf<Int>()
    for (item in nums) {
        if (expectedNums.contains(item).not()) {
            expectedNums.add(item)
        }
    }
    for (i in 0 until expectedNums.size) {
        nums[i] = expectedNums[i]
    }
    return expectedNums.size
}