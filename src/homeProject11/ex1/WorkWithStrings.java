package homeProject11.ex1;

public class WorkWithStrings {
    public static void main(String[] args) {
        String line = "I like Java!!!";
        workWithString(line);
    }

    public static void workWithString(String line) {
        System.out.println("Last character is - " + line.charAt(line.length() - 1));
        System.out.println("Ends with '!!!' ? " + line.endsWith("!!!"));
        System.out.println("Starts with 'I like' ? " + line.startsWith("I like"));
        System.out.println("Start index of string 'Java' - " + line.indexOf("Java"));
        System.out.println("String after chang 'a' -> 'o' " + line.replace('a', 'o'));
        System.out.println("String after upper case " + line.toUpperCase());
        System.out.println("String after lower case " + line.toLowerCase());
        System.out.println("String after substring " + line.substring(line.indexOf("Java"), line.indexOf("Java") + "Java".length()));
    }
}
