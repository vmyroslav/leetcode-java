package educative.grokking.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.educative.io/courses/grokking-the-coding-interview/7npk3V3JQNr

public class SubsetWithDuplicates {
    //Time: O(n * 2^n); Space: O(2^n)
    public static List<List<Integer>> findSubsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            // if current and the previous elements are same, create new subsets only from the subsets
            // added in the previous step
            if (i > 0 && nums[i] == nums[i - 1])
                start = end + 1;
            end = subsets.size() - 1;
            for (int j = start; j <= end; j++) {
                // create a new subset from the existing subset and add the current element to it
                List<Integer> set = new ArrayList<>(subsets.get(j));
                set.add(nums[i]);
                subsets.add(set);
            }
        }
        return subsets;
    }
}
