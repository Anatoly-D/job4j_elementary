package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public double distance3d(Point point) {
        return Math.sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2) + pow(this.z - point.z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(1, 3);
        Point second = new Point(4, 6);
        double distance = first.distance(second);
        System.out.println("Distance is: " + distance);
    }
/*    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] args) {
        System.out.println("Result for (0,1) and 5,6) is " + Point.distance(0, 1, 5, 6));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }*/
}
