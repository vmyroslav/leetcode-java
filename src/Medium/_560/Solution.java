package Medium._560;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int res = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            if (map.containsKey(sum - k)){
                res += map.get(sum - k);
            }
        }
        
        
        return res;

    }
}
