fun main() {
    removeDuplicates3(nums = intArrayOf(-3,-1,0,0,0,3,3))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    val expectedNums = arrayListOf<Int>()
    for (item in nums) {
        if (item != `val`) {
            expectedNums.add(item)
        }
    }
    for (i in 0 until expectedNums.size) {
        nums[i] = expectedNums[i]
    }
    return expectedNums.size
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

fun removeDuplicates3(nums: IntArray): Int {
    val expectedNums = linkedMapOf<Int, Int>()
    for (item in nums) {
        if (expectedNums.containsKey(item).not()) {
            expectedNums.put(item, 1)
        }else if (expectedNums.getValue(item) == 1) {
            expectedNums.put(item, 2)
        }
    }
    var k = -1
    var result = 0
    for ((number, count) in expectedNums) {
        for (i in 0 until count) {
            print("$number ")
            nums[++k] = number
            result ++
        }
    }
    return result
}

