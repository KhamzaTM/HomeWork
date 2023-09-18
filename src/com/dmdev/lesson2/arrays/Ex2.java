package com.dmdev.lesson2.arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Ex2 {

    public static void main(String[] args) {
        char[] ch = new char[]{'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int [] numbers = convertNumbers(ch);
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
        findAverage(numbers);
    }

    public static int[] convertNumbers(char[] ch) {
        int[] numbers = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            numbers[i] = ch[i];
        }
        return numbers;
    }

    public static void findAverage(int[] numbers) {

        int n = 0;

        for (int number : numbers) {
            n += number;
        }

        int average = n / numbers.length;

        for (int number : numbers) {
            if (number > average) {
                System.out.println(number);
            }
        }
    }
}
