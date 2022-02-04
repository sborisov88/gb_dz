package lesson7;

/**
 * Java 1. Homework 7
 *
 * @author Borisov Sergey
 * @version 04.02.2022
 */

class Lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1);
        Plate plate = new Plate(10);
        System.out.println(cat);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);

        Cat[] catsArray = new Cat[3];
        catsArray[0] =   new Cat("Murzik", 25);
        catsArray[1] = new Cat("Vaska", 4);
        catsArray[2] = new Cat("Ruzhik", 5);

        for (Cat cats : catsArray) {
            System.out.println(cats);
            cats.eat(plate);
            System.out.println(plate);
        }

        plate.increaseFood(5);
        System.out.println(plate);
    }
}