package LinkedList

fun main() {

}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val resultNode = ListNode(-1)
    var ptr: ListNode? = resultNode

    var fakeL1 = l1
    var fakeL2 = l2
    var carry = 0
    while (fakeL1 != null || fakeL2 != null) {
        var sum = 0 + carry

        if (fakeL1 != null) {
            sum += fakeL1.`val`
            fakeL1 = fakeL1.next
        }

        if (fakeL2 != null) {
            sum += fakeL2.`val`
            fakeL2 = fakeL2.next
        }

        carry = sum / 10
        sum %= 10
        ptr?.next = ListNode(sum)
        ptr = ptr?.next
    }

    if(carry == 1){
        ptr?.next = ListNode(1)
    }

    return resultNode.next
}