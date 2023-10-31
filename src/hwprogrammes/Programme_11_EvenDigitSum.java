package hwprogrammes;
import java.util.Scanner;
/** Even Digit Sum
 *
 */
public class Programme_11_EvenDigitSum {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            long number = input.nextLong();

            long evenDigitSum = getEvenDigitSum(number);
            System.out.println("The sum of even digits in the number is: " + evenDigitSum);
            //Close the scanner
            input.close();
        }
        public static long getEvenDigitSum(long number) {
            long sum = 0;

            while (number > 0) {
                long digit = number % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                number /= 10;
            }

            return sum;
        }
    }
