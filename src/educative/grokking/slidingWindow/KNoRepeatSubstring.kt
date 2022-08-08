package educative.grokking.slidingWindow

import kotlin.math.max

/**
    Input: String="aabccbb"
    Output: 3
    Explanation: The longest substring with distinct characters is "abc".

    Input: String="abbbb"
    Output: 2
    Explanation: The longest substring with distinct characters is "ab".

    Input: String="abccde"
    Output: 3
    Explanation: Longest substrings with distinct characters are "abc" & "cde".
 */
class KNoRepeatSubstring {
    fun findLength(str: String): Int {
        if (str.isEmpty()) return 0

        var (len, start) = arrayOf(0, 0)
        var freqMap = HashMap<Char, Int>()

        for (end in str.indices) {
            if (freqMap.containsKey(str[end])) {
                start = max(start, freqMap[str[end]]!! + 1);
            }

            freqMap[str[end]] = end
            len = max(len, end - start + 1)
        }

        return len
    }
}