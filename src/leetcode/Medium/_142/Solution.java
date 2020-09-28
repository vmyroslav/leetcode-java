package leetcode.Medium._142;

// https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle){
                ListNode newTurtle = head;
                while (newTurtle != turtle){
                    turtle = turtle.next;
                    newTurtle = newTurtle.next;
                }
                return turtle;
            }
        }

        return null;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}
