package com.dmdev.lesson1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Ex3 {
    public static double findSquare(int a, int b) {
        return (double) (a * b) * 0.5;
    }

    public static String compareTriangles(double triangle1, double triangle2) {

        if (triangle1 > triangle2) {
            return "Первый треугольник больше второго.";
        } else if (triangle1 < triangle2) {
            return "Первый треугольник меньше второго.";
        } else {
            return "Треугольники равны.";
        }
    }

    public static void main(String[] args) {
        double triangle1 = findSquare(5, 7);
        double triangle2 = findSquare(5, 8);
        System.out.println(compareTriangles(triangle1, triangle2));
    }
}
