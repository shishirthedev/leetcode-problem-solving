package BinarySearch

fun main() {
    print(search(intArrayOf(4,5,6,7,0,1,2), 3))
}

fun search(nums: IntArray, target: Int): Int {
    return nums.indexOf(target)
}