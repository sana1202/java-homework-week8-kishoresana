package hwprogrammes;
import java.util.Scanner;
/** Display pattern like Diamond
 *
 */
public class Programme_14_DisplayPatternLikeADiamond {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter the number of rows : ");
            int n = input.nextInt();
            while (n == 0) {
                System.out.println("Please enter an odd number for a proper diamond pattern.");
            }
            printDiamondPattern(n);
            //Close the scanner
            input.close();
        }
        public static void printDiamondPattern(int n) {
            int spaces = n / 2;
            int stars = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                System.out.println();

                if (i <= n / 2) {
                    spaces--;
                    stars += 2;
                } else {
                    spaces++;
                    stars -= 2;
                }
            }
        }
    }
