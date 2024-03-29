package ArrayString

import java.util.*


fun main() {
      println(triplet(intArrayOf(-1,0,1,2,-1,-4)))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    if (nums.size < 3) return listOf()
    if (nums.size == 3) {
        if ((nums[0] + nums[1] + nums[2]) != 0) return listOf()
        return listOf(listOf(nums[0], nums[1], nums[2]))
    }
    val set = hashSetOf<MutableList<Int>>()
    val size = nums.size
    for (i in nums.indices) {
        for (j in (i + 1) until size) {
            for (k in (j + 1) until size) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    set.add(listOf(nums[i], nums[j], nums[k]).sorted().toMutableList())
                }
            }
        }
    }
    val result: MutableList<MutableList<Int>> = mutableListOf()
    if(set.isEmpty()) return listOf()
    else{
        set.forEach{ result.add(it)}
    }
    return result
}

fun triplet(arr: IntArray): List<List<Int>> {
    val ans: MutableList<List<Int>> = ArrayList()
    Arrays.sort(arr)
    for (i in arr.indices) {
        if (i > 0 && arr[i] == arr[i - 1]) continue
        var j = i + 1
        var k = arr.size - 1
        while (j < k) {
            val sum = arr[i] + arr[j] + arr[k]
            if (sum < 0) {
                j++
            } else if (sum > 0) {
                k--
            } else {
                val temp: MutableList<Int> = ArrayList()
                temp.add(arr[i])
                temp.add(arr[j])
                temp.add(arr[k])
                ans.add(temp)
                j++
                k--
                while (j < k && arr[j] == arr[j - 1]) j++
                while (j < k && arr[k] == arr[k + 1]) k--
            }
        }
    }
    return ans
}