package leetcode.Easy._226;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;
    private IterativeSolution iterativeSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        iterativeSolution = new IterativeSolution();
    }

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(
                4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        TreeNode result = new TreeNode(
                4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );

        assertEquals(result, solution.invertTree(root));
    }

    @Test
    void invertIterativeTree() {
        TreeNode root = new TreeNode(
                4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        TreeNode result = new TreeNode(
                4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );

        assertEquals(result, iterativeSolution.invertTree(root));
    }
}