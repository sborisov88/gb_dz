package lesson1;

/**
 *Java 1. Homework 1
 *
 * @author Borisov Sergey
 * @version 17.1.2022
*/

class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void compareNumbers() {
        int a = 62;
        int b = 6;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    static void printColor() {
        int value = 210;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void checkSumSign() {
        int a = 2;
        int b = -2;
        System.out.println((a+b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
