package leetcode.Medium._105;

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
    void buildTree() {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        assertEquals(root, solution.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
    }
}