package ru.job4j.calculator;

public class Converter {

    public static void main(String[] args) {
        int ruble = 560;
        System.out.println("in " + ruble + " RUB " + Converter.rublesToUSD(ruble) + " USD");
        System.out.println("in " + ruble + " RUB " + Converter.rublesToEUR(ruble) + " EUR");

        int outUSD = 8;
        int outEUR = 7;

        System.out.println("RUB to USD. Test is passed: " + (Converter.rublesToUSD(ruble) == outUSD));
        System.out.println("RUB to EUR. Test is passed: " + (Converter.rublesToEUR(ruble) == outEUR));
    }

    private static int rublesToEUR(int ruble) {
        return ruble / 80;
    }

    private static int rublesToUSD(int ruble) {
        return ruble / 70;
    }
}
