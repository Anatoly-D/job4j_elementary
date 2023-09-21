package ru.job4j.condition;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("Please input the password:");
            password = scanner.nextInt();
        } while (password != 555);
        System.out.println("The password was entered correctly!");
    }
}
