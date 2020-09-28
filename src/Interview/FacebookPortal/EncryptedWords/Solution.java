package Interview.FacebookPortal.EncryptedWords;

public class Solution {
    public String findEncryptedWord(String s) {
        // Write your code here
        if (s.length() == 0) return "";

        int mid = (s.length() - 1) / 2;
        return s.charAt(mid) + findEncryptedWord(s.substring(0, mid)) + findEncryptedWord(s.substring(mid + 1));
    }
}
