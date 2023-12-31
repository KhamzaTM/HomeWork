package com.dmdev.lesson1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 *
 * Протестировать функцию в main.
 */
public class Ex1 {

    public static void quarter(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("Число попадает в первую четверть часа");
        } else if (minutes >= 15 && minutes <= 29) {
            System.out.println("Число попадает во вторую четверть часа");
        } else if (minutes >= 30 && minutes <= 44) {
            System.out.println("Число попадает в третью четверть часа");
        } else {
            System.out.println("Число попадает в четвертую четверть часа");
        }
    }
}
