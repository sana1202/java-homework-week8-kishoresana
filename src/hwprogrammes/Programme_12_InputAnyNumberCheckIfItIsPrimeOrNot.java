package hwprogrammes;
import java.util.Scanner;
/** Write a program to input any number and check if it is prime or not
 *
 */
public class Programme_12_InputAnyNumberCheckIfItIsPrimeOrNot {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
            //Close the scanner
            input.close();
        }
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }

            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }

            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }
    }
