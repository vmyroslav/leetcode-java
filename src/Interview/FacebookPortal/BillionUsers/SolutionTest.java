package Interview.FacebookPortal.BillionUsers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void getBillionUsersDay() {
        float[] input = new float[]{(float) 1.5};
        int output = 52;
        assertEquals(output, solution.getBillionUsersDay(input));
    }

    @Test
    void getBillionUsersDaySecond() {
        float[] input = new float[]{(float) 1.1, (float)  1.2, (float)  1.3};
        int output = 79;
        assertEquals(output, solution.getBillionUsersDay(input));
    }
}