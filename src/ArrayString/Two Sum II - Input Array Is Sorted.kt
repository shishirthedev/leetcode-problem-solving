package ArrayString

fun main() {
    val r = twoSum(numbers = intArrayOf(-1,0), -1)
    r.forEach { print("$it ") }
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val n = numbers.size
    for (i in numbers.indices) {
        for (j in (i + 1) until n) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i+1, j+1)
            }
        }
    }
    return intArrayOf()
}