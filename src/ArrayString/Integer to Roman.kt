package ArrayString


fun main() {
    print(intToRoman(4))
}

fun intToRoman(num: Int): String {
    val romanValues = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val romanSymbols = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    var number = num
    val roman: StringBuilder = StringBuilder()
    var i = 0
    while (number != 0) {
        while (number >= romanValues[i]) {
            number -= romanValues[i]
            roman.append(romanSymbols[i])
        }
        i++
    }
    return roman.toString()
}