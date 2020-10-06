package leetcode.Medium._98;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;
    private IterativeSolution iterativeSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        iterativeSolution = new IterativeSolution();
    }

    @Test
    void isValidBST() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode rootSecond = new TreeNode(
                4, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6))
        );
        TreeNode rootThird = new TreeNode(0);

        assertTrue(solution.isValidBST(root));
        assertTrue(iterativeSolution.isValidBST(root));
        assertFalse(solution.isValidBST(rootSecond));
        assertFalse(iterativeSolution.isValidBST(rootSecond));
        assertTrue(solution.isValidBST(rootThird));
        assertTrue(iterativeSolution.isValidBST(rootThird));
    }
}