package Hashmap

fun main() {
    print(isHappy(82))
}

fun isHappy(n: Int): Boolean {
    var nCharArr = n.toString().toCharArray()
    val setOfNumber = hashSetOf<Int>()
    while (true) {
        var number = 0
        for (char in nCharArr) {
            val charInInt = char.toString().toInt()
            number += (charInInt * charInInt)
        }
        if (number == 1) return true
        if (setOfNumber.contains(number)) break

        setOfNumber.add(number)
        nCharArr = number.toString().toCharArray()
    }
    return false
}