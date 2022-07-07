package leetcode.easy._100;

import java.util.ArrayDeque;

public class IterativeSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (isNotEqual(p, q)) return false;

        ArrayDeque<TreeNode> deqP = new ArrayDeque<>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while (!deqP.isEmpty()) {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if (isNotEqual(p, q)) return false;
            // in Java nulls are not allowed in Deque
            if (isNotEqual(p.left, q.left)) return false;
            if (p.left != null) {
                deqP.addLast(p.left);
                deqQ.addLast(q.left);
            }
            if (isNotEqual(p.right, q.right)) return false;
            if (p.right != null) {
                deqP.addLast(p.right);
                deqQ.addLast(q.right);
            }
        }
        return true;
    }

    private boolean isNotEqual(TreeNode p, TreeNode q) {
        // p and q are null
        if (p == null && q == null) return false;
        // one of p and q is null
        if (q == null || p == null) return true;
        return p.val != q.val;
    }
}
