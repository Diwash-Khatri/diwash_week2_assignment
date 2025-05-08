import java.util.Scanner;

public class QnoEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid operator!");
            scanner.close();
            return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
