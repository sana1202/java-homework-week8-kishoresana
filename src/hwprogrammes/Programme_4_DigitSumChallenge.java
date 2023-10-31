package hwprogrammes;

import java.util.Scanner;

// Digital Sum Challenge
public class Programme_4_DigitSumChallenge {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int sum = calculateDigitSum(number);
            System.out.println("The sum of the digits in the number is: " + sum);
            //Close the scanner
            input.close();
        }
        public static int calculateDigitSum(int number) {
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            return sum;
        }
    }

