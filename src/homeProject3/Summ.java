package homeProject3;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        int i1, i2;
        Scanner sc = new Scanner(System.in);

            i1 = nextInt(sc);
            i2 = nextInt(sc);
            System.out.println("Сумма введенных чисел: " + (i1 + i2));
    }

    static int nextInt(Scanner sc) {
        int i2 = 0;
        System.out.println("Введите целое число: ");
        if (sc.hasNextInt()) {
            i2 = sc.nextInt();
        } else {
            System.out.println("Вторым аргументом введено не целое число");
            System.exit(0);
        }
        return i2;
    }
}
