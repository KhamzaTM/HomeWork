package com.dmdev.lesson1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class Ex1 {

    public static void findQuarter(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.print("Число попадает в первую четверть часа");
        } else if (minutes >= 15 && minutes <= 29) {
            System.out.print("Число попадает во вторую четверть часа");
        } else if (minutes >= 30 && minutes <= 44) {
            System.out.print("Число попадает в третью четверть часа");
        } else if (minutes >= 45 && minutes <= 59) {
            System.out.print("Число попадает в четвертую четверть часа");
        } else {
            throw new IllegalArgumentException("The operation is invalid");
        }
    }

    public static void main(String[] args) {
        findQuarter(59);
    }
}
