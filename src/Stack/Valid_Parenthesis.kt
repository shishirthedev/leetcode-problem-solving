package Stack

import java.util.*

fun main() {
    // println(isEven(3))
    // printSubsequences("abc")
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (c in s) {
        when {
            (c == '(' || c == '{' || c == '[') -> stack.push(c)
            else -> {
                if (stack.isEmpty()) return false
                val last = stack.pop()
                val isValid = (last == '(' && c == ')') || (last == '{' && c == '}') || (last == '[' && c == ']')
                if (isValid.not()) return false
            }
        }
    }
    return stack.isEmpty()
}

