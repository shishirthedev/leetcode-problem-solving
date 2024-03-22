import java.util.*
import java.util.function.Function


fun main() {
    println(findKthLargest(nums = intArrayOf(3,2,3,1,2,4,5,5,6), k = 4))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    if (strs.size == 1) return strs.first()
    val builder = StringBuilder()
    val sortedStrs = strs.sortedBy { it.length }
    val firstStr = sortedStrs.first()
    for ((index, char) in firstStr.withIndex()) {
        var flag = true
        for (i in 1 until sortedStrs.size) {
            if (sortedStrs[i].get(index) != char) {
                flag = false
            }
        }
        if (flag) builder.append(char)
        else break
    }
    return if (builder.isEmpty()) "" else builder.toString()
}


fun findKthLargest(nums: IntArray, k: Int): Int {
    val sortedNums = nums.sortedDescending()
    return sortedNums[k-1]
}