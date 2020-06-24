package adrianromanski.challanges.classics;

import java.util.HashMap;

public class RansomNote {

    public boolean canWrite(String note, String letters) {

        // Assumption: We don't need to count spaces in our note
        String noteNoSpaces = note.replaceAll("\\s+", "");

        HashMap<String, Integer> noteMap = map(noteNoSpaces);
        HashMap<String, Integer> letterMap = map(letters);

        return canWriteRansom(noteMap, letterMap);
    }

    private HashMap<String, Integer> map(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] characters = text.toCharArray();

        for(int i =0; i <characters.length; i++) {

            String character = String.valueOf(characters[i]);

            if(map.containsKey(character)) {
                Integer currentCount = map.get(character);
                map.put(character, currentCount + 1);
            } else {
                map.put(String.valueOf(characters[i]), 1);
            }
        }
        return map;
    }

    private boolean canWriteRansom(HashMap<String, Integer> noteMap, HashMap<String,Integer> letterMap) {

        for(String key : noteMap.keySet()) {

            if(!letterMap.containsKey(key)) {
                return false;
            }

            int noteCount = noteMap.get(key);
            int letterCount = letterMap.get(key);

            if(letterCount < noteCount) {
                return false;
            }
        }
        return true;
    }


}
