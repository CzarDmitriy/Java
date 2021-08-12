package ru.job4j;

public class Point {
    public static double distance(
            int x1,
            int y1,
            int x2,
            int y2
    ) {

        double subtrX = x2 - x1;
        double subtrY = y2 - y1;

        double powX = Math.pow(subtrX, 2);
        double powY = Math.pow(subtrY, 2);

        double addXY = powX + powY;

        return Math.sqrt(addXY);
    }


    public static void main(String[] args) {
        double result = Point.distance(15, 4, 7, 20);
        System.out.println("result (15, 4) to (7, 20) " + result);
    }
}
//dd
