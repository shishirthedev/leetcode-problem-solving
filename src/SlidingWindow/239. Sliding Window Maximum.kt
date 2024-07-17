package SlidingWindow

import java.util.PriorityQueue

fun main() {
    val r = maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3)
    println(r.first())
}

fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    var start = 0
    var end = k
    val pq = PriorityQueue<Int>(compareByDescending { it })
    val ans = ArrayList<Int>()
    for (i in 0 until k) pq.offer(nums[i])
    ans.add(pq.peek())
    while (end < nums.size) {
        pq.remove(nums[start])
        pq.offer(nums[end])
        ans.add(pq.peek())
        start++
        end++
    }
    return ans.toIntArray()
}