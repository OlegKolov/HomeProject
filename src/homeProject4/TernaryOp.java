package homeProject4;

import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        double d1 = enterMethod();
        double d2 = enterMethod();
        double d3 = enterMethod();

        double result = compareThreeNumber(d1, d2, d3);
        System.out.println(result + " - наименьшее число по модулю");
    }

    static double enterMethod() {
        Scanner sc = new Scanner(System.in);
        double d = 0;
        d = sc.nextDouble();
        if (sc.hasNextDouble()) {

        } else {
            System.out.println("Введено не вещественное число");
            System.exit(0);
        }
        return d;
    }

    static double compareThreeNumber(double d1, double d2, double d3) {
        double result = 0;
        result = (d2 < d1) && (d2 < d3) ? d2 : d1;
        result = (d3 < d1) && (d3 < d2) ? d3 : d1;
        return result;
    }
}
