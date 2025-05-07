package gui;

 
import java.util.Scanner;
    public class inputValidation {
   // ----------- Input Validation -----------
    public static int getNonNegativeInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 0) break;
                else System.out.println("  Error: Must be a non-negative integer.");
            } else {
                System.out.println("  Error: Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }
        return value;
    }

    public static int getPositiveInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) break;
                else System.out.println("  Error: Must be a positive integer greater than 0.");
            } else {
                System.out.println("  Error: Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }
        return value;
    }

    public static String getTrueString(Scanner scanner, String prompt) {
        String name = "";
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextInt()) {
                name = scanner.next();
                break;
            } else {
                System.out.println("  Error: Please enter a valid name (not a number).");
                scanner.next(); // discard invalid input
            }
        }
        return name;
    }
}