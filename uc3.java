/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends UC2 by using String.join() to construct each line of the "OOPS" banner.
 * It improves memory efficiency by reducing intermediate String objects compared to the + operator.
 *
 * @author Developer
 * @version 3.0
 */
public class uc3 {

    public static void main(String[] args) {
        // Row 0
        System.out.println(String.join(" ",
            " ******* ",
            " ******* ",
            " ******* ",
            " ******* "
        ));

        // Row 1
        System.out.println(String.join(" ",
            "*       *",
            "*       *",
            "*       *",
            "*       *"
        ));

        // Row 2
        System.out.println(String.join(" ",
            "*       *",
            "*       *",
            "*       *",
            "*        "
        ));

        // Row 3
        System.out.println(String.join(" ",
            "*       *",
            "*       *",
            " ******* ",
            " ******* "
        ));

        // Row 4
        System.out.println(String.join(" ",
            "*       *",
            "*       *",
            "*        ",
            "        *"
        ));

        // Row 5
        System.out.println(String.join(" ",
            "*       *",
            "*       *",
            "*        ",
            "*       *"
        ));

        // Row 6
        System.out.println(String.join(" ",
            " ******* ",
            " ******* ",
            "*        ",
            " ******* "
        ));
    }
}