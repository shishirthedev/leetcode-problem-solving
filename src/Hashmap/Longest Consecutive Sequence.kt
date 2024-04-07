package Hashmap

import java.util.*

fun main() {
    val r = longestConsecutive2(intArrayOf(-1, 0, 0))
    print(r)
}

fun longestConsecutive(nums: IntArray): Int {
    if (nums.size < 2) return nums.size
    val numsSorted = nums.sorted()
    var max = 1
    var index = 0
    var count = 1
    while (index < numsSorted.size - 1) {
        val indexValue = numsSorted[index]
        val indexValuePlus1 = numsSorted[index] + 1
        val nextValue = numsSorted[index + 1]
        index++
        when {

            indexValue == nextValue && index != numsSorted.size - 1 -> continue
            indexValuePlus1 == nextValue -> count++
            else -> {
                max = maxOf(count, max)
                count = 1
            }
        }
        if (index == numsSorted.size - 1) {
            max = maxOf(max, count)
            break
        }
    }
    return max
}


// 2,3,4,7,1,0,0
// 0,0,1,2,3,4,7
// arr = 0,1,2,3,4,7
fun longestConsecutive2(nums: IntArray): Int {
    val n = nums.size
    if (n < 2) return n
    Arrays.sort(nums)

    var ans = 0
    var count = 1

    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) continue
        else if (nums[i] == nums[i - 1] + 1) {
            count++
            ans = maxOf(ans, count)
        } else count = 1
    }
    return ans
}