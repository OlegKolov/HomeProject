package homeProject8.ex4;

abstract public class Flower {
    private static int amount;
    private String name;
    private String manufacturer;
    private int storageLife;
    private double price;

    public Flower(String manufacturer, int storageLife, double price) {
        this.manufacturer = manufacturer;
        this.storageLife = storageLife;
        this.price = price;
    }

    public Flower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void increaseAmount() {
        ++amount;
    }

    public static int getAmount() {
        return amount;
    }
}
