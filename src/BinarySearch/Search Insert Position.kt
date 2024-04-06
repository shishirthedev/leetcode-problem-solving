package BinarySearch

fun main() {
    print(searchInsert( intArrayOf(1,3,6), 5))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    val index = nums.indexOf(target)
    if (index != -1) return index
    return nums.plus(target).sorted().indexOf(target)
}