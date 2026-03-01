import java.util.HashMap;
import java.util.Map;

public class uc8 {

    public static void main(String[] args) {

        String word = "OOPS";

        // Centralized Pattern Library
        Map<Character, String[]> patternLibrary = new HashMap<>();

        patternLibrary.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternLibrary.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternLibrary.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        int height = 7; // pattern height

        // Render Banner
        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternLibrary.get(c);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}