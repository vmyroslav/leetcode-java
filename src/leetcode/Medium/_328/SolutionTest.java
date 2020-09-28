package leetcode.Medium._328;

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
    void oddEvenList() {
        ListNode inputHead = new ListNode(1);
        ListNode inputFirst = new ListNode(2);
        ListNode inputSecond = new ListNode(3);
        ListNode inputThird = new ListNode(4);
        ListNode inputFourth = new ListNode(5);
        inputHead.next = inputFirst;
        inputFirst.next = inputSecond;
        inputSecond.next = inputThird;
        inputThird.next = inputFourth;

        ListNode outputHead = new ListNode(1);
        ListNode outputFirst = new ListNode(3);
        ListNode outputSecond = new ListNode(5);
        ListNode outputThird = new ListNode(2);
        ListNode outputFourth = new ListNode(4);
        outputHead.next = outputFirst;
        outputFirst.next = outputSecond;
        outputSecond.next = outputThird;
        outputThird.next = outputFourth;


        assertEquals(outputHead, solution.oddEvenList(inputHead));
    }
}