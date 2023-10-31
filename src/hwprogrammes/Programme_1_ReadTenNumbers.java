package hwprogrammes;
/** 1. Read 10 numbers from the console entered by the user and print the sum of those
 numbers.
 /* *
 *
 */

import java.util.Scanner;

public class Programme_1_ReadTenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        int count = 1; // Integer Declaration
        int sum = 0;

        while (count <= 10) { // While loop ensuring only 10 inputs are allowed
            System.out.println("Please Enter number " + count); // Prompting user to enter numbers in sequence
            boolean validateNumber = input.hasNextInt(); // Checking User only enters numbers
            if (validateNumber) {
                int number = input.nextInt();
                sum += number; // Assignment operator for adding the numbers inserted
                count++; // incrementing count value displayed everytime user enters a number
            } else {
                System.out.println("Invalid number!"); // informing the user they have not entered a number
            }
            // Asking for new user input
            input.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum); // Printing the total of all 10 numbers entered
        // Close the Scanner
        input.close();
    }
}

