package Medium._49;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void groupAnagrams() {

        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output = new ArrayList<>();
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        List<String> thirdList = new ArrayList<>();
        firstList.add("bat");
        secondList.add("tan");
        secondList.add("nat");
        thirdList.add("eat");
        thirdList.add("tea");
        thirdList.add("ate");


        output.add(firstList);
        output.add(secondList);
        output.add(thirdList);

        assertIterableEquals(output, solution.groupAnagrams(input));
    }
}