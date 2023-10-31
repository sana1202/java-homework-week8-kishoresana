package hwprogrammes;
import java.util.Scanner;
/** Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 *
 */
public class Programme_9_PrintFibonacciNumberSequence {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.print("Enter the number of terms for the Fibonacci sequence: ");
            int numTerms = scanner.nextInt();

            printFibonacciSequence(numTerms);
            //Close the scanner
            scanner.close();
        }
        public static void printFibonacciSequence(int numTerms) {
            int firstTerm = 0;
            int secondTerm = 1;

            System.out.println("Fibonacci Sequence:");

            for (int i = 1; i <= numTerms; i++) {
                System.out.print(firstTerm + " ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
