package homeProject9.ex4;

public class Apple extends Fruit {
    final private double VALUE = 15.50;
    private static double sum = 0;

    public Apple(double weight) {
        super(weight);
    }

    public Apple() {
    }

    public static double getSum() {
        return sum;
    }

    public static void setSum(double sum) {
        Apple.sum = sum;
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
