package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return number != 1;
    }

    public static void main(String[] args) {
        System.out.println("Hi!");
    }
}
