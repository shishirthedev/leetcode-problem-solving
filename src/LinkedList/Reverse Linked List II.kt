package LinkedList


import ListNode
import java.util.*


fun main() {
    println("hello world")
}

// way -1 using stack
fun reverseLinkedList1(head: ListNode?): ListNode? {
    val stack = Stack<Int>()
    var fHead = head
    while (fHead != null) {
        stack.push(fHead.`val`)
        fHead = fHead.next
    }

    val dNode = ListNode(-1)
    var ptr: ListNode? = dNode
    while (stack.isNotEmpty()) {
        ptr?.next = ListNode(stack.pop())
        ptr = ptr?.next
    }
    return dNode.next
}


// way 2: without stack
fun revLinkedList2(head: ListNode?): ListNode? {
    if (head?.next == null) return null

    var preNode: ListNode? = null
    var currentNode: ListNode? = head
    while (currentNode != null) {
        val nextNode = currentNode.next
        currentNode.next = preNode
        preNode = currentNode
        currentNode = nextNode
    }
    return preNode
}

fun revLinkedList3(head: ListNode?): ListNode? {
    if (head?.next == null) return null

    var preNode: ListNode? = null
    var currentNode = head
    while (currentNode != null) {
        val nextNode = currentNode.next
        currentNode.next = preNode
        preNode = currentNode
        currentNode = nextNode
    }
    return preNode
}