package ru.job4j.array;

public class FindLop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return i;
            }
        }

        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;

        // Where do I need to write the finish?
        for (int i = start; i < data.length; i++) {
            if (data[i] == el) {
                return i;
            }
        }

        return rst;
    }
}
