package Medium._1325;

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
    void removeLeafNodes() {
        TreeNode root = new TreeNode(1);
        TreeNode one = new TreeNode(2);
        TreeNode two = new TreeNode(3);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(2);
        TreeNode five = new TreeNode(4);

        root.left = one;
        root.right = two;
        one.left = three;
        two.left = four;
        two.right= five;

        TreeNode output = new TreeNode(1, null, new TreeNode(3, null, new TreeNode(4)));


        assertEquals(solution.removeLeafNodes(root, 2), output);
    }
}