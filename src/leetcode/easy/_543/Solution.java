package leetcode.easy._543;

// https://leetcode.com/problems/diameter-of-binary-tree/

public class Solution {
    int res;

    //Time: O(N); Space: O(N);
    public int diameterOfBinaryTree(TreeNode root) {
        res = 1;
        depth(root);

        return res - 1;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);

        res = Math.max(res, L + R + 1);

        return Math.max(L, R) + 1;
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
