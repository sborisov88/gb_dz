package lesson7;

class Cat {

    private String name;
    private int appetite;
    private boolean isFull;

    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (this.isFull == true) {
            System.out.println(this.name + " is already full and happy");
        }
        if ((this.isFull == false) && (plate.isEnoughFoodInPlate(appetite)) == true) {
            plate.decreaseFood(appetite);
            this.isFull = true;
            System.out.println(this.name + " is full and happy");
        } else if (plate.isEnoughFoodInPlate(appetite) == false){
            System.out.println("not enough food in a plate");
        }
    }

    @Override
    public String toString() {
        return name + ", appetite " + appetite;
    }
}

