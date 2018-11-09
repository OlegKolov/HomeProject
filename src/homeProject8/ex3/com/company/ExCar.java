package homeProject8.ex3.com.company;

import homeProject8.ex3.com.company.details.Engine;
import homeProject8.ex3.com.company.professions.Driver;
import homeProject8.ex3.com.company.vehicles.Car;

public class ExCar {
    public static void main(String[] args) {
        Driver firstDriver = new Driver("Ivanov Ivan Ivanovich", 22, 2.5);
        Engine firstEngine = new Engine(200, "Volkswagen");
        Car firstCar = new Car("Volkswagen", "S", 2500, firstDriver, firstEngine);

        firstCar.start();
        firstCar.stop();
        firstCar.turnRight();
        firstCar.turnLeft();
        firstCar.printInfo();
    }
}
