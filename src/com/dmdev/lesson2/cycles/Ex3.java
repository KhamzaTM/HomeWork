package com.dmdev.lesson2.cycles;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Ex3 {

    public static void main(String[] args) {

        int salary = 600;
        int increaseSalary = 400;
        int expenses = 300;
        int months = 38;
        double invest = 0.1;
        double percent = 0.02;

        double result = calculateCashAccount(salary, increaseSalary, months, expenses, invest);
        System.out.println("Средств на своем счету : " + result + ".");

        double result2 = calculateBrokersAccount(salary, increaseSalary, months, invest, percent);
        System.out.println("Средств на счету брокера: " + result2 + ".");
    }

    public static double calculateCashAccount(int salary, int increaseSalary, int months, int expenses, double invest) {
        double result = (double) salary;
        for (int month = 1; month <= months; month++) {
            result -= (salary * invest) - expenses;
            if (month % 6 == 0) {
                salary += increaseSalary;
            }
        }
        return result;
    }

    public static double calculateBrokersAccount(int salary, int increaseSalary, int months, double invest, double percent) {
        double result = (double) salary;
        for (int month = 1; month <= months; month++) {
            result = (salary - (salary * invest)) * percent;
            if (month % 6 == 0) {
                salary += increaseSalary;
            }
        }
        return result;
    }
}
