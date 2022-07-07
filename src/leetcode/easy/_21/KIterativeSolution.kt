package leetcode.easy._21

class KIterativeSolution {
    fun mergeTwoLists(_list1: KListNode?, _list2: KListNode?): KListNode? {
        var list1 = _list1
        var list2 = _list2

        if (list1 == null) return list2
        if (list2 == null) return list1

        var head = KListNode(0)
        var temp: KListNode = head

        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                temp.next = list1
                list1 = list1.next
            }
            else {
                temp.next = list2
                list2 = list2.next
            }
            temp = temp.next!!
        }

        if (list1 != null) {
            temp.next = list1
        } else {
            temp.next = list2
        }

        return head.next
    }
}

class KListNode(var `val`: Int) {
      var next: KListNode? = null


//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other !is KListNode) return false
//        val listNode = other
//        return `val` == listNode.`val` && next == listNode.next
//    }
}