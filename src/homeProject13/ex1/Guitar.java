package homeProject13.ex1;

import homeProject10.ex2.Instrument;

import java.util.Objects;

public class Guitar implements Instrument {
    private int stringsNumber;

    public Guitar(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    public Guitar() {
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public void setStringsNumber(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    @Override
    public void play() {
        System.out.println("Guitar with " + stringsNumber + " strings is playing");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return stringsNumber == guitar.stringsNumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(stringsNumber);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "stringsNumber=" + stringsNumber +
                '}';
    }
}
