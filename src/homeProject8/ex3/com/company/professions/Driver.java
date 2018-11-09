package homeProject8.ex3.com.company.professions;

import homeProject7.Person;

public class Driver extends Person {
    private double experience;

    public Driver(String fio, int age, double experience) {
        super(fio, age);
        this.experience = experience;
    }

    public Driver() {
    }

    public double getExperience() {
        return experience;
    }


    public void setExperience(double experience) {
        this.experience = experience;
    }
}
