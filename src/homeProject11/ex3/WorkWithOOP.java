package homeProject11.ex3;

public class WorkWithOOP {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("object oriented programming space object oriented programming space object oriented programming");
        System.out.println(sb.toString());
        do {
            sb.replace(sb.indexOf("object oriented programming"), sb.indexOf("object oriented programming") + "object oriented programming".length(), "OOP");
            System.out.println(sb.toString());
        }
        while (sb.indexOf("object oriented programming") != -1);
    }
}
