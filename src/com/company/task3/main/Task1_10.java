package com.company.task3.main;

import java.util.Random;

public class Task1_10 {

    public static void solveTask1() {
        //1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.
        int n = 3;
        int m = 4;

        int[][] arr = new int[n][m];

        arr[0][0] = 1;
        arr[n - 2][m - 3] = 1;
        arr[n - 1][m - 1] = 1;

        Print.printArray(arr);

    }

    public static void solveTask2() {
        //2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
        int n = 2;
        int m = 3;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = randomFill();
                arr[i][j] = x;
            }
        }
        Print.printArray(arr);
    }

    public static int randomFill() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        return randomNum;
    }

    public static void solveTask3() {
        //3. Дана матрица. Вывести на экран первый и последний столбцы.
        int n = 2;
        int m = 3;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = randomFill();
                arr[i][j] = x;
            }
        }

        Print.printFirstAndLast(arr);

    }

    public static void solveTask4() {
        //4. Дана матрица. Вывести на экран первую и последнюю строки.
        int m = 3;

        int[][] arr = {{1, 2, 1, 1}, {1, 2, 3, 3}, {1, 2, 2, 2}};

        Print.printFirstAndLastRow(arr, m);
    }

    public static void solveTask5() {
        //5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
        int[][] arr = {{1, 2, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};

        Print.evenIndex(arr);
    }

    public static void solveTask6() {
        //6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        int[][] arr = {{3, 4, 1, 5}, {4, 10, 2, 2}, {3, 3, 3, 3}};

        Print.oddIndex(arr, 3);

    }

    public static void solveTask7() {
        //7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
        int[][] arr = {{-3, 4, -1, 5, 2}, {4, 10, -2, 2, 1}, {3, 3, 3, -3, 8}, {4, 2, 2, 2, 1}, {2, 0, 4, 2, -1}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];
                if (checkNegative(num) && checkOdd(num)) {
                    sum += Math.abs(num);
                }
            }
        }
        System.out.println(sum);
    }

    private static boolean checkNegative(int num) {
        return num < 0;
    }

    private static boolean checkOdd(int num) {
        return num % 2 != 0;
    }

    public static void solveTask8() {
        //8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
        int n = 100;
        int m = 100;

        int[][] arr = new int[n][m];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(5) + 3;
            }
        }
        System.out.println(findRepeatOfSeven(arr));
    }

    private static int findRepeatOfSeven(int[][] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void solveTask9() {
        //9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        int n = 5;
        int m = 5;

        int[][] arr = new int[n][m];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(5) + 3;
            }
        }
        Print.printArray(arr);
        int[] result = findDia(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] findDia(int[][] arr) {
        int[] arrDia = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrDia[i] = arr[i][i];
        }
        return arrDia;
    }

    public static void solveTask10() {
        //10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        int n = 2;
        int m = 5;

        int[][] arr = new int[n][m];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(10);
            }
        }
        Print.printArray(arr);

        int[] arrayRow = getRow(arr, 1);
        for (int i = 0; i < arrayRow.length; i++) {
            System.out.println(arrayRow[i]);
        }
        System.out.println();
        int[] arrayColumn = getColumn(arr, 3);
        for (int i = 0; i < arrayColumn.length; i++) {
            System.out.println(arrayColumn[i]);
        }
    }

    private static int[] getRow(int[][] arr, int k) {
        int[] arrayRow = new int[arr[k].length];
        for (int i = 0; i < arr[k].length; i++) {
            arrayRow[i] = arr[k][i];
        }
        return arrayRow;
    }

    private static int[] getColumn(int[][] arr, int p) {
        int[] arrayColumn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayColumn[i] = arr[i][p];
        }
        return arrayColumn;
    }
}




