package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;

        for (int w = 0; w < word.length; w++) {
            for (int p = 0; p < pref.length; p++) {
                if (word == pref) {
                    result = true;
                }
            }
        }

        return result;
    }
}
