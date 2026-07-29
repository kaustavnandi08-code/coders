import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, %, !): ");
        char operator = sc.next().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case '!':
                if (num1 >= 0) {
                    result = 1;
                    for (int i = 1; i <= num1; i++) {
                        result *= i;
                    }
                } else {
                    System.out.println("Error! Factorial is not defined for negative numbers.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println(result);
    }
}
