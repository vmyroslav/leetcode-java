package educative.grokking.slidingWindow

import kotlin.math.max

/**
    Input: Fruit=['A', 'B', 'C', 'A', 'C']
    Output: 3
    Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']

    Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']
    Output: 5
    Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
    This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']
 */
class KMaxFruitCountOf2Types {

    // O(N+N)
    fun findLength(arr: Array<Char>): Int {

        var (start, end, max) = arrayOf(0, 0, 0)
        var freqMap = HashMap<Char, Int>()

        for (ch in arr) {
            end++
            freqMap[ch] = freqMap.getOrDefault(ch, 0) + 1

            while (freqMap.size > 2) {
                freqMap[arr[start]] = freqMap.getOrDefault(arr[start], 0) - 1
                if (freqMap[arr[start]] == 0) freqMap.remove(arr[start])
                start++
            }

            max = max(max, end - start)
        }

        return max
    }
}