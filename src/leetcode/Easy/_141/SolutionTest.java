package leetcode.Easy._141;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void hasCycle() {
        ListNode head = new ListNode(3);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(0);
        ListNode three = new ListNode(4);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = one;

        assertTrue(solution.hasCycle(head));
    }
}