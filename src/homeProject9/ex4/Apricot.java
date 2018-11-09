package homeProject9.ex4;

public class Apricot extends Fruit {
    final private double VALUE = 20;
    private static double sum = 0;

    public Apricot(double weight) {
        super(weight);
    }

    public Apricot() {
    }

    public double getValue() {
        return VALUE;
    }

    public static double getSum() {
        return sum;
    }

    public static void setSum(double sum) {
        Apricot.sum = sum;
    }

    @Override
    public double cost() {
        sum += getWeight() * VALUE;
        return getWeight() * VALUE;
    }
}
