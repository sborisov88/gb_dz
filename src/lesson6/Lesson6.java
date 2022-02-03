package lesson6;

/**
 * Java 1. Homework 6
 *
 * @author Borisov Sergey
 * @version 03.02.2022
 */

class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 200, 0);
        Dog dog = new Dog("Sharik", 500 ,10);
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(15));
            System.out.println(animal.run(250));
            System.out.println(animal.run(700));
            System.out.println(animal.swim(2));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println("Count of animals:" + Animal.getCount());
    }
}