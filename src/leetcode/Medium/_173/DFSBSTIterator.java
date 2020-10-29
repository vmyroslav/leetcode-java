package leetcode.Medium._173;

import java.util.Stack;

public class DFSBSTIterator {
    Stack<TreeNode> nodeStack;

    //Time: O(1); Space: O(H)
    public DFSBSTIterator(TreeNode root) {
        nodeStack = new Stack<>();
        dfs(root);
    }

    public int next() {
        TreeNode node = nodeStack.pop();
        if (node.right != null) dfs(node.right);

        return node.val;
    }

    public boolean hasNext() {
        return !nodeStack.isEmpty();
    }

    private void dfs(TreeNode node) {
        while (node != null) {
            nodeStack.push(node);
            node = node.left;
        }
    }
}
