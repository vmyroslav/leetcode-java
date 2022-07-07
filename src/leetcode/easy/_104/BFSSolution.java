package leetcode.easy._104;

import java.util.LinkedList;
import java.util.Queue;

public class BFSSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            count++;
        }

        return count;
    }
}
