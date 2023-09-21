package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = first > second ? first : second;
        return max > third ? max : third;
    }

    public static void main(String[] args) {
        System.out.println("Max of 2, 6, 3 is: " + max(2, 6, 3));
    }
}
