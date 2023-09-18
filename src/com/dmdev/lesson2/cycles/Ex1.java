package com.dmdev.lesson2.cycles;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Ex1 {

    public static void main(String[] args) {
        int number = 5637841;
        int result = evenNumbers(number);
        System.out.println(result);
        int result2 = oddNumbers(number);
        System.out.println(result2);
    }

    public static int evenNumbers(int number) {
//      Функция считает количество четных чисел.
        int result = 0;
        int j = 0;

        for (int i = number; i > 0; i /= 10) {
            result = i % 10;
            if (result % 2 == 0) {
                j++;
            }
        }
        return j;
    }

    public static int oddNumbers(int number) {
//      Функция считает количество нечетных чисел.
        int result = 0;
        int j = 0;

        for (int i = number; i > 0; i /= 10) {
            result = i % 10;
            if (result % 2 != 0) {
                j++;
            }
        }
        return j;
    }
}