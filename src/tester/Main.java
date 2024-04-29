
package assignment;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        char operator;
        Double number1, number2;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number [0-100]:");
        number1 = input.nextDouble();

        System.out.println("Enter second number [0-100]:");
        number2 = input.nextDouble();

        input.close();
        System.out.println(calculate(operator,number1,number2));

    }

    public static String calculate(char operator, double number1, double number2) {

        double result;
        String print = " ";
        switch (operator) {

            // performs addition between numbers
            case '+':
                if (number1 >= 0 && number1 <= 100 && number2 >= 0 && number2 <= 100) {
                    result = number1 + number2;
                    print = number1 + " + " + number2 + " = " + result;
                } else {
                    print = "The number is out of range";
                }
                break;

            // performs subtraction between numbers
            case '-':
                if (number1 >= 0 && number1 <= 100 && number2 >= 0 && number2 <= 100) {
                    result = number1 - number2;
                    print = number1 + " - " + number2 + " = " + result;
                } else {
                    print = "The number is out of range";
                }
                break;

            // performs multiplication between numbers
            case '*':
                if (number1 >= 0 && number1 <= 100 && number2 >= 0 && number2 <= 100) {
                    result = number1 * number2;
                    print = number1 + " * " + number2 + " = " + result;
                } else {
                    print = "The number is out of range";
                }
                break;

            // performs division between numbers
            case '/':
                if (number1 >= 0 && number1 <= 100 && number2 >= 0 && number2 <= 100) {
                    result = number1 / number2;
                    print = number1 + " / " + number2 + " = " + result;
                } else {
                    print = "The number is out of range";
                }
                break;

            default:
                print = "Invalid operator!";
                break;
        }
        return print;
    }

}
SimpleCalculator.java
Displaying SimpleCalculator.java.