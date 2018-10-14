package homeProject7;

public class Person {
    String fullName;
    int age;

    Person(){
        fullName = "Joseph Francis Tribbiani";
        age = 26;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(this.fullName + " is moving");
    }

    void talk() {
        System.out.println(this.fullName + " is talking");
    }
}
