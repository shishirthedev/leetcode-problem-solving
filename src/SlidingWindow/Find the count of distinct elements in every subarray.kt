package SlidingWindow

fun main() {
    val r = findDistinctCount(intArrayOf(1, 2, 2), 3)
}

fun findDistinctCount(nums: IntArray, k: Int): IntArray {
    var start = 0
    var end = k
    val counts: HashMap<Int, Int> = HashMap<Int, Int>()
    val ans = ArrayList<Int>()

    for (i in 0 until k) {
        counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1)
    }

    while (end < nums.size) {
        ans.add(counts.size)
        // remove start
        counts.put(nums[start], counts.getValue(nums[start]) - 1)
        if (counts.getValue(nums[start]) == 0) {
            counts.remove(nums[start])
        }

        counts.put(nums[end], counts.getOrDefault(nums[end], 0) + 1)
        start++
        end++
    }
    return ans.toIntArray()
}