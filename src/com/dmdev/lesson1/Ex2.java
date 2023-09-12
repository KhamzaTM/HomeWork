package com.dmdev.lesson1;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Ex2 {

    private final static char ADDITION = '+';
    private final static char SUBTRACTION = '-';
    private final static char MULTIPLICATION = '*';
    private final static char DIVISION = '/';
    private final static char MODULUS = '%';

    public static double calculate(double operand1, double operand2, char operation) {

        return switch (operation) {
            case ADDITION -> add(operand1, operand2);
            case SUBTRACTION -> substract(operand1, operand2);
            case MULTIPLICATION -> multiply(operand1, operand2);
            case DIVISION -> divide(operand1, operand2);
            case MODULUS -> module(operand1, operand2);
            default -> throw new IllegalArgumentException("The operation is invalid");
        };
    }

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double substract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double divide(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("The operation is invalid");
        }
        return operand1 / operand2;
    }

    public static double module(double operand1, double operand2) {
        return operand1 % operand2;
    }

    public static void main(String[] args) {
        System.out.print(Ex2.calculate(24.4, 5, '/'));
    }
}
