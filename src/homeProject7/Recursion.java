package homeProject7;

public class Recursion {
    public static void main(String[] args) {
        int a = 10, b = 18;

        aToB(a, b);

        bToA(a, b);

    }

    static int aToB(int a, int b) {
        if (b-- > a) {
            a = aToB(a, b) + 1;
        }
        System.out.println(a);
        return a;
    }

    static int bToA(int a, int b) {
        if (a < b) {
            a = bToA(++a, b) - 1;
        }
        System.out.println(a);
        return a;
    }
}
