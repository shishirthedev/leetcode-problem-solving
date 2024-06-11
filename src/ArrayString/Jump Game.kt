package ArrayString

import kotlin.math.max

typealias StudentSet = Set<Student>

fun main() {
    // print(canJump(intArrayOf(2, 3, 1, 1, 4)))
    val students: StudentSet = setOf()
}
//
////2,3,1,1,4
//fun canJump(nums: IntArray): Boolean {
//    var i = 0
//    var maxReach = 0
//    while (i < nums.size && i <= maxReach) {
//        maxReach = maxOf(i + nums[i], maxReach)
//        i++
//    }
//    return i == nums.size
//}

val student1 = object {
    val name = "Mr. Shishir"
    val age = 21
    val address = "Nikunja"

    override fun toString(): String {
        return "$name is $age years old."
    }


}

object Student {

}

class Person {
    companion object Constants {
        val name = "Mr. Shishir"
    }

    fun studentMethod() {
        student1.toString()
    }
}




