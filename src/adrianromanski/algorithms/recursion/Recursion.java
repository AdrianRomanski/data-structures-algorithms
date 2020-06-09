package adrianromanski.algorithms.recursion;

public class Recursion {

    public String stripZeros(String text) {
        if(text.startsWith("0")) {
            String substring = text.substring(1);
            return stripZeros(substring);
        }
        return text;
    }
}
