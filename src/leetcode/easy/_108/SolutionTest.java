package leetcode.easy._108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void sortedArrayToBST() {
        int[] input = new int[]{-10, -3, 0, 5, 9};

        TreeNode result = new TreeNode(
                0,
                new TreeNode(-10, null, new TreeNode(-3)),
                new TreeNode(5, null, new TreeNode(9))
        );

        assertEquals(result, solution.sortedArrayToBST(input));
    }
}