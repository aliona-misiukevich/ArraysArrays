package com.company.task3.main;

public class Print {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayDouble(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printFirstAndLast(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            {
                System.out.print(arr[i][0] + " ");
                System.out.print(arr[i][arr[i].length - 1] + " ");
            }
            System.out.println();
        }
    }

    public static void printFirstAndLastRow(int[][] arr, int m) {
        for (int j = 0; j <= m; j++) {
            System.out.print(arr[0][j] + " ");
            System.out.print(arr[arr.length - 1][j] + " ");
        }
        System.out.println();
    }

    public static void evenIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= arr[i].length - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void oddIndex(int[][] arr, int m) {
        for (int j = 0; j <= m; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (arr[0][j] > arr[arr.length - 1][j]) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void fromLeftToRight(int[][] arr, int i){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
    }
    public static void fromRightToLeft(int[][] arr, int i){
        for (int j = arr[i].length - 1; j >= 0; j--) {
            System.out.print(arr[i][j] + " ");
        }
    }
}
