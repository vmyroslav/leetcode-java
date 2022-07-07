package leetcode.easy._104;

import java.util.LinkedList;
import java.util.Queue;

public class DFSSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int max = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        queue.add(root);
        level.add(1);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int value = level.poll();
            max = Math.max(value, max);
            if (node.left != null) {
                queue.add(node.left);
                level.add(value + 1);
            }
            if (node.right != null) {
                queue.add(node.right);
                level.add(value + 1);
            }
        }

        return max;
    }
}
