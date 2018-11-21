package homeProject13.ex1;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        Class guitar0 = Guitar.class;
        printInfo(guitar0);
    }

    private static void printInfo(Class gClass) {
        System.out.println("Class name " + gClass.getName());
        System.out.println("Is Array? " + gClass.isArray());
        System.out.println("Is Interface? " + gClass.isInterface());
        System.out.println("Is Primitive? " + gClass.isPrimitive());
        System.out.println("Superclass is - " + gClass.getSuperclass());
        System.out.println("Constructors are - " + Arrays.toString(gClass.getConstructors()));
        System.out.println("Methods are - " + Arrays.toString(gClass.getMethods()));
        System.out.println();
    }

}
