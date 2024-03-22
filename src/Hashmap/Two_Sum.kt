package Hashmap

fun main() {
    val r = twoSum(nums = intArrayOf(3,3), target = 6)
    r.forEach { print(it) }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for(j in i+1 until nums.size){
            if(nums[i] + nums[j] == target){
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}