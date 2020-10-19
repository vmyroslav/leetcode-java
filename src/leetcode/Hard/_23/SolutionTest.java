package leetcode.Hard._23;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @org.junit.jupiter.api.Test
    void mergeKLists() {
        ListNode one = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode two = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode three = new ListNode(2, new ListNode(6));
        ListNode[] input = new ListNode[]{one, two, three};
        ListNode output = new ListNode(
                1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6)))))))
        );
        assertEquals(output, solution.mergeKLists(input));
    }
}