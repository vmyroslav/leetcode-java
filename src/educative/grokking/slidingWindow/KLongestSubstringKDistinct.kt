package educative.grokking.slidingWindow

import kotlin.math.max

/**
 *  Input: String="araaci", K=2
    Output: 4
    Explanation: The longest substring with no more than '2' distinct characters is "araa".

    Input: String="araaci", K=1
    Output: 2
    Explanation: The longest substring with no more than '1' distinct characters is "aa".
 */
class KLongestSubstringKDistinct {

    // O(N+N)
    fun findLength(str: String, k: Int): Int {
        if (str.isEmpty()) return 0

        var (start, end, max) = listOf(0, 0, 0)
        var freqMap = HashMap<Char, Int>()

        for (s in str) {
            end++
            freqMap[s] = freqMap.getOrDefault(s, 0) + 1

            while (freqMap.size > k) {
                freqMap[str[start]] = freqMap.getOrDefault(str[start], 0) - 1
                if (freqMap[s] == 0) freqMap.remove(str[start])
                start++
            }

            max = max(max, end - start)
        }

        return max
    }
}