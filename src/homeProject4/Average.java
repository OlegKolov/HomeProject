package homeProject4;

public class Average {
    public static void main(String[] args) {
        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);
        double d3 = Double.parseDouble(args[2]);

        double result = compareThreeNumber(d1, d2, d3);
        System.out.println(result + " - среднее значение");
    }

    static double compareThreeNumber(double d1, double d2, double d3) {
        double result = (d1 + d2 + d3) / 3;
        return result;
    }
}
