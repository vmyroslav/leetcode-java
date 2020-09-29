package leetcode.Medium._19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void removeNthFromEnd() {
        ListNode headInput = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5);
        headInput.next = one;
        one.next = two;
        two.next = three;
        three.next = four;

        ListNode headOutput = new ListNode(1);
        ListNode oneO = new ListNode(2);
        ListNode twoO = new ListNode(3);
        ListNode fourO = new ListNode(5);
        headOutput.next = one;
        oneO.next = two;
        twoO.next = fourO;

        assertEquals(headOutput, solution.removeNthFromEnd(headInput, 2));
        assertNull(solution.removeNthFromEnd(new ListNode(1), 1));
    }
}