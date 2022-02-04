package lesson7;

public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public boolean isEnoughFoodInPlate(int food) {
        return this.food >= food;
    }

    public void increaseFood(int newFood) {
        this.food += newFood;
        System.out.println("new food: " + newFood);
    }

    @Override
    public String toString() {
        return "food in plate: " + this.food;
    }
}
