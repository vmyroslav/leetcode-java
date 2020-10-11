package leetcode.Medium._143;

import java.util.Objects;

// https://leetcode.com/problems/reorder-list/

public class Solution {
    // Time: O(n); Space: O(1)
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        // find middle
        while (fast != null && fast.next != null) {
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        // Break the link
        temp.next = null;

        // Reverse tail
        ListNode middleHead = reverse(slow);

        //Merge both parts
        merge(head, middleHead);
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    private void merge(ListNode headOne, ListNode headTwo) {


        while (headOne != null) {
            ListNode one = headOne.next, two = headTwo.next;
            headOne.next = headTwo;

            if (one == null) break;
            headTwo.next = one;
            headOne = one;
            headTwo = two;
        }
    }
}

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}