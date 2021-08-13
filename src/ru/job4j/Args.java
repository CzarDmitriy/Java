package ru.job4j;

public class Args {
    public static void plus(
            int hundred,
            int fiveHundred,
            int four,
            int two,
            int three,
            int five
    ) {

        int result1 = hundred + fiveHundred;
        int result2 = four + two;
        int result3 = three + five;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static void main(String[] args) {
        Args.plus(100, 500, 4, 2, 3, 5);
    }
}
