package educative.grokking.slidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringKDistinctTest {

    @Test
    void findLength() {
        try {
            assertEquals(4, LongestSubstringKDistinct.findLength("araaci", 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}