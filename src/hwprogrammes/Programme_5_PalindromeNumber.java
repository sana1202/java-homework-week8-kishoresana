package hwprogrammes;

import java.util.Scanner;

/** Palindrome Number
 *
 */
public class Programme_5_PalindromeNumber {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
            //Close the scanner
            input.close();
        }
        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return originalNumber == reversedNumber;
        }
    }
