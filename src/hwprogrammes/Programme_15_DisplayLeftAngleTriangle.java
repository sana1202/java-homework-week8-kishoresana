package hwprogrammes;
import java.util.Scanner;
/** Display left angle Triangle
 *
 */
public class Programme_15_DisplayLeftAngleTriangle {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter the number of rows for the triangle: ");
            int numRows = input.nextInt();

            printLeftAngleTriangle(numRows);
            //Close the scanner
            input.close();
        }
        public static void printLeftAngleTriangle(int numRows) {
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
