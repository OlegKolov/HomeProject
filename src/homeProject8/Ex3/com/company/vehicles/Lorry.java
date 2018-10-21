package homeProject8.Ex3.com.company.vehicles;

import homeProject8.Ex3.com.company.details.Engine;
import homeProject8.Ex3.com.company.professions.Driver;

public class Lorry extends Car {
    private int capacity;

    public Lorry(String model, String avtoClass, int weight, Driver driver, Engine engine, int capacity) {
        super(model, avtoClass, weight, driver, engine);
        this.capacity = capacity;
    }
}
