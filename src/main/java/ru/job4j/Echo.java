package ru.job4j;

public class Echo {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "   " + (char) i);
        }
    }
}
