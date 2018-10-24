package homeProject9.Ex4;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public Fruit() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    final public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double cost();
}
