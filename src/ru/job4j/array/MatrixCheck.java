package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length - 1; i++) {
            if (board[row][i] != board[row][i + 1]) {
                return false;
            }
        }
        return true;
    }
}
