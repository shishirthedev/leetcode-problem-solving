package Stack

import java.util.*

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    println(minStack.getMin())
    minStack.pop()
    println(minStack.top())
    println(minStack.getMin())
}

class MinStack() {

    val stk = Stack<Int>()

    fun push(`val`: Int) {
        stk.push(`val`)
    }

    fun pop() {
        stk.pop()
    }

    fun top(): Int {
        return stk.peek()
    }

    fun getMin(): Int {
        return stk.min()
    }

}