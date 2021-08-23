package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {

        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Jack";
        names[1] = "Steve";
        names[2] = "Lee";
        names[3] = "Ann";

        System.out.println("Массив ages равен: " + ages.length);
        System.out.println("Массив surname равен: " + surnames.length);
        System.out.println("Массив prices равен: " + prices.length);

        System.out.println("Name: " + names[0]);
        System.out.println("Name: " + names[1]);
        System.out.println("Name: " + names[2]);
        System.out.println("Name: " + names[3]);

    }
}