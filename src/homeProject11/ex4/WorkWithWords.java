package homeProject11.ex4;

public class WorkWithWords {
    public static void main(String[] args) {
        String centerChars0 = centerChars("String");
        System.out.println(centerChars0);
        String centerChars1 = centerChars("code");
        System.out.println(centerChars1);
        String centerChars2 = centerChars("Practice");
        System.out.println(centerChars2);
    }

    public static String centerChars(String line) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(line.charAt((line.length() - 1) / 2)).append(line.charAt((line.length() + 1) / 2));
        return sb.toString();
    }
}
