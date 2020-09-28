package Interview.FacebookPortal.BillionUsers;

public class Solution {
    public int getBillionUsersDay(float[] growthRates) {
        // Write your code here
        int billion = 1000000000;

        int start = 1;
        int end = 2000;

        while (start < end) {
            double sum = 0;
            int mid = start + (end - start) / 2;
            for (float rate: growthRates) {
                sum += Math.pow(rate, mid);
            }
            if (sum == billion) return mid;
            if (sum > billion) end = mid;
            if (sum < billion) start = mid + 1;
        }

        return start;
    }

}
