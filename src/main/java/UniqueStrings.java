import java.util.HashMap;
import java.util.Map;

class UniqueStrings {

    static boolean containsUniqueCharacters(String stringToCheck) {
        Map<Character, Integer> characterFrequencies = new HashMap<>();

        for (char character : stringToCheck.toCharArray()) {
            if (characterFrequencies.containsKey(character)) {
                return false;
            } else {
                characterFrequencies.put(character, 1);
            }
        }

        return true;
    }

}
