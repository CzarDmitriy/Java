public class rubTo {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 73;
    }

    public static void main(String[] args) {
        //Euro
        float euro = rubTo.rubleToEuro(140);
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = rubTo.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are 2.0 Test result : " + passedEuro);


        //Dollar
        double dollar = rubTo.rubleToDollar(300);
        double inDollar = 300;
        double expectedDollar = 4.109589041095891;
        double outDollar = rubTo.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("5000 rubles are " + dollar + " dollars.");
        System.out.println("5000 rubles are 9 Test result : " + passedDollar);

    }

}
