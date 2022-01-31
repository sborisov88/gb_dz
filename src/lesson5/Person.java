package lesson5;

class Person {
    private String name;
    private String post;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String post, String mail, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void showInfo() {
        System.out.println("Person: " + name + ", " + post + ", " + mail + ", " + phone + ", " + salary + ", " + age);
    }
}
