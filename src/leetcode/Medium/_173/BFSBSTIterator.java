package leetcode.Medium._173;

import java.util.ArrayList;

// https://leetcode.com/problems/binary-search-tree-iterator/solution/
public class BFSBSTIterator {

    ArrayList<Integer> nodesList;
    int currIndex;

    // Time: O(1); Space: O(n)
    public BFSBSTIterator(TreeNode root) {
        nodesList = new ArrayList<>();
        currIndex = -1;
        inOrder(root);
    }

    public int next() {
        return nodesList.get(++currIndex);
    }

    public boolean hasNext() {
        return currIndex < nodesList.size();

    }

    private void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        nodesList.add(node.val);
        inOrder(node.right);
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
