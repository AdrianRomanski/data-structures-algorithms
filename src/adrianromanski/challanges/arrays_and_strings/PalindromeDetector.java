package adrianromanski.challanges.arrays_and_strings;
// Challenge: Detect if a given string is a palindrome.
// A palindrome is a word that can be spelt the same way forwards and backwards.
public class PalindromeDetector {

    public boolean isPalindrome(String input) {
        char[] array = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
        }
        return builder.toString().equals(input);
    }
}
