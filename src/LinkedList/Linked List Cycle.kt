data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
//
//fun hasCycle(head: ListNode?): Boolean {
//    if (head == null) return false
//    var slow: ListNode? = head
//    var fast: ListNode? = head
//    while (fast?.next != null) {
//        fast = fast.next?.next
//        slow = slow?.next
//        if (slow == fast) return true
//    }
//    return false
//}
//
//fun hasCycle2(head: ListNode?): ListNode? {
//    var slow: ListNode? = head
//    var fast: ListNode? = head
//    while (fast?.next != null) {
//        fast = fast.next?.next
//        slow = slow?.next
//
//        if (slow == fast) {
//            var fakeHead = head
//            while (fakeHead != slow) {
//                fakeHead = fakeHead?.next
//                slow = slow?.next
//            }
//            return slow
//        }
//    }
//    return null
//}


fun main() {
 
}
