package SlidingWindow

import ListNode

fun main() {
    // val r = findDistinctCount(intArrayOf(1, 2, 2), 3)
    val head = ListNode(1).apply {
        next = ListNode(-3).apply {
            next = ListNode(2)
        }
    }
    var str: ListNode? = head
    var arr = ArrayList<Int>()
    while (str != null) {
        arr.add(str.`val`)
        str = str.next
    }
    var sortedArr = arr.sorted()
    var preNode = ListNode(-1)
    sortedArr.forEach {
        println(it)
        preNode.next = ListNode(it)
    }
    var ptr = preNode.next
    while (ptr != null){
      //  println(ptr.`val`)
        ptr = ptr.next
    }
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

fun sortList(head: ListNode?): ListNode? {
    val arr = ArrayList<Int>()
    var ptr = head
    while (ptr?.next != null) {
        arr.add(ptr.`val`)
        ptr = ptr.next
    }
    arr.sorted()
    for (item in arr) println(item)
    val dummyNode = ListNode(-1)
    for (item in arr) {
        dummyNode.next = ListNode(item)
    }
    return dummyNode
}