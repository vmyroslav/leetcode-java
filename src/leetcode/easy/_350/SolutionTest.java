package leetcode.easy._350;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

class SolutionTest {

    @Test
    void intersectFirst() {
        int[] ints1 = new int[]{1,2,2,1};
        int[] ints2 = new int[]{2,2};
        int[] output = new int[]{2,2};

        Assertions.assertArrayEquals(output, (new Solution()).intersect(ints1, ints2));
    }

    @Test
    void intersectSecond() {
        int[] ints1 = new int[]{4, 9, 5};
        int[] ints2 = new int[]{9, 4, 9, 8, 4};
        int[] output = new int[]{4, 9};

        int[] result = (new Solution()).intersect(ints1, ints2);
        for (int o: output) {
            Assertions.assertTrue(Arrays.stream(result).boxed().collect(Collectors.toList()).contains(o));
        }
    }
}