package lesson2;
 class Lesson2 {
     public static void main(String[] args) {
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
         if (x<0)
             return true;
         else
             return false;
     }

     static void printWordNTimes(String word, int times) {
         for (int i = 0; i < times; i++) {
             System.out.println(word);
         }
     }

 }
