package ru.job4j.recap;

import java.util.Random;

public class Recap {
    public static void main(String[] args) {
        int[] counter = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(counter);
        int[] array = generateArray(10);
        printArray(array);
        swap(array, 3, 7);
        printArray(array);
    }

    static int[] generateArray(int size) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
