package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 0; i <= number; i++) {
            if ((number % 5) == 0) {
                break;
            } else if ((number % 4) == 0) {
                prime = false;
                break;
            } else if ((number % 1) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
