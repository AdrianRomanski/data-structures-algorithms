package adrianromanski.challanges.classics;

import java.util.Arrays;

public class Anagram {

    boolean isAnagram(String x, String y) {
        char[] xChars = x.toCharArray();
        Arrays.sort(xChars);

        char[] yChars = y.toCharArray();
        Arrays.sort(yChars);

        return Arrays.equals(yChars, xChars);
    }
}
