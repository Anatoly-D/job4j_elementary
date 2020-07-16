package ru.job4j.array;

import java.util.Random;

public class GenerateArray {
    public static int[] generateArray(int length) {
        int[] resultArray = new int[length];
        for (int i = 0; i < length; i++) {
            resultArray[i] = (int) (100 * Math.random());
        }
        return resultArray;
    }

    public static void printArrayFormat(int[] data) {
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + (i == data.length - 1 ? "}\n" : ", "));

        }
    }

    public static void main(String[] args) {
        int[] testArray = generateArray(30);
        printArrayFormat(testArray);
        SortSelected.sort(testArray);
        printArrayFormat(testArray);
    }
}
