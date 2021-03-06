package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculation {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divisionAndSubtraction(double first, double second) {
        return division(first, second) + subtraction(first, second);
    }

    public static double calculation(double first, double second) {
        return addAndMultiply(first, second) + divisionAndSubtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divisionAndSubtraction(33, 12));
        System.out.println("Результат расчета равен: " + calculation(230, 23.75));
    }
}
