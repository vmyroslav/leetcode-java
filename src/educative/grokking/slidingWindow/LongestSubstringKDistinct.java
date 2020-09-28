package educative.grokking.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static int findLength(String str, int k) throws Exception {
        if (str == null || str.length() < k)
            throw new Exception();

        int start = 0;
        int maxLen = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char endC = str.charAt(end);
            map.put(endC, map.getOrDefault(endC, 0) + 1);

            while (map.size() > k) {
                char startC = str.charAt(start);
                map.put(startC, map.get(startC) - 1);
                if (map.get(startC) == 0) map.remove(startC);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
