package com.BinarySearchIn2DArrays;

import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 50;
        int[] ans = searchInMatrix(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[row].length - 1;
        while (row < matrix.length && col > 0) {
            if (target == matrix[row][col]) {
                return new int[]{row, col};
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
