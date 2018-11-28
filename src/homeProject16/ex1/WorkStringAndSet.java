package homeProject16.ex1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class WorkStringAndSet {
    public static void main(String[] args) {
        String stringPattern = ".?\\s+";
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        Set<String> set = new HashSet<>() {
        };

        String[] words = text.split(stringPattern);
        for (String s : words
                ) {
            set.add(s);
        }
        System.out.println(set);
    }
}
