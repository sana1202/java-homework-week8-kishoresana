package hwprogrammes;
import java.util.Scanner;
/** Write a program to input any number and check if it Armstrong number or not
 *
 */
public class Programme_10_ArmstrongNumber {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (isArmstrongNumber(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
            //Close the scanner
            input.close();
        }
        public static boolean isArmstrongNumber(int number) {
            int originalNumber, remainder, result = 0;
            originalNumber = number;

            // Calculate the number of digits in the number
            int n = String.valueOf(number).length();

            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, n);
                originalNumber /= 10;
            }

            return result == number;
        }
    }
