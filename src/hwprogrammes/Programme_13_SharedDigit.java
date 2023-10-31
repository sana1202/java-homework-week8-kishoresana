package hwprogrammes;
import java.util.Scanner;
/** Shared Digit
 *
 */
public class Programme_13_SharedDigit {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the numbers
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            if (hasSharedDigit(num1, num2)) {
                System.out.println(" True, The two numbers share at least one common digit.");
            } else {
                System.out.println(" False, The two numbers do not share any common digits.");
            }
            //Close the scanner
            input.close();
        }
        public static boolean hasSharedDigit(int num1, int num2) {
            if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
                return false; // Both numbers must be two-digit numbers
            }

            int digit1Num1 = num1 % 10;
            int digit10Num1 = num1 / 10;
            int digit1Num2 = num2 % 10;
            int digit10Num2 = num2 / 10;

            return (digit1Num1 == digit1Num2 || digit1Num1 == digit10Num2 || digit10Num1 == digit1Num2 || digit10Num1 == digit10Num2);
        }
    }
