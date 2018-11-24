package homeProject14.ex1;

public class MinMax<T extends Number> {
    private T[] mass;

    public MinMax(T[] mass) {
        this.mass = mass;
    }

    public void minMax() {
        double min = mass[0].doubleValue();
        double max = mass[0].doubleValue();
        for (T num : mass) {
            min = (num.doubleValue() < min) ? num.doubleValue() : min;
        }
        for (T num : mass) {
            max = (num.doubleValue() > max) ? num.doubleValue() : max;
        }
        System.out.println("Min - " + min);
        System.out.println("Max - " + max);
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 2, 1, 7, 6};
        MinMax<Integer> iMinMax = new MinMax<>(intArray);
        iMinMax.minMax();

        Double[] doubleArray = {6.6, 3.3, 3.3, 8.8, 0.0};
        MinMax<Double> dMinMax = new MinMax<>(doubleArray);
        dMinMax.minMax();
    }
}
