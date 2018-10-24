package homeProject8.Ex5;

public class Dog extends Animal {
    private boolean curledTail;
    private boolean trained;

    public Dog(String food, String location, boolean curledTail, boolean trained) {
        super(food, location);
        this.curledTail = curledTail;
        this.trained = trained;
    }

    public Dog(boolean curledTail, boolean trained) {
        this.curledTail = curledTail;
        this.trained = trained;
    }

    public Dog() {
    }

    public boolean isCurledTail() {
        return curledTail;
    }

    public void setCurledTail(boolean curledTail) {
        this.curledTail = curledTail;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof-woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
