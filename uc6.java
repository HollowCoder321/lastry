public class uc6 {
    

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Combine letters line-by-line
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = O[i] + "   " + P[i] + "   " + S[i];
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // --------- Helper Methods ---------

    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }

}
