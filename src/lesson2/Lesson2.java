package lesson2;

/**
 *Java 1. Homework 2
 *
 * @author Borisov Sergey
 * @version 17.1.2022
 */

 class Lesson2 {
     public static void main(String[] args) {
         System.out.println(between10and20(10,14));
         isPositiveOrNegative(6);
         System.out.println(isNegative(-4));
         printWordNTimes("hello", 5);
         System.out.println(isLeapYear(1988));
     }

     static boolean between10and20(int x1, int x2) {
         return (((x1+x2) <= 20) && ((x1+x2) >= 10));
     }

     static void isPositiveOrNegative(int x) {
         if (x>=0) {
             System.out.println("Positive");
         } else {
             System.out.println("Negative");
         }
     }

     static boolean isNegative(int x) {
         if (x<0) {
             return true;
         } else {
             return false;
         }
     }

     static void printWordNTimes(String word, int times) {
         for (int i = 0; i < times; i++) {
             System.out.println(word);
         }
     }

     static boolean isLeapYear(int year) {
         if (year % 4 != 0) {
             return false;
         } else if (year % 400 == 0) {
             return true;
         } else if (year % 100 == 0) {
             return false;
         } else {
             return true;
         }
     }
 }
