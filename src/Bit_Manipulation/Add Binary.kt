package Bit_Manipulation

fun main() {
    val r = addBinary2("1010", "1011")
    print(r)
}

fun addBinary(a: String, b: String): String {
    val aInt = a.toInt(radix = 2)
    val bInt = b.toInt(radix = 2)
    return (aInt + bInt).toString(radix = 2)
}

fun addBinary2(a: String, b: String): String {
    val sb = StringBuilder()
    var carry = 0
    var i: Int = a.length - 1
    var j: Int = b.length - 1

    while (i >= 0 || j >= 0 || carry > 0) {
        var sum = carry
        if (i >= 0) {
            sum += a[i] - '0'
            i--
        }
        if (j >= 0) {
            sum += b[j] - '0'
            j--
        }
        sb.append(sum % 2)
        carry = sum / 2
    }
    return sb.reverse().toString()
}