package Heap

import java.util.PriorityQueue

fun main() {
    val r = findKthLargest3(nums = intArrayOf(1, 2, 3, 4, 5), k = 3)
    println(r)
}


// Way -1: by removing largest
fun findKthLargest(nums: IntArray, k: Int): Int {
    val numbers = nums.toMutableList()
    for (i in 0 until k - 1) numbers.remove(numbers.max())
    return numbers.max()
}

// way -2 with min heap: best way
fun findKthLargest2(nums: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>()
    for (element in nums) {
        pq.offer(element)
        if (pq.size > k) pq.poll()
    }
    return pq.peek()
}

// way -3 with max heap
fun findKthLargest3(nums: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>(compareByDescending { it })
    nums.forEach { pq.offer(it) }
    var counter = k
    var ans = 0
    while (counter > 0) {
        ans = pq.peek()
        pq.poll()
        counter--
    }
    return ans
}