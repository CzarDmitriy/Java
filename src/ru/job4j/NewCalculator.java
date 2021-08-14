package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class NewCalculator {
    public static double addAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + addAndMultiply(10, 20));
    }
}
