import java.util.Scanner;
/**
* This program asks the user if they want to run the first
* or second program.
*
* @author Jedidiah Alfred
* @version 1.0
* @since 2023-02-18
*/

public final class Votingage {
    /**
    * This is a private constructor use to
    * satisfy the style checker.
    *
    * @exception IllegalStateException Utility Class.
    * @see IllegalStateException
    */
    private Votingage() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Declare variable
        int userInput = 0;
        do {
            try {
                final Scanner scanner = new Scanner(System.in);
                // Getting users age.
                System.out.print("Which program?"
                    + "(1 for voting age, 2 for ever or odd.): ");
                // Creating the scanner.
                final String choice = scanner.nextLine();
                userInput = Integer.parseInt(choice);

                if (userInput == 1) {
                    // Assign variable constant
                    int userAge = 18;

                    // Getting users age.
                    System.out.print("Enter the user's age: ");
                    // Creating the scanner.
                    final String age = scanner.nextLine();

                    // Checking to ensure no error occurs.
                    try {
                        // Change string to int.
                        userAge = Integer.parseInt(age);
                        if (userAge >= 18) {
                            System.out.println("Congratulations"
                                + ", you are eligible to vote");
                        } else {
                            System.out.println("Sorry, you are "
                                + "below the required age to vote");
                        }

                        // What to do if an error was caught.
                    } catch (NumberFormatException error) {
                        System.out.println("The input must be a numerical "
                            + "value." + error.getMessage());
                    }
                } else if (userInput == 2) {

                    // Getting users age.
                    System.out.print("Enter an integer: ");
                    // Creating the scanner.
                    final String userStr = scanner.nextLine();

                    // Checking to ensure no error occurs.
                    try {
                        // Change string to int.
                        final int userNum = Integer.parseInt(userStr);
                        if (userNum % 2 == 0) {
                            System.out.println(userNum + " is even");
                        } else {
                            System.out.println(userNum + " is odd");
                        }

                        // What to do if an error was caught.
                    } catch (NumberFormatException error) {
                        System.out.println("This input must be "
                            + "a numerical value." + error.getMessage());
                    }
                } else {
                    System.out.println("The input is "
                            + "out of range.");
                }
            } catch (NumberFormatException error) {
                System.out.println("The input must be a numerical value."
                                    + error.getMessage());
            }
        } while (userInput != 1 && userInput != 2);

    }
}
