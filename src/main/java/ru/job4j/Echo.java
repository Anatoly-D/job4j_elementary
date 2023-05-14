package ru.job4j;

public class Echo {
    public static void main(String[] args) {
        int a = 5;
        float b = 3.4F;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        b += a;
        System.out.println(b);
    }
}
