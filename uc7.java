import java.util.HashMap;
import java.util.Map;

public class uc7 {
    


    // -------- Static Inner Class ----------
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        // Create pattern storage
        Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        // Build banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {
                CharacterPatternMap pattern = patternLibrary.get(c);
                if (pattern != null) {
                    lineBuilder.append(pattern.getPattern()[row]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}
