package leetcode.Medium._98;

import java.util.Stack;

public class IterativeSolution {

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double min = - Double.MAX_VALUE;

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            int val = root.val;

            if (val <= min) return false;
            min = val;
            root = root.right;
        }

        return true;
    }

}
