package homeProject3;

public class TransType {
    public static void main(String[] args) {
        byteToSomething();
        shortToSomething();
        charToSomething();
        intToSomething();
        longToSomething();
        floatToSomething();
        doubleToSomething();
        booleanToSomething();
    }

     static void byteToSomething() {
        byte type = 13;
        byte b = type;
        short s = type;
        char c = (char) type;
        int i = type;
        long l = type;
        float f = type;
        double d = type;
    }

     static void shortToSomething() {
        short type = 13;
        byte b = (byte) type;
        short s = type;
        char c = (char) type;
        int i = type;
        long l = type;
        float f = type;
        double d = type;
    }

     static void charToSomething() {
        char type = 'o';
        byte b = (byte) type;
        short s = (short) type;
        char c = type;
        int i = type;
        long l = type;
        float f = type;
        double d = type;
    }

     static void intToSomething() {
        int type = 13;
        byte b = (byte) type;
        short s = (short) type;
        char c = (char) type;
        int i = type;
        long l = type;
        float f = type;
        double d = type;
    }

     static void longToSomething() {
        long type = 13;
        byte b = (byte) type;
        short s = (short) type;
        char c = (char) type;
        int i = (int) type;
        long l = type;
        float f = type;
        double d = type;
    }

     static void floatToSomething() {
        float type = 13.13f;
        byte b = (byte) type;
        short s = (short) type;
        char c = (char) type;
        int i = (int) type;
        long l = (long) type;
        float f = type;
        double d = type;
    }

     static void doubleToSomething() {
        double type = 13.13;
        byte b = (byte) type;
        short s = (short) type;
        char c = (char) type;
        int i = (int) type;
        long l = (long) type;
        float f = (float) type;
        double d = type;
    }

     static void booleanToSomething() {
        boolean type = true;
        boolean b = type;
    }
}
