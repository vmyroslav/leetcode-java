package leetcode.Medium._143;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reorderList() {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;

        ListNode res = new ListNode(1);
        ListNode resOne = new ListNode(5);
        ListNode resTwo = new ListNode(2);
        ListNode resThree = new ListNode(4);
        ListNode resFour = new ListNode(3);

        res.next = resOne;
        resOne.next = resTwo;
        resTwo.next = resThree;
        resThree.next = resFour;

        solution.reorderList(head);
        assertEquals(res, head);
    }
}