package homeProject12.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        String stringPattern = "[0-9]+";
        String text = "Если есть хвосты по дз, начните " +
                "с 1 не сданного задания. 123 324 111 4554";
        findWords(stringPattern, text);
    }

    public static void findWords(String stringPattern, String text) {
        boolean isPalindrome = true;
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = text.substring(matcher.start(), matcher.end());
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(word.length() - (i + 1))) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && word.length() != 1) {
                System.out.println(word);
            }
        }
    }
}
