package ru.job4j;

public class Args {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Args.plus(100, 500);
        Args.plus(1, 2);
        Args.plus(3, 5);
    }
}
