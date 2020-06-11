package com.tenzin.lesson2;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Jun 1, 2020
 */
public class IntMath {

    public static void operation() {

        String calculateMore;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the operation you want. 1) Plus 2) Minus 3) Multiply 4)Divide");
            int userChoice = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter the first number");
            int operand1 = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter the second number");
            int operand2 = Integer.parseInt(sc.nextLine());
            MathOperator operator = null;
            switch (userChoice) {
                case 1:
                    operator = MathOperator.PLUS;
                    break;
                case 2:
                    operator = MathOperator.MINUS;
                    break;
                case 3:
                    operator = MathOperator.MULTIPLY;
                    break;
                case 4:
                    operator = MathOperator.DIVIDE;
                    break;
            }

            System.out.println("The answer is : " + calculate(operator, operand1, operand2));
            System.out.println("Do you want to do another calculations? (y/n)");
            calculateMore = sc.nextLine();
           

        } while (calculateMore.equals("y"));
    }

    public static int calculate(MathOperator operator, int operand1, int operand2) {

        switch (operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {

        operation();

    }

}
