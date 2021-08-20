package ru.job4j;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                day = 1;
                name = "Monday";
                break;
            case 2:
                day = 2;
                name = "Tuesday";
                break;
            case 3:
                day = 3;
                name = "Wednesday";
                break;
            case 4:
                day = 4;
                name = "Thursday";
                break;
            case 5:
                day = 5;
                name = "Friday";
                break;

            case 6:
                day = 6;
                name = "Saturday";
                break;

            case 7:
                day = 7;
                name = "Sunday";
                break;

            default:
                name = "Error";
        }
        return name;
    }
}
