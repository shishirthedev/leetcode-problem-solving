package SlidingWindow

import java.util.TreeMap

fun main() {
    var r = getSubarrayBeauty(intArrayOf(-1,-2,-3,-4,-5), 2, 2)
    for(i in r){
        println(i)
    }
}

//-3,1,2,-3,0,-3
// [-3,0,-3,-3,-3]
fun getSubarrayBeauty(nums: IntArray, k: Int, x: Int): IntArray {
    var start = 0
    var end = k
    val ans = mutableListOf<Int>()
    val map: TreeMap<Int, Int> = TreeMap<Int, Int>()
    for (i in 0 until k) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1)
    }
    ans.add(findXthSmallest(map, x))

    while (end < nums.size) {
        map.put(nums[end], map.getOrDefault(nums[end], 0) + 1)
        map.put(nums[start], map.getOrDefault(nums[start], 0) - 1)
        if (map.get(nums[start]) == 0) map.remove(nums[start])
        ans.add(findXthSmallest(map, x))

        start++
        end++
    }
    return ans.toIntArray()
}

fun findXthSmallest(arr: TreeMap<Int, Int>, x: Int): Int {
    var smallest = 0
    for (item in arr) {
        if(item.key < 0){
            smallest += item.value
        }else return 0

        if(smallest >= x) return item.key
    }
    return 0
}
