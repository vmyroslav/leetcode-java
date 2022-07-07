package leetcode.easy._88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @Test
    void merge() {
        int[] inputNums1 = new int[]{1,2,3,0,0,0};
        int[] inputNums2 = new int[]{2,5,6};
        int inputM = 3;
        int inputN = 3;
        int[] output = new int[]{1,2,2,3,5,6};

        solution.merge(inputNums1, inputM, inputNums2, inputN);
        Assertions.assertArrayEquals(output, inputNums1);
    }

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

}