package leetcode.Medium._40;

// https://leetcode.com/problems/combination-sum-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    //Time: O(k * 2 ^ n); Space: O(2^n)
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(res, tempList, 0, target, candidates);

        return res;

    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int start, int remain, int[] nums) {
        if (remain < 0) return;
        if (remain == 0) {
            res.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i-1]) continue;
                tempList.add(nums[i]);
                backtrack(res, tempList, i + 1, remain - nums[i], nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
