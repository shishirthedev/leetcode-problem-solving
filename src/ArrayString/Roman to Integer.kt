package ArrayString

fun main() {
    print(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val arr = IntArray(s.length)
    var i = -1
    for (char in s) {
        arr[++i] = when (char) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
    var result = arr[arr.size - 1]
    for (j in 0 until arr.size - 1) {
        if (arr[j + 1] > arr[j]) {
            result -= arr[j]
        } else {
            result += arr[j]
        }
    }
    return result
}