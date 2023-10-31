package hwprogrammes;

import java.util.Scanner;

/** First and last digit sum
 *
 */
public class Programme_7_FirstAndLastDigitSum {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            int sum = sumFirstAndLastDigit(number);

            System.out.println("The sum of the first and last digits of the number is: " + sum);
            //Close the scanner
            input.close();
        }
        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                number = -number; // Convert negative number to positive
            }

            int lastDigit = number % 10;
             int firstDigit = 0;

            while (number > 0) {
                firstDigit = number % 10;
                number /= 10;
            }

            return firstDigit + lastDigit;
        }
    }
