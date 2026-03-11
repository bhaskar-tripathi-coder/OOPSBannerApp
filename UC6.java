 /*
 * OOPSBannerApp UC6 – Render OOPS as Banner using Static Helper Methods
 *
 * This use case improves upon UC5 by encapsulating each letter's pattern
 * in a dedicated static method, promoting reusability and maintainability.
 */

public class UC6 {

    // Returns the 7-line pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Returns the 7-line pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Returns the 7-line pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {
        // Get the patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print each line of the banner
        for (int i = 0; i < oPattern.length; i++) {
            String line = String.join(" ", oPattern[i], oPattern[i], pPattern[i], sPattern[i]);
            System.out.println(line);
        }
    }
} 