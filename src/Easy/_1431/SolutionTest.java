package Easy._1431;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void kidsWithCandies() {

        var input = new int[]{2, 3, 5, 1, 3};
        Boolean[] outputArr = {true, true, true, false, true};
        List<Boolean> output = Arrays.asList(outputArr);
        var extraCandies = 3;
        var solution = new Solution();

        Assertions.assertIterableEquals(output, solution.kidsWithCandies(input, extraCandies));
    }
}