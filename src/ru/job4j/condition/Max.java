package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println("Максимальное из 5 и 6: " + max(5, 6));
    }

    public static int max(int first, int second) {
        return first > second ? first : second;
    }
}
