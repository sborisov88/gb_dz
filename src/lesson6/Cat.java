package lesson6;

class Cat extends Animal {
    public Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public String swim(int swimDistance) {
        return name + " плавать не умеет";
    }
}

