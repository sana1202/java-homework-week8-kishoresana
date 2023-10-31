package hwprogrammes;
/** Simple Calculator
 *
 */
public class Programme_18_SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator(); // Object creation
        calculator.setFirstNumber(5.0); // Calling setFirstNumber method providing value
        calculator.setSecondNumber(4); // Calling setSecondNumber method providing value
        System.out.println("add= " + calculator.getAdditionResult()); // getting Addition result value
        System.out.println("subtract= " + calculator.getSubtractionResult()); // getting subtraction result value
        calculator.setFirstNumber(5.25); // Calling setFirstNumber method providing different value
        calculator.setSecondNumber(0); // Calling setSecondNumber method providing different value
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // getting multiplication result value
        System.out.println("divide= " + calculator.getDivisionResult()); // getting division result value
    }
    public static class SimpleCalculator { // Static class with two double variables
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() { // Method returning value of first number
            return firstNumber;
        }

        public double getSecondNumber() { // Method returning value of second number
            return secondNumber;
        }

        public void setFirstNumber(double firstNumber) { // Method setting the value of first number
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) { // Method setting the value of second number
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult() { // Method adding and returning values of first and second number
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult() { // Method subtracting and returning values of first and second number
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult() { // Method Multiplying and returning values of first and second number
            return firstNumber * secondNumber;
        }

        public double getDivisionResult() { // Method checking second number value first and returning division result
            // according to if else statement
            if (secondNumber == 0) {

                return this.secondNumber = 0;

            } else {

                return firstNumber / secondNumber;

            }
        }
    }
}

