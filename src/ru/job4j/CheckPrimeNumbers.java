package ru.job4j;

public class CheckPrimeNumbers {
    public static int calc(int finish) {
        int count = 0;
        for (int numbers = 2; numbers <= finish; numbers++) {
            if (CheckPrimeNumber.check(numbers)) {
            count++;
            }
        }
        return count;
    }
}
