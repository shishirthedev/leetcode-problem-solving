fun main() {
    println(findThirdMax(intArrayOf(2, 6, 6, 3)))
}

// find max number
fun findLargest(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    for (num in nums) {
        if (num > max) max = num
    }
    return max
}

// find second max number
fun findSecondLargest(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE
    for (num in nums) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num in (secondMax + 1) until max) {
            secondMax = num
        }
    }
    return if (secondMax != Int.MIN_VALUE) secondMax else -1
}

// find third max number
fun findThirdMax(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE
    var thirdMax = Int.MIN_VALUE
    for (num in nums) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num in (secondMax + 1) until max) {
            thirdMax = secondMax
            secondMax = num
        } else if (num in (thirdMax + 1) until secondMax) {
            thirdMax = num
        }
    }
    return thirdMax
}