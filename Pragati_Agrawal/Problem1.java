// Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
// Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
// Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.println("which type of opertaion you want to perform: ");
        System.out.println("1. Addition: ");
        System.out.println("2. Subtraction: ");
        System.out.println("3. Multiplication: ");
        System.out.println("4. Division: ");
        String operation = sc.next();
        sc.close();
        switch (operation.toLowerCase()) {
            case "addition":
                System.out.println("Result: " + (a + b));
                break;
            case "subtraction":
                System.out.println("Result: " + (a - b));
                break;
            case "multiplication":
                System.out.println("Result: " + (a * b));
                break;
            case "division":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    throw new ArithmeticException("Division by zero!");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}