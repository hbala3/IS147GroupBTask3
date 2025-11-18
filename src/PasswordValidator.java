/**
 * The PasswordValidator class provides functionality to read a password
 * from the user and validate it based on predefined strength rules.
 */
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password does not meet the required conditions.");
        }

        scanner.close();
    }
     /**
     * Validates a password based on the following rules:
     * <ul>
     *   <li>At least 8 characters long</li>
     *   <li>Contains at least one digit</li>
     *   <li>Contains at least one special character</li>
     * </ul>
     */

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; // Must be at least 8 characters
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()_+-=[]{};:'\"\\|,.<>?/";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (specialCharacters.indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
            if (hasDigit && hasSpecialChar) {
                return true; // If both conditions are met, no need to check further
            }
        }

        return false;
    }
}
