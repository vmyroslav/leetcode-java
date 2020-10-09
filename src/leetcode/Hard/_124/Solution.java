package leetcode.Hard._124;

// https://leetcode.com/problems/binary-tree-maximum-path-sum/

public class Solution {
    //Time: O(n); Space: O(n);
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max(root);
        int res = max;
        max = Integer.MIN_VALUE;

        return res;
    }

    private int max(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(max(node.left), 0);
        int right = Math.max(max(node.right), 0);

        max = Math.max(max, left + right + node.val);

        return Math.max(left, right) + node.val;
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
