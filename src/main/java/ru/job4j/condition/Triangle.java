package ru.job4j.condition;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Triangle with 2.0 2.0 2.0 exists: " + exists(2.0, 2.0, 2.0));
    }

    public static boolean exists(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }
}
