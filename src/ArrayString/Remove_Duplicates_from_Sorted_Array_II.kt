package ArrayString

fun main() {
    println(removeDuplicates3(nums = intArrayOf(-3,-1,0,0,0,3,3)))
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
            nums[++k] = number
            result ++
        }
    }
    return result
}

