package hwprogrammes;

import java.util.Scanner;

/** 2. Read the numbers from the console entered by the User and print the minimum and maximum number the user has entered
 *
 */
public class Programme_2_ReadTheNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        int largeNumber = Integer.MIN_VALUE; // Integer declaration to take minimum possible allowed value
        int smallNumber = Integer.MAX_VALUE; // Integer declaration to take maximum possible allowed value
        int number;                         // Integer declaration to assign value later for output

        do { // keeps asking user for number until they enter -100
            System.out.print("Please enter a number, or enter -100 to exit the loop: ");
            number = input.nextInt(); // storing values in integer number
            if (number == -100) { // will break out of the loop if -100 has been entered
                break;
            } else {
                if (number > largeNumber) {
                    largeNumber = number; // assigning largest entered number value to number integer
                } else {
                    if (number < smallNumber) {
                        smallNumber = number; // assigning smallest entered number value to number integer
                    }
                }
            }
        } while (number != -100); // will print out large and small numbers if number does not equal to -100
        System.out.println("The smallest number is: " + smallNumber);
        System.out.println("The largest number is: " + largeNumber);
        // Close the Scanner
        input.close();
    }
}
