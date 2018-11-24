package homeProject14.ex2;

public class Calc {

    static <T extends Number, V extends Number> double sum(T num0, V num1) {
        return num0.doubleValue() + num1.doubleValue();
    }

    static <T extends Number, V extends Number> double multiply(T num0, V num1) {
        return num0.doubleValue() * num1.doubleValue();
    }

    static <T extends Number, V extends Number> double divide(T num0, V num1) {
        return num0.doubleValue() / num1.doubleValue();
    }

    static <T extends Number, V extends Number> double subtraction(T num0, V num1) {
        return num0.doubleValue() - num1.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 3.3));
        System.out.println(multiply(1, 3.3));
        System.out.println(divide(1, 3.3));
        System.out.println(subtraction(1, 3.3));
    }
}
