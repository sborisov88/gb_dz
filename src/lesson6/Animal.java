package lesson6;

interface IAnimal {

    String run(int runDistance);
    String swim(int swimDistance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected static int count = 0;
    protected int runLimit;
    protected int swimLimit;

    Animal (String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String run(int runDistance) {
        if (runDistance > runLimit) {
            return name + " не сможет пробежать " + runDistance + "м.";
        } else {
            return name + " сможет пробежать " + runDistance + "м.";
        }
    };

    @Override
    public String swim(int swimDistance) {
        if (swimDistance > swimLimit) {
            return name + " не сможет проплыть " + swimDistance + "м.";
        } else {
            return name + " сможет проплыть " + swimDistance + "м.";
        }
    };

    @Override
    public String toString() {
        return "ограничения для " + name + " по бегу:" + runLimit + " плавание:" + swimLimit;
    }
}
