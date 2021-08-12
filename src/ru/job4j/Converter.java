package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 60;
    }

    public static float rubleToDollar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(500);

        System.out.println("500 rubles are " + dollar + " euro.");
        System.out.println("140 rubles are " + euro + " euro.");
    }

}
