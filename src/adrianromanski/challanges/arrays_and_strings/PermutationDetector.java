package adrianromanski.challanges.arrays_and_strings;

import java.util.Arrays;

// Challenge: Given two strings, check if one is a permutation of the other
public class PermutationDetector {

    boolean isPermutation(String s1, String s2) {
        if(s1 == null || s2 == null) {
            return false;
        } else if(s1.length() != s2.length()) {
            return false;
        } else if(s1.equals(s2)) {
            return true;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));
    }
}
