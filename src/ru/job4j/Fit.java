package ru.job4j;

public class Fit {

    public static double manWeight(short heigth) {
        return (heigth - 100) * 1.15;
    }

    public static double womanWeight(short heigth) {
        return (heigth - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 183;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 183 is " + man);
        short womanHeight = 170;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman 170 is " + woman);
    }
}
