/*
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by introducing an inner static class CharacterPatternMap
 * that encapsulates a character and its ASCII art pattern. The application creates
 * mappings for 'O', 'P', 'S', and space, then displays the "OOPS" banner using these
 * mappings. This improves organization, reusability, and scalability.
 *
 * @author Developer
 * @version 7.0
 */

public class UC7 {

    /**
     * Inner static class to hold a character and its 7-line banner pattern.
     */
    static class CharacterPatternMap {
        /** The character represented */
        private char character;
        /** The 7-line pattern for the character */
        private String[] pattern;

        /**
         * Constructs a CharacterPatternMap.
         *
         * @param character the character
         * @param pattern   an array of 7 strings, each representing a line of the banner
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern array.
         *
         * @return the pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and returns an array of CharacterPatternMap objects for
     * the letters O, P, S and a space character.
     *
     * @return array of CharacterPatternMap containing all needed patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        // Pattern for letter O
        String[] oPattern = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        // Pattern for letter P
        String[] pPattern = {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };

        // Pattern for letter S
        String[] sPattern = {
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            "**** "
        };

        // Pattern for space (5 blank characters)
        String[] spacePattern = {
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        };

        // Create and return array of mappings
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern),
            new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Retrieves the pattern for a given character from the array of mappings.
     * If the character is not found, returns the pattern for space.
     *
     * @param ch       the character to look up
     * @param charMaps array of CharacterPatternMap objects
     * @return the pattern array for the character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // Fallback to space pattern (assumed to be the last element)
        return charMaps[charMaps.length - 1].getPattern();
    }

    /**
     * Prints a message as a horizontal banner using the provided character patterns.
     *
     * @param message  the string to display (e.g., "OOPS")
     * @param charMaps array of available character patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Number of lines in each pattern (should be 7)
        int linesPerChar = charMaps[0].getPattern().length;

        // Build and print each line of the banner
        for (int line = 0; line < linesPerChar; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                String[] pattern = getCharacterPattern(c, charMaps);
                bannerLine.append(pattern[line]);
                if (i < message.length() - 1) {
                    bannerLine.append(" ");  // single space between characters
                }
            }
            System.out.println(bannerLine.toString());
        }
    }

    /**
     * Main method – entry point.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}