package leetcode.Easy._938;

import java.util.Stack;

// https://leetcode.com/problems/range-sum-of-bst/

public class Solution {
    // Time: O(n); Space:(O(H));
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val >= L && node.val <= R) res += node.val;
            if (node.left != null && node.val > L) stack.push(node.left);
            if (node.right != null && node.val < R) stack.push(node.right);
        }

        return res;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
