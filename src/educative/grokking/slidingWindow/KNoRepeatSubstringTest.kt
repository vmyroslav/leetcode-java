package educative.grokking.slidingWindow

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KNoRepeatSubstringTest {

    @Test
    fun findLength() {
        assertEquals(3, KNoRepeatSubstring().findLength("aabccbb"))
        assertEquals(2, KNoRepeatSubstring().findLength("abbbb"))
        assertEquals(3, KNoRepeatSubstring().findLength("abccde"))
    }
}