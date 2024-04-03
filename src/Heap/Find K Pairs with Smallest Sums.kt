package Heap

import java.util.PriorityQueue

fun main() {
    val r = kSmallestPairs2(
        nums1 = intArrayOf(1, 7, 11), nums2 = intArrayOf(2, 4, 6), k = 3
    )
    print(r)
}

fun kSmallestPairs(
    nums1: IntArray,
    nums2: IntArray,
    k: Int
): List<List<Int>> {
    val arr: ArrayList<Pair<Int, List<Int>>> = arrayListOf()
    for (num1 in nums1) {
        for (num2 in nums2) {
            arr.add(Pair(first = num1 + num2, listOf(num1, num2)))
        }
    }

    val arrSorted = arr.sortedBy { it.first }
    var i = k
    val result = ArrayList<List<Int>>()
    while (i < k) {
        result.add(arrSorted[i].second)
        i++
    }
    return result
}

// way - 2 optimised with Heap/Priority Queue
fun kSmallestPairs2(
    nums1: IntArray,
    nums2: IntArray,
    k: Int
): List<List<Int>> {
    val pq = PriorityQueue<Pair<Int, List<Int>>>(compareByDescending { it.first })
    for (num1 in nums1) {
        for (num2 in nums2) {
            val sum = num1 + num2
            if (pq.size < k) pq.offer(Pair(first = sum, listOf(num1, num2)))
            else if (pq.peek().first > sum) {
                pq.poll()
                pq.offer(Pair(first = sum, listOf(num1, num2)))
            } else break
        }
    }
    val result: MutableList<List<Int>> = mutableListOf()
    while (pq.isNotEmpty()) {
        result.add(0, pq.poll().second)
    }
    return result
}