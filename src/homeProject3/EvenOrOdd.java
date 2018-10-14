package homeProject3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            int i2 = i % 2;
            if (i2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
        } else {
            System.out.println("Введено не целое число");
        }
    }
}
