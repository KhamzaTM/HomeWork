package com.dmdev.firsthw;

/**
 * Запустил и протестировал.
 */
public class Main {
    public static void main(String[] args) {
        Ex1.quarter(50);
        System.out.println(Ex2.calculate(24.4, 10.1, '+'));

        double triangle1 = Ex3.square(5, 7);
        double triangle2 = Ex3.square(5, 8);
        System.out.println(Ex3.triangles(triangle1, triangle2));
    }
}