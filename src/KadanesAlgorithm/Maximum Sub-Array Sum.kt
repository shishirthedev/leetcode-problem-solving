package KadanesAlgorithm

fun maxSubArray(nums: IntArray): Int {
    var maxSoFar = nums[0]
    var currentMax = nums[0]
    for(i in 1 until nums.size){
        currentMax = maxOf(nums[i], nums[i] + currentMax)
        maxSoFar = maxOf(maxSoFar, currentMax)
    }
    return maxSoFar
}