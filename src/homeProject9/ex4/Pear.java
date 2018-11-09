package homeProject9.ex4;

public class Pear extends Fruit {
    final private double VALUE = 13.30;
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
        return VALUE;
    }

    @Override
    public double cost() {
        sum += getWeight() * VALUE;
        return getWeight() * VALUE;
    }
}
