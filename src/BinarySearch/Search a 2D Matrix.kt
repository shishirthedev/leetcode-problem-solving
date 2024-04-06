package BinarySearch

fun main() {
    val r= findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3,4))
    print(r)
}

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    for (arr in matrix) {
        if (arr.contains(target)) return true
    }
    return false
}

