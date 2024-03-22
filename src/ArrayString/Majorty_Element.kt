package ArrayString

fun main() {
    val r = majorityElement(intArrayOf(2,2,1,1,1,2,2))
    println(r)
}

fun majorityElement(nums: IntArray): Int {
    val map: HashMap<Int, Int> = hashMapOf()
    for (num in nums) {
        if (map.containsKey(num)) {
            map.put(num, map.getValue(num) + 1)
        } else map.put(num, 1)
    }
    var result = 0
    for (item in map) {
        if (item.value > (nums.size / 2)) {
            result = item.key
            break
        }
    }
    return result
}
