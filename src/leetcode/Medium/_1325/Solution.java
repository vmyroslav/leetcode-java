package leetcode.Medium._1325;

//https://leetcode.com/problems/delete-leaves-with-a-given-value/

import java.util.Objects;

public class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if (root == null) {
            return null;
        }

        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }

        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }


        return root.val == target && root.left == root.right ? null : root;
    }
}


// * Definition for a binary tree node.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}