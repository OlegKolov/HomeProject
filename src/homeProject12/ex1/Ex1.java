package homeProject12.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        String stringPattern = "[a-zA-z]+\\s";
        String text = "One two three раз два три one1 two2 123";
        findWords(stringPattern, text);
    }

    public static void findWords(String stringPattern, String text) {
        int count = 0;
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}