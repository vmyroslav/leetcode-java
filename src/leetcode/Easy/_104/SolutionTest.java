package leetcode.Easy._104;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;
    private BFSSolution bfsSolution;
    private DFSSolution dfsSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        bfsSolution = new BFSSolution();
        dfsSolution = new DFSSolution();
    }

    @Test
    void maxDepth() {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        assertEquals(3, solution.maxDepth(root));
        assertEquals(3, bfsSolution.maxDepth(root));
        assertEquals(3, dfsSolution.maxDepth(root));
    }
}