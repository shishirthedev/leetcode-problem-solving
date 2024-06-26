package ArrayString

fun main() {
    Solution().merge2(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
}

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var k = m + n - 1
        var i = m - 1
        var j = n - 1
        while (k >= 0) {
            nums1[k--] = if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[i--]
            } else {
                nums2[j--]
            }
        }
    }

    fun merge2(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1
        while (j >= 0) {
            nums1[k--] = if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[i--]
            } else {
                nums2[j--]
            }
        }
        nums1.forEach { print(it) }
    }
}