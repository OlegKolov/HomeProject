package homeProject15.ex0;

public class Food {

    public void prepare(Lamda l) {
        l.test();
    }

    public static void main(String[] args) {
        Food f = new Food();

        f.prepare(() -> System.out.println("Cooking"));
    }
}
