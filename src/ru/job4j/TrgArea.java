package ru.job4j;

public class TrgArea {

    public static double area(double a, double b, double c) {
        byte p = 6 / 2;
        double action1 = p - a;
        double action2 = p - b;
        double action3 = p - c;
        double action4 = action1 + action2 + action3;

        return Math.sqrt(action4);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

}
