package homeProject9.ex4;

public class ExFruit {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(3.5);
        Fruit apple2 = new Apple(3.7);
        Fruit pear1 = new Pear(2.3);
        Fruit pear2 = new Pear(3.5);
        Fruit pear3 = new Pear(1.5);
        Fruit apricot1 = new Apricot(4.8);
        Fruit apricot2 = new Apricot(2.1);
        double result = 0;

        Fruit[] fruits = {apple1, apple2, pear1, pear2, pear3, apricot1, apricot2};

        for (Fruit f : fruits) {
            result += f.cost();
        }
        System.out.println(result);

        System.out.println(Apple.getSum());
        System.out.println(Pear.getSum());
        System.out.println(Apricot.getSum());
    }
}
