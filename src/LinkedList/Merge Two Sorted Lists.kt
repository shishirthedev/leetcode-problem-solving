package LinkedList

fun main() {

}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var fList1: ListNode? = list1
    var fList2: ListNode? = list2
    val arr = ArrayList<Int>()
    while (fList1 != null) {
        arr.add(fList1.`val`)
        fList1 = fList1.next
    }

    while (fList2 != null) {
        arr.add(fList2.`val`)
        fList2 = fList2.next
    }

    val sortedArr = arr.sorted()

    val dNode = ListNode(-1)
    var ptr: ListNode? = dNode
    sortedArr.forEach {
        ptr?.next = ListNode(it)
        ptr = ptr?.next
    }
    return dNode.next
}