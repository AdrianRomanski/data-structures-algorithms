package adrianromanski.challanges.arrays_and_strings;
// Challenge: Give a string with repeating characters (i.e. "aaabb") write
// an algorithm that will compress the string down to the character, followed
// by the number of times it appears in the string (i.e "a3b2").
// If the compressed string is not smaller than original, return original.
public class Compressor {

    String compress(String input) {

        char[] array = input.toCharArray();
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if(i < array.length - 1 && (array[i] == array[i+1])) {
                count++;
            } else {
                if(count > 1) {
                    builder.append(array[i]);
                    builder.append(count);
                    count = 1;
                } else {
                    builder.append(array[i]);
                    builder.append(count);
                }
            }
        }
        return builder.length() < input.length() ? builder.toString() : input;
    }
}
