package homeProject7;

public class PersonAction {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Rachel Karen Green", 24);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
