package homeProject8.Ex5;

public class Cat extends Animal {
    private boolean fur;
    private boolean wild;

    public Cat(String food, String location, boolean fur, boolean wild) {
        super(food, location);
        this.fur = fur;
        this.wild = wild;
    }

    public Cat(boolean fur, boolean wild) {
        this.fur = fur;
        this.wild = wild;
    }

    public Cat() {
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    @Override
    public void makeNoise(){
        System.out.println("Meooow");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
}
