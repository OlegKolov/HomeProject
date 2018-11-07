package homeProject11.ex2;

public class WorkWithReplace {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        int result0 = 3 + 56;
        int result1 = 3 - 56;
        int result2 = 3 * 56;

        StringBuilder sb0 = new StringBuilder(40);
        StringBuilder sb1 = new StringBuilder(40);
        StringBuilder sb2 = new StringBuilder(40);

        sb0.append(a).append(" + ").append(b).append(" = ").append(result0);
        System.out.println(sb0.toString());
        sb0.insert(sb0.indexOf("="), "равно");
        sb0.deleteCharAt(sb0.indexOf("="));
        System.out.println(sb0.toString());

        sb1.append(a).append(" - ").append(b).append(" = ").append(result1);
        System.out.println(sb1.toString());
        sb1.replace(sb1.indexOf("="), sb1.indexOf("=") + 1, "равно");
        System.out.println(sb1.toString());

        sb2.append(a).append(" * ").append(b).append(" = ").append(result2);
        System.out.println(sb2.toString());
        sb2.replace(sb2.indexOf("="), sb2.indexOf("=") + 1, "равно");
        System.out.println(sb2.toString());
    }
}
