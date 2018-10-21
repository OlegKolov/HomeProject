package homeProject8.Ex3.com.company.vehicles;

import homeProject8.Ex3.com.company.details.Engine;
import homeProject8.Ex3.com.company.professions.Driver;

public class Car {
    private String model;
    private String avtoClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String avtoClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.avtoClass = avtoClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAvtoClass() {
        return avtoClass;
    }

    public void setAvtoClass(String avtoClass) {
        this.avtoClass = avtoClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        print("Start moving");
    }

    public void stop() {
        print("Stop moving");
    }

    public void turnRight() {
        print("Turning right");
    }

    public void turnLeft() {
        print("Turning left");
    }

    public void print(String action) {
        System.out.println(action);
    }

    public void printInfo() {
        System.out.println("Avto: model - " + this.model + " class - " + this.avtoClass + " weight - " + this.weight);
        System.out.println("Driver: name - " + driver.getFullName() + " age - " + driver.getAge() + " experience - " + driver.getExperience());
        System.out.println("Engine: power - " + engine.getPower() + " manufacturer - " + engine.getManufacturer());
    }
}
