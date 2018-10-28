package homeProject10.Ex2;

public class ExInstrument {
    public static void main(String[] args) {
        Instrument instrument1 = new Guitar(6);
        Instrument instrument2 = new Drum(3);
        Instrument instrument3 = new Trumpet(30);
        Instrument instrument4 = new Guitar(12);
        Instrument instrument5 = new Drum(2);
        Instrument instrument6 = new Trumpet(40);

        Instrument[] instruments = {instrument1, instrument2, instrument3, instrument4, instrument5, instrument6};

        for (Instrument i : instruments) {
            i.play();
        }
    }
}
