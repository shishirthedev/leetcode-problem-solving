package ArrayString

fun main() {
    println(removeDuplicates3(nums = intArrayOf(-3,-1,0,0,0,3,3)))
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