package leetcode.Easy._1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;

        for (int count: candies) {
            max = Math.max(count, max);
        }

        for (int count: candies) {
            if (count + extraCandies >= max) {
                res.add(true);
                continue;
            }

            res.add(false);
        }
        return res;
    }
}
