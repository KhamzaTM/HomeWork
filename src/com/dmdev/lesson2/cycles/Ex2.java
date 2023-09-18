package com.dmdev.lesson2.cycles;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * 
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Ex2 {

    public static void main(String[] args) {

        int value = 4321;
        int result = reverse(value);
        System.out.println(result);
    }

    public static int reverse(int value) {
        int result = 0;
        int j = 0;
        for (int i = value; i > 0; i /= 10) {
            j = i % 10;
            result = result * 10 + j;
        }
        return result;
    }
}
