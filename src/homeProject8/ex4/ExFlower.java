package homeProject8.ex4;

public class ExFlower {
    public static void main(String[] args) {
        Flower flower1 = new Tulip("Holland", 14, 20);
        Flower flower2 = new Carnation("Turkey", 24, 15);
        Flower flower3 = new Rose("Ukraine", 7, 25);
        double bouquetPrice = 0;

        Flower[] bouquet = {flower1, flower2, flower3};
        for (Flower f : bouquet) {
            bouquetPrice += f.getPrice();
            Flower.increaseAmount();
        }

        System.out.println("Price of bouquet - " + bouquetPrice);
        System.out.println("Amount of sold flowers - " + Flower.getAmount());
    }
}
