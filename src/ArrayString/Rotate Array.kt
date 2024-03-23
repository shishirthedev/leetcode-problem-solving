package ArrayString

fun main() {
    rotate2(nums = intArrayOf(1,2), k = 9)
}

fun rotate(nums: IntArray, k: Int): Unit {
    for (i in 1..k) {
        var mask: Int? = null
        for (index in nums.indices) {
            if (mask == null) {
                mask = nums[index]
                nums[index] = nums[nums.size - 1]
            } else {
                val temp = mask
                mask = nums[index]
                nums[index] = temp
            }
        }
    }
}


// Optimized Way ================================
fun rev(nums: IntArray, low: Int, high: Int) {
    var lowIndex = low
    var highIndex = high
    while (lowIndex < highIndex) {
        val temp = nums[lowIndex]
        nums[lowIndex] = nums[highIndex]
        nums[highIndex] = temp
        lowIndex++
        highIndex--
    }
}

fun rotate2(nums: IntArray, k: Int): Unit {
    val n = nums.size
    val step = k % n
    rev(nums, 0, n - step - 1)
    rev(nums, n - step, n - 1)
    rev(nums, 0, n - 1)
    nums.forEach { print("$it ") }
}