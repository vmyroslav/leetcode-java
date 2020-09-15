package Easy._1470;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            res[i] = i % 2 == 0 ? nums[i / 2] : nums[n + i / 2];
        }

        return res;
    }
}
