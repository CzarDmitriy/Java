package ru.job4j;

public class Max {

    public static int max(int left, int right) {

        int result = left > right ? left : right;

        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(128, 400);
        System.out.println(result);
    }
}

