package hwprogrammes;
import java.util.Scanner;
/** Display right angle triangle of @ using nested for loops
 *
 */
public class Programme_8_DisplayRightAngleTriangle {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter the number of rows for the triangle: ");
            int numRows = input.nextInt();

            displayRightAngleTriangle(numRows);
            //Close the scanner
            input.close();
        }
        public static void displayRightAngleTriangle(int numRows) {
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
    }
