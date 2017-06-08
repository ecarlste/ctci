import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueStringsTest {

    @Test
    public void containsUniqueCharactersShouldReturnTrueWhenAllCharactersUnique() throws Exception {
        String uniqueString = "ab";

        boolean isUnique = UniqueStrings.containsUniqueCharacters(uniqueString);

        assertTrue(isUnique);
    }

    @Test
    public void containsUniqueCharactersShouldReturnFalseWhenContainsSameCharacters() throws Exception {
        String nonUniqueString = "aba";

        boolean isUnique = UniqueStrings.containsUniqueCharacters(nonUniqueString);

        assertFalse(isUnique);
    }

}