package Math

fun main() {
    println(trailingZeroes(5))
}

fun trailingZeroes(n: Int): Int {
    return if (n == 0) 0
    else {
        n / 5 + trailingZeroes(n / 5)
    }
}