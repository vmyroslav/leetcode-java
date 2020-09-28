package Interview.FacebookPortal.EncryptedWords;

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
    void findEncryptedWord() {
        String input = "abcxcba";
        String ouput = "xbacbca";

        assertEquals(ouput, solution.findEncryptedWord(input));
    }

    @Test
    void findEncryptedWordSecond() {
        String input = "abc";
        String ouput = "bac";

        assertEquals(ouput, solution.findEncryptedWord(input));
    }

    @Test
    void findEncryptedWordThree() {
        String input = "abcd";
        String ouput = "bacd";

        assertEquals(ouput, solution.findEncryptedWord(input));
    }
}