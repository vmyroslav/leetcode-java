package leetcode.Medium._34;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class Solution {
    //Time: O(log(n)); Space: O(1)
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int first = findFirst(nums, target);
        int second = findLast(nums, target);

        res[0] = first;
        res[1] = second;

        return res;
    }

    private int findFirst(int[] nums, int target) {
        int res = -1;
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) res = mid;
        }

        return res;
    }

    private int findLast(int[] nums, int target) {
        int res = -1;
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) res = mid;
        }

        return res;
    }


}
