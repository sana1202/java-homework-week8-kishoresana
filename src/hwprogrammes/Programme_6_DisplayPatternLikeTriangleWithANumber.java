package hwprogrammes;

import java.util.Scanner;

/** write a Java program to display the pattern like a triangle with a number
 *
 */
public class Programme_6_DisplayPatternLikeTriangleWithANumber {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter the number of rows for the pattern: ");
            int numRows = input.nextInt();

            printNumberTriangle(numRows);
            //Close the scanner
            input.close();
        }
        public static void printNumberTriangle(int numRows) {
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

