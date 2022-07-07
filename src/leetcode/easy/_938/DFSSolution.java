package leetcode.easy._938;

public class DFSSolution {
    private int res = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        int res = 0;
        dfs(root, L, R);

        return res;
    }

    private void dfs(TreeNode node, int L, int R) {
        if (node == null) return;
        if (L >= node.val && node.val <= R) res += node.val;
        if (node.val > L) dfs(node.left, L, R);
        if (node.val < R) dfs(node.right, L, R);
    }
}
