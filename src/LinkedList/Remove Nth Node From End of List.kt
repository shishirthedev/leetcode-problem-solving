package LinkedList

import ListNode

fun main() {

}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val preNode = ListNode(-1)
    preNode.next = head

    var sPtr: ListNode? = preNode
    var fPtr: ListNode? = preNode

    for (i in 1..n) {
        sPtr = sPtr?.next
    }

    while (sPtr?.next != null) {
        fPtr = fPtr?.next
        sPtr = sPtr.next
    }

    fPtr?.next = fPtr?.next?.next
    return preNode.next
}