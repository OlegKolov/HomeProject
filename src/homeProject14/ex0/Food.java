package homeProject14.ex0;

public class Food {
    public void prepare(Cookable c){
       c.cook();
    }

    public static void main(String[] args) {
        Food f = new Food();
        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("cooking anonim");
            }
        };

        f.prepare(c);
    }
}
