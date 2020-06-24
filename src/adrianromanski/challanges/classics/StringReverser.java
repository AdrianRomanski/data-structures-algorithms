package adrianromanski.challanges.classics;

public class StringReverser {

    String reverse(String input) {
        char[] chars = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = chars.length - 1; i >= 0; i--) {
           sb.append(chars[i]);
        }
        return sb.toString();
    }
}
