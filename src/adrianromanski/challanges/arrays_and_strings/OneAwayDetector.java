package adrianromanski.challanges.arrays_and_strings;
// Challenge: There are three types of edits that can be performed on strings: insert a character,
// remove a character, or replace a character. Given two strings, write a function to check if they are
// one or zero edits away.
public class OneAwayDetector {

    public boolean oneAway(String first, String second) {


        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        } else if (first.length() == second.length()) {
            return OneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return OneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return OneEditInsert(second, first);
        }

        return true;
    }


    private boolean OneEditInsert(String s1, String s2) {
        int i = 0;
        int j = 0;
        while (j < s2.length() && i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (i != j) {
                    return false;
                }
                j++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }

    private boolean OneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

}