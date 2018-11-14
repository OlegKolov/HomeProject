package homeProject12.ex0;

public class Ex0 {
    public static void main(String[] args) {
        String stringPattern = "\\s+";
        String text = "fffff ab f 1234 jkjk";
        findWords(stringPattern, text);
    }

    public static void findWords(String stringPattern, String text) {
        String result = "";
        int numSymbols = 0;
        String[] words = text.split(stringPattern);
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            int count = 0;
            do {
                char symbol = sb.charAt(0);
                count++;
                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) == symbol) {
                        sb.deleteCharAt(i--);
                    }
                }
            } while (sb.length() != 0);
            if (result.length() == 0) {
                result = w;
                numSymbols = count;
            }
            if (count < numSymbols) {
                result = w;
                numSymbols = count;
            }
        }
        System.out.printf("Word in which the number of different characters is minimal" +
                " is - %s it has - %d different symbols", result, numSymbols);
    }
}