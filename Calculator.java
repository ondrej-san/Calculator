import java.util.Scanner;

public class Calculator {
    
    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    
    // Method to calculate modulo
    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot perform modulo with zero!");
            return 0;
        }
        return a % b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        
        System.out.println("========================================");
        System.out.println("       Welcome to Simple Calculator      ");
        System.out.println("========================================");
        
        while (continueCalculating) {
            try {
                // Input first number
                System.out.print("\nEnter first number: ");
                double num1 = scanner.nextDouble();
                
                // Input operator
                System.out.print("Enter operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);
                
                // Input second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                boolean validOperator = true;
                
                // Perform calculation based on operator
                switch (operator) {
                    case '+':
                        result = add(num1, num2);
                        System.out.println("\n" + num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        System.out.println("\n" + num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        System.out.println("\n" + num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        if (num2 != 0) {
                            System.out.println("\n" + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                    case '%':
                        result = modulo(num1, num2);
                        if (num2 != 0) {
                            System.out.println("\n" + num1 + " % " + num2 + " = " + result);
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator! Please use +, -, *, /, or %");
                        validOperator = false;
                }
                
                // Ask if user wants to continue
                if (validOperator) {
                    System.out.print("\nDo you want to perform another calculation? (yes/no): ");
                    String response = scanner.next().toLowerCase();
                    continueCalculating = response.equals("yes") || response.equals("y");
                }
                
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter valid numbers and operator.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        
        System.out.println("\nThank you for using the calculator. Goodbye!");
        scanner.close();
    }
}
