package adrianromanski.challanges.arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

// Challenge: Given a string, see if you can detect whether it contains only
// unique chars
public class UniqueCharacterDetector {

    boolean isUnique1(String input) {
        char[] chars = input.toCharArray();
        Set<Character> charsSet = new HashSet<>();
        for(char c: chars) {
            charsSet.add(c);
        }
        return charsSet.size() == chars.length;
    }

    boolean isUnique2(String input) {
        char[] chars = input.toCharArray();
        Set<Character> charsSet = new HashSet<>();
        for(char c: chars) {
            if(!charsSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
