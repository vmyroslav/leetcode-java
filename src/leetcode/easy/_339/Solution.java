package leetcode.easy._339;

import java.util.List;

// https://leetcode.com/problems/nested-list-weight-sum/

public class Solution {
    // Time: O(n); Space: O(H)
    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList, 1);
    }

    private int dfs(List<NestedInteger> nestedList, int level) {
        int res = 0;

        for (NestedInteger n: nestedList) {
            if (n.isInteger()) res += n.getInteger() * level;
            else res += dfs(n.getList(), level + 1);
        }

        return res;
    }
}

interface NestedInteger {
    boolean isInteger();
    Integer getInteger();
    void setInteger(int value);
    void add(NestedInteger ni);
    List<NestedInteger> getList();
}