package homeProject8.ex5;

public class ExAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog("pork", "London", true, false);
        Animal cat = new Cat("fish", "Manchester", false, false);
        Animal horse = new Horse("fish", "Southampton", true, "Horse racing");
        Vet vet = new Vet();

        Animal[] animals = {dog, cat, horse};
        for (Animal a : animals) {
            vet.treadAnimal(a);
        }
    }
}
