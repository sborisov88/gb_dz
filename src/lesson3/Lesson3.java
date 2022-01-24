package lesson3;

import java.util.Arrays;

/**
 *Java 1. Homework 3
 *
 * @author Borisov Sergey
 * @version 24.1.2022
 */

 class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        createSomeArray(4, 2);
    }

    static void invertArray() {
        int[] arr = { 1, 1, 0, 1, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-1-i] = 1;
        }
        //далее код для отладки
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 1) arr[i][j] = 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                if (j == arr.length-1) {
                    System.out.println();
                }
            }
        }
    }

    static void createSomeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}