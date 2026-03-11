import java.util.HashMap;

/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 */
public class UC8 {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        charMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        charMap.put('S', new String[]{
            " ****",
            "*    ",
            " ****",
            "    *",
            " ****"
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        if (message == null || message.isEmpty()) return;
        int patternHeight = charMap.get(message.charAt(0)).length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                bannerLine.append(pattern != null ? pattern[line] : "     ");
                bannerLine.append(" ");
            }
            System.out.println(bannerLine.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}