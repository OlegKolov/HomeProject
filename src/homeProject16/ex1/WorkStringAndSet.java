package homeProject16.ex1;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        set.addAll(Arrays.asList(words));
        System.out.println(set);
    }
}
