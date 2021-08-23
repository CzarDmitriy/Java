package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] date, int el) {
        int rst = -1;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
