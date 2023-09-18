package com.dmdev.lesson2.arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Ex3 {


    public static void main(String[] args) {

        int[] array = {-4, 0, 1, 9, 0, -18, 3};

        int[][] ints = completionArray(array);

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] completionArray(int[] array) {

        int[][] result = new int[3][];
        int indexNegative = 0;
        int indexZero = 0;
        int indexPositive = 0;

        for (int num : array) {
            if (num < 0) {
                indexNegative++;
            } else if (num == 0) {
                indexZero++;
            } else {
                indexPositive++;
            }
        }

        result[0] = new int[indexNegative];
        result[1] = new int[indexZero];
        result[2] = new int[indexPositive];

        indexNegative = 0;
        indexZero = 0;
        indexPositive = 0;

        for (int num : array) {
            if (num < 0) {
                result[0][indexNegative++] = num;
            } else if (num == 0) {
                result[1][indexZero++] = num;
            } else {
                result[2][indexPositive++] = num;
            }
        }
        return result;
    }
}
