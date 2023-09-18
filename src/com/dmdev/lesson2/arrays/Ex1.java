package com.dmdev.lesson2.arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Ex1 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, -6, 3, 2, -9, 0, -123};
        numbers = removeNegativeNumbers(numbers);
        for (int n : numbers) {
            System.out.println(n);
        }
        multiplyNumbers(numbers);
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public static int[] removeNegativeNumbers(int numbers[]) {
        int[] numbers2 = new int[numbers.length];
        int j = 0;
        for (int n : numbers) {
            if (n >= 0) {
                numbers2[j] = n;
                j++;
            }
        }
        return Arrays.copyOf(numbers2, j);
    }

    public static int[] multiplyNumbers(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers.length;
        }
        return numbers;
    }
}