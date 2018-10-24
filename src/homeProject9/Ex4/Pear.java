package homeProject9.Ex4;

public class Pear extends Fruit {
    final private double value = 13.30;
    private static double sum = 0;

    public Pear(double weight) {
        super(weight);
    }

    public Pear() {
    }

    public static double getSum() {
        return sum;
    }

    public static void setSum(double sum) {
        Pear.sum = sum;
    }

    public double getValue() {
        return value;
    }

    @Override
    public double cost() {
        sum += getWeight() * value;
        return getWeight() * value;
    }
}
