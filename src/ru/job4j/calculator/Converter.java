package ru.job4j.calculator;

public class Converter {

    public static void main(String[] args) {
        float ruble = 200f;

        System.out.println("in " + ruble + " RUB " + Converter.rublesToUSD(ruble) + " USD");
        System.out.println("in " + ruble + " RUB " + Converter.rublesToEUR(ruble) + " EUR");
    }

    private static float rublesToEUR(float ruble) {
        return ruble / 80;
    }

    private static float rublesToUSD(float ruble) {
        return ruble / 70;
    }
}
