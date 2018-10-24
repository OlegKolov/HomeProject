package homeProject8.Ex5;

public class Horse extends Animal {
    private boolean horseshoes;
    private String usage;

    public Horse(String food, String location, boolean horseshoes, String usage) {
        super(food, location);
        this.horseshoes = horseshoes;
        this.usage = usage;
    }

    public Horse(boolean horseshoes, String usage) {
        this.horseshoes = horseshoes;
        this.usage = usage;
    }

    public Horse() {
    }

    public boolean isHorseshoes() {
        return horseshoes;
    }

    public void setHorseshoes(boolean horseshoes) {
        this.horseshoes = horseshoes;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neeeeeigh");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }
}
