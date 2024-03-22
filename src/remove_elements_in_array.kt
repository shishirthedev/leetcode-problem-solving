fun main() {
    val r = removeElement(intArrayOf(0,1,2,2,3,0,4,2),2)
    println(r)
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    val map: HashMap<Int, Int> = hashMapOf()
    for (num in nums) {
        if (map.containsKey(num)) {
            map.put(num, map.getValue(num) + 1)
        } else map.put(num, 1)
    }
    var result = 0
    for (item in map) {
        if (item.key != `val`) {
            result += item.value
        }
    }
    return result
}
