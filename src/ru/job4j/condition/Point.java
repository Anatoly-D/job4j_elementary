package ru.job4j.condition;

public class Point {

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] args) {
        System.out.println("Result for (0,1) and 5,6) is " + Point.distance(0, 1, 5, 6));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
