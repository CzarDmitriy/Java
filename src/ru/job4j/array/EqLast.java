package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] rigth) {

        for (int i = 0; i < left.length; i++) {
            if (left[2] == rigth[2]) {
                return left[left.length - 1] == rigth[rigth.length - 1];
            }
        }

        return false;
    }
}
