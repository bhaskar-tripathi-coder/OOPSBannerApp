class LetterO {
    public String[] getPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }
}

class LetterP {
    public String[] getPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }
}

class LetterS {
    public String[] getPattern() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}

public class printbanner {

    public static void main(String[] args) {

        LetterO o1 = new LetterO();
        LetterO o2 = new LetterO();
        LetterP p = new LetterP();
        LetterS s = new LetterS();

        String[] O1 = o1.getPattern();
        String[] O2 = o2.getPattern();
        String[] P = p.getPattern();
        String[] S = s.getPattern();

        // Print line by line
        System.out.println(O1[0] + "  " + O2[0] + "  " + P[0] + "  " + S[0]);
        System.out.println(O1[1] + "  " + O2[1] + "  " + P[1] + "  " + S[1]);
        System.out.println(O1[2] + "  " + O2[2] + "  " + P[2] + "  " + S[2]);
        System.out.println(O1[3] + "  " + O2[3] + "  " + P[3] + "  " + S[3]);
        System.out.println(O1[4] + "  " + O2[4] + "  " + P[4] + "  " + S[4]);
        System.out.println(O1[5] + "  " + O2[5] + "  " + P[5] + "  " + S[5]);
        System.out.println(O1[6] + "  " + O2[6] + "  " + P[6] + "  " + S[6]);
    }
}
