public class UC5_1 {

    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] banner = {

                String.join("",
                        "  *****  ",
                        "  *****  ",
                        "  ****** ",
                        "  ****** "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *       "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " ******  ",
                        "  *****  "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        " *     * "
                ),

                String.join("",
                        "  *****  ",
                        "  *****  ",
                        " *       ",
                        "  *****  "
                )
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}