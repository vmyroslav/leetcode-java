package leetcode.easy._1539;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findKthPositiveFirst() {
        int[] inputArr = new int[]{2,3,4,7,11};
        int inputK = 5;
        int output = 9;

        Assertions.assertEquals(output, (new Solution()).findKthPositive(inputArr, inputK));
        Assertions.assertEquals(output, (new BinarySearchSolution()).findKthPositive(inputArr, inputK));
    }

    @Test
    void findKthPositiveSecond() {
        int[] inputArr = new int[]{1,2,3,4};
        int inputK = 2;
        int output = 6;

        Assertions.assertEquals(output, (new Solution()).findKthPositive(inputArr, inputK));
        Assertions.assertEquals(output, (new BinarySearchSolution()).findKthPositive(inputArr, inputK));
    }
}