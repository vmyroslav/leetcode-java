package leetcode.Medium._230;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;
    private StackSolution stackSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        stackSolution = new StackSolution();
    }

    @Test
    void kthSmallest() {
        TreeNode root= new TreeNode(3);
        TreeNode oneLeft = new TreeNode(1);
        TreeNode oneRight = new TreeNode(4);
        TreeNode twoRight = new TreeNode(2);

        root.left = oneLeft;
        root.right = oneRight;
        oneLeft.right = twoRight;

        assertEquals(1, solution.kthSmallest(root, 1));
        assertEquals(1, stackSolution.kthSmallest(root, 1));
    }
}