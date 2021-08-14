package ru.job4j;

public class Currency {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 73;
    }

    public static void main(String[] args) {
        //Euro
        float euro = Currency.rubleToEuro(140);
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Currency.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are 2.0 Test result : " + passedEuro);


        //Dollar
        float dollar = Currency.rubleToDollar(300);
        float inDollar = 300;
        float expectedDollar = 4.109589f;
        float outDollar = Currency.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("5000 rubles are " + dollar + " dollars.");
        System.out.println("5000 rubles are 9 Test result : " + passedDollar);

    }

}
