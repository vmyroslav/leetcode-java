package leetcode.Hard._124;

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
    void maxPathSum() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(6, solution.maxPathSum(root));
    }
}