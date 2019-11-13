package com.company.task3.main;

import java.util.Random;

public class Task11_20 {

    public static void solveTask11() {
        //11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево,
        // вторая строка слева направо, третья строка справа налево и так далее.
        int n = 4;
        int m = 5;

        int[][] arr = new int[n][m];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(10);
            }
        }

        Print.printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (checkOdd(i)) {
                Print.fromRightToLeft(arr, i);
            } else {
                Print.fromLeftToRight(arr, i);
            }
        }
    }

    private static boolean checkOdd(int num) {
        return num % 2 != 0;
    }

    public static void solveTask12() {
        //12. Получить квадратную матрицу порядка n:
        int n = 5;

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = i;
        }
        Print.printArray(arr);
    }

    public static void solveTask13() {
        //13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            if (checkOdd(i)) {
                fillOdd(arr, i);
            } else {
                fillOther(arr, i);
            }
        }
        Print.printArray(arr);
    }

    public static void fillOdd(int[][] arr, int i) {
        int n = arr.length;
        int j = 0;
        while (n > 0 && j < arr[i].length) {
            arr[i][j] = n;
            n--;
            j++;
        }
    }

    public static void fillOther(int[][] arr, int i) {
        int n = arr.length;
        int x = 1;
        int j = 0;
        while (x <= n && j < arr[i].length) {
            arr[i][j] = x;
            x++;
            j++;
        }
    }

    public static void solveTask14() {
        //14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[n - 1][i] = n;
            n--;
        }

        Print.printArray(arr);
    }

    public static void solveTask15() {
        //15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = n;
            n--;
        }

        Print.printArray(arr);
    }

    public static void solveTask16() {
        //16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];
        int counter = 1;
        int i = 0;

        while (counter <= n && i < arr.length) {
            arr[i][i] = counter * (counter + 1);
            counter++;
            i++;
        }

        Print.printArray(arr);
    }

    public static void solveTask17() {
        //17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else if (i == n - 1 || j == n - 1) {
                    arr[i][j] = 1;
                }
            }
        }
        Print.printArray(arr);
    }

    public static void solveTask18() {
        //18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = i + 1;
            }
        }
        Print.printArray(arr);
    }

    public static void solveTask19() {
        //19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length - i; j++) {
                arr[i][j] = 1;
                arr[arr.length - 1 - i][j] = 1;
            }
        }
        Print.printArray(arr);
    }

    public static void solveTask20() {
        //20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = 1;
                arr[i][arr.length - 1 - j] = 1;
                arr[arr.length - 1 - i][j] = 1;
                arr[arr.length - 1 - i][arr.length - 1 - j] = 1;
            }
        }
        Print.printArray(arr);
    }

    public static void solveTask21() {
        //21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            int count = i;
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = n - count;
                count--;
            }
        }
        Print.printArray(arr);
    }

    public static void solveTask22() {
        //22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            int count = n;
            for (int j = i; j <= arr[i].length - 1; j++) {
                arr[i][arr.length - j - 1] = count;
                count--;
            }
        }
        Print.printArray(arr);
    }

    public static void solveTask23(){
        //23. Сформировать квадратную матрицу порядка N по правилу:
        int n = 6;
        double [][] arr = new double[n][n];
        int counter = 0;

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Math.sin((i * i - j * j) / n);
                if(arr[i][j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void solveTask24(){
        //24. Дан линейный массив x , x ,, x , x . Получить действительную квадратную матрицу 12 n−1n
        //порядка n:
        int n = 6;
        double [][] arr = new double[n][n];
        int x = 2;
        int p = 0;

        for (int i = 0; i < arr.length; i++) {
            p++;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.pow(x, p);
            }
        }
        Print.printArrayDouble(arr);
    }

    public static void solveTask25(){
        //25. Получить квадратную матрицу порядка n:
        int n = 6;
        int[][] arr = new int[n][n];
        int x = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = x + 1;
                x++;
            }
        }
        Print.printArray(arr);
    }

}
