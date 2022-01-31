package lesson5;

/**
 * Java 1. Homework 5
 *
 * @author Borisov Sergey
 * @version 31.1.2022
 */

class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] =   new Person("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Borisov Sergey Sergeevich", "QA_Engineer", "borisovss@gmail.com", "892312345", 35000, 33);
        persArray[2] = new Person("Lubova Larisa Sergeevna", "QA_manager", "llsergeevna@gmail.com", "892334344", 45000, 42);
        persArray[3] = new Person("Akinov Sergey Vladimirovich", "DEV_Engineer", "ASVladimirovich@gmail.com", "8943312345", 32000, 28);
        persArray[4] = new Person("Kouchev Roman Artemovich", "Product_owner", "KRArtemovich@gmail.com", "8943862345", 50000, 41);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].showInfo();
            }
        }
    }
}