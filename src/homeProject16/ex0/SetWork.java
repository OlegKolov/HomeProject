package homeProject16.ex0;

import java.util.HashSet;
import java.util.Set;

public class SetWork {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>() {
        };
        set1.add(1);
        set1.add(5);
        set1.add(4);
        set1.add(6);
        set1.add(3);
        set1.add(2);
        Set<Integer> set2 = new HashSet<>() {
        };
        set2.add(2);
        set2.add(4);
        set2.add(8);
        set2.add(9);
        set2.add(3);
        set2.add(1);

        union(set1, set2);
        intersect(set1, set2);
    }

    public static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1) {
        };
        set.addAll(set2);
        System.out.println(set);
    }

    public static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>(set1) {
        };
        set.retainAll(set2);
        System.out.println(set);
    }
}
