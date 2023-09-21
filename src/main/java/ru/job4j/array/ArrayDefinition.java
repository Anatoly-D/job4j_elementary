package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Size of ages: " + ages.length);
        System.out.println("Size of surnames: " + surnames.length);
        System.out.println("Size of prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Anatoly";
        names[1] = "Sergey";
        names[2] = "Dima";
        names[3] = "Katya";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
