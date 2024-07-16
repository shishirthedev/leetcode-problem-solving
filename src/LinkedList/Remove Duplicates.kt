package LinkedList

import ListNode

fun main() {

}

fun removeDuplicates(head: ListNode?): ListNode? {
    var node1: ListNode? = head
    var node2: ListNode? = head?.next
    while (node2 != null) {
        if (node1?.`val` == node2.`val`) {
            node2 = node2.next
            continue
        }

        node1?.next = node2
        node1 = node2
        node2 = node2.next
    }
    node1?.next = null
    return head
}