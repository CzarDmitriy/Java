package ru.job4j;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount - salary == 0) {
            amount = amount + amount * percent;
        }
        return year;
    }
}
