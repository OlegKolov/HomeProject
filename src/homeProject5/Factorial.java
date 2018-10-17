package homeProject5;

public class Factorial {
    public static void main(String[] args) {
        double n = Math.random() * 10;
        System.out.println(n);
        double result = 1;
        for (int i = (int) n; i >= 1; i--) {
            result = result * n--;
        }
        System.out.println(result);
    }
}
