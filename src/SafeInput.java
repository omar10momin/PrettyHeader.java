public class SafeInput {
    /**
     * Print a pretty header with the message centered.
     *
     * @param msg the message to be centered in the header
     */
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgLength = msg.length();
        int sideStarsCount = (totalWidth - msgLength - 6) / 2; // Calculate the number of stars on each side of the message

        // Print the top row of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the second row with stars and centered message
        System.out.print("***");
        for (int i = 0; i < sideStarsCount; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < sideStarsCount; i++) {
            System.out.print(" ");
        }
        // If the total width is odd, add one more space on the right side
        if (msgLength % 2 != 0) {==
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom row of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
