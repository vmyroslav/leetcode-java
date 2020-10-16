package leetcode.Medium._211;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordDictionaryTest {

    private WordDictionary dictionary;

    @BeforeEach
    void setUp() {
        dictionary = new WordDictionary();
    }

    @Test
    void addWord() {
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");

        assertFalse(dictionary.search("pad"));
        assertTrue(dictionary.search("bad"));
        assertTrue(dictionary.search(".ad"));
    }
}