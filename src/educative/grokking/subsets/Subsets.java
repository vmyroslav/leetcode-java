package educative.grokking.subsets;

import java.util.ArrayList;
import java.util.List;

// https://www.educative.io/courses/grokking-the-coding-interview/gx2OqlvEnWG

public class Subsets {
    //Time: O(2^n); Space: O(2^n)
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int n: nums) {
            int size = subsets.size();

            for (int i = 0; i < size; i++) {
                List<Integer> subList = new ArrayList<>(subsets.get(i));
                subList.add(n);
                subsets.add(subList);
            }
        }

        return subsets;
    }
}
