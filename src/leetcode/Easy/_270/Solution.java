package leetcode.Easy._270;

// https://leetcode.com/problems/closest-binary-search-tree-value/

public class Solution {
    //Time: O(H); Space: O(1)
    public int closestValue(TreeNode root, double target) {
        int res = root.val;

        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(res - target)) res = root.val;
            root = root.val > target ? root.left : root.right;
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