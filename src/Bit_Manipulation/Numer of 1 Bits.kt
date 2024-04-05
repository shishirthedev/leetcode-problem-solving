package Bit_Manipulation

fun main() {
    val r = hammingWeight(128)
    print(r)
}

fun hammingWeight(n: Int): Int {
    val binaryStr = n.toString(radix = 2).toCharArray()
    return binaryStr.filter { it == '1' }.size
}