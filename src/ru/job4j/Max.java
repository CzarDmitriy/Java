package ru.job4j;

public class Max {

    public static int max(int left, int right) {

        int result = left < right ? right : left;

        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(128, 400);
        System.out.println(result);
    }
}

/*
Value: t = 12; h = 22; x = 33;
Declare : t + h + x;

if (x > t && h) output: x
else output: less

finish

Clould you explain to me in more detail? I just see the diagram like this

 */

/*
 Conjunction:
 eggs - true, pan - true: true
 eggs - true, pan - false:
 */
