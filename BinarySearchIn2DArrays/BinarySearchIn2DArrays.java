package com.BinarySearchIn2DArrays;

import java.util.Arrays;

public class BinarySearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
        };
        int target = 9;
        int[] ans = BSIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] BSIn2DArray(int[][] arr, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[i][mid]) {
                    end = mid - 1;
                } else if (target > arr[i][mid]) {
                    start = mid + 1;
                } else {
                    result[0] = i;
                    result[1] = mid;
                    return result;
                }
            }
        }return result;
    }
}

