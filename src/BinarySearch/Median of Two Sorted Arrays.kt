package BinarySearch

fun main() {
    val r= findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3,4))
    print(r)
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val arrMerged = (nums1 + nums2).sorted()
    val size = arrMerged.size
    val mid = size /2
    val median: Double =  if (size % 2 == 0) {
        ((arrMerged[mid -1] + arrMerged[mid]).toDouble())/ 2
    } else {
        arrMerged[mid].toDouble()
    }
    return median
}