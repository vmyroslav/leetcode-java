package Medium._230;

import java.util.LinkedList;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/solution/

public class StackSolution {
    // Time: O(H(n) + k); Space: O(log(n)) - average
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (true) {

            while (root != null) {
                stack.add(root);
                root = root.left;
            }

            TreeNode node = stack.removeLast();
            if (--k == 0) {
                return node.val;
            }

            stack.add(node.right);
        }
    }
}

