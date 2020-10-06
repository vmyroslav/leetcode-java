package leetcode.Easy._100;

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
    void isSameTree() {
        TreeNode one = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode two = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(solution.isSameTree(one, two));
    }
}