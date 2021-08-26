package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;

        for (int i = 0; i < data.length; i++) {

            if (data[0] != data[1]) {
                result = false;
                break;
            } else if (data[0] != data[2]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
