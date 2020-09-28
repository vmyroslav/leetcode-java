package educative.grokking.slidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinSizeSubArraySumTest {

    @Test
    void findMinSubArray() {
        assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
        assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[]{3, 4, 1, 1, 6}));
    }
}