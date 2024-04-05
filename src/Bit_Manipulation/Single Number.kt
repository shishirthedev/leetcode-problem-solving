package Bit_Manipulation

fun main() {
    print(singleNumber(intArrayOf(2,2,1)))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (num in nums) { result = result xor num }
    return result
}