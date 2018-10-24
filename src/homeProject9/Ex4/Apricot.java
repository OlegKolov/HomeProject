package homeProject9.Ex4;

public class Apricot extends Fruit {
    final private double value = 20;
    private static double sum = 0;

    public Apricot(double weight) {
        super(weight);
    }

    public Apricot() {
    }

    public double getValue() {
        return value;
    }

    public static double getSum() {
        return sum;
    }

    public static void setSum(double sum) {
        Apricot.sum = sum;
    }

    @Override
    public double cost() {
        sum += getWeight() * value;
        return getWeight() * value;
    }
}
