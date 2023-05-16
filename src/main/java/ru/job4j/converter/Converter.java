package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 90;
    }

    public static float rubleToDollar(float value) {
        return value / 80;
    }

    public static void main(String[] args) {
        float in = 160;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("160 rubles are 2. Test result : " + passed);
    }
}