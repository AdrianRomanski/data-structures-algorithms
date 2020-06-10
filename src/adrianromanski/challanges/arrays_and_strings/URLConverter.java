package adrianromanski.challanges.arrays_and_strings;
// Challenge: See if you can replaces all the spaces in a a string with the
// ASCII symbol for space '%20'. Assume you are given the length of the final
// string. Hint: Use array of char[]
public class URLConverter {

    String urlifyWithReplaceAll(String input, int length) {
        input = input.trim();
        return input.replaceAll(" ", "%20");
    }

    String urlifyWithoutReplaceAll(String input, int length) {

        char[] result = new char[length];

        input = input.trim();

        char[] urlChars = input.toCharArray();

        int pointer = 0;

        for (char c : urlChars) {
            if (c != ' ') {
                result[pointer] = c;
                pointer++;
            } else {
                result[pointer] = '%';
                result[pointer + 1] = '2';
                result[pointer + 2] = '0';
                pointer = pointer + 3;
            }
        }
        return String.valueOf(result);
    }


}
