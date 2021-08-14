package ru.job4j;

public class Weight {

    public static double manWeight(short heightMan) {
        return (heightMan * 4.0 / 2.54 - 128) * 0.453;
    }

    public static double womanWeight(short heightWoman) {
        return (heightWoman * 3.5 / 2.54 - 108) * 0.453;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 175;
        double man = Weight.manWeight(heightMan);
        double woman = Weight.womanWeight(heightWoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 175 is " + woman);
    }

}

