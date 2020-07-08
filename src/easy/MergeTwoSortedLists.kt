package easy

//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//
//
// 示例：
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//
// Related Topics 链表
// 👍 1142 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null)
        return l2
    if (l2 == null)
        return l1
    var n1: ListNode? = l1
    var n2: ListNode? = l2

    val dump = ListNode(0)
    var move: ListNode? = dump

    while (n1 != null && n2 != null) {
        if (n1.`val` <= n2.`val`) {
            move!!.next = n1
            n1 = n1.next
        } else {
            move!!.next = n2
            n2 = n2.next
        }
        move = move.next
    }
    n1?.let {
        move!!.next = n1
    }
    n2?.let {
        move!!.next = n2
    }
    return dump.next
}


//leetcode submit region end(Prohibit modification and deletion)
