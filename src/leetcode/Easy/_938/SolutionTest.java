package leetcode.Easy._938;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;
    private DFSSolution dfsSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        dfsSolution = new DFSSolution();
    }

    @Test
    void rangeSumBST() {
        TreeNode root = new TreeNode(
                10,
                new TreeNode(5, new TreeNode(15), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18))
        );

        assertEquals(32, solution.rangeSumBST(root, 7 ,15));
    }

    @Test
    void rangeSumBSTIterative() {
        TreeNode root = new TreeNode(
                10,
                new TreeNode(5, new TreeNode(15), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18))
        );

        assertEquals(32, dfsSolution.rangeSumBST(root, 7 ,15));
    }
}