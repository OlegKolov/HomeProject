package homeProject8.Ex3.com.company.vehicles;

import homeProject8.Ex3.com.company.details.Engine;
import homeProject8.Ex3.com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String model, String avtoClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, avtoClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
