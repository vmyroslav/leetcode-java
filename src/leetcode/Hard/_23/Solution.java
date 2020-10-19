package leetcode.Hard._23;
import java.util.Objects;
import java.util.PriorityQueue;

// https://leetcode.com/problems/merge-k-sorted-lists/
public class Solution {
    //Time: O(n * log(k)); Space: O(k)
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);
        for (ListNode node: lists) {
            if (node != null) minHeap.add(node);
        }
        ListNode res = null;
        ListNode tail = null;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            if (res == null) res = tail = node;
            else {
                tail.next = node;
                tail = tail.next;
            }
            if (node.next != null) minHeap.add(node.next);
        }
        return res;
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
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }
    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
