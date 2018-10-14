package homeProject3;

import java.util.Scanner;

public class Summ {
        public static void main(String[] args) {
            int i1, i2 = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            if (sc.hasNextInt()) {
                i1 = sc.nextInt();
                System.out.println("Введите второе целое число: ");
                if (sc.hasNextInt()) {
                    i2 = sc.nextInt();
                } else {
                    System.out.println("Вторым аргументом введено не целое число");
                    System.exit(0);
                }
                System.out.println("Сумма введенных чисел: " + (i1+i2));
            } else {
                System.out.println("Первым аргументом введено не целое число");
            }
        }
}
