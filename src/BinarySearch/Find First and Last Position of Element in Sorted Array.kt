package BinarySearch

fun main() {
   val r =  searchRange(intArrayOf(5,7,7,8,8,10),8)
    print(r)

}

fun searchRange(nums: IntArray, target: Int): IntArray {
    val fIndex = nums.indexOf(target)
    val lIndex = nums.lastIndexOf(target)
    return intArrayOf(fIndex, lIndex)
}