package ru.job4j.condition;

public class Games {

    public static void permission(boolean allowedByParents, boolean hasMoney) {
        if (allowedByParents && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't go.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
