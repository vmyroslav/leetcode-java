package leetcode.easy._543;

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
    void diameterOfBinaryTree() {
        assertEquals(3, solution.diameterOfBinaryTree(new TreeNode(
                1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3))
        ));
    }
}