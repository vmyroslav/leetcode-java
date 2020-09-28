package Interview.FacebookPortal.RotationalCipher;

public class Solution {
    public String rotationalCipher(String input, int rotationFactor) {
        // Write your code here
        StringBuilder res = new StringBuilder();

        for (Character c: input.toCharArray()) {
            if (Character.isDigit(c)) {
                res.append(convertDigit(c, rotationFactor));
                continue;
            }

            if (Character.isAlphabetic(c)) {
                res.append(convertChar(c, rotationFactor));
                continue;
            }

            res.append(c);
        }

        return res.toString();

    }

    int convertDigit(Character digit, int rotationFactor) {
        return  ((Character.getNumericValue(digit) + (rotationFactor % 10)) % 10);
    }

    char convertChar(char c, int rotationFactor) {

        char k = Character.isUpperCase(c) ? 'A' : 'a';

        return  (char) ((c - k + rotationFactor) % 26 + k);
    }
}
