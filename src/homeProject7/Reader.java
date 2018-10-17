package homeProject7;

public class Reader {
    private String fio;
    private int ID;
    private String facult;
    private String dateOfBirth;
    private String telefonNumber;

    public Reader(String fio, int ID, String facult, String dateOfBirth, String telefonNumber) {
        this.fio = fio;
        this.ID = ID;
        this.facult = facult;
        this.dateOfBirth = dateOfBirth;
        this.telefonNumber = telefonNumber;
    }

    void takeBook(int count) {
        System.out.println(this.fio + " took " + count + " books");
    }

    void takeBook(String... arrBook) {
        System.out.println(this.fio + " took books: ");
        for (int i = 0; i < arrBook.length; i++) {
            System.out.println(arrBook[i]);
        }
    }

    void takeBook(Book... objectBook) {
        System.out.println(this.fio + " took books: ");
        for (int i = 0; i < objectBook.length; i++) {
            System.out.print(objectBook[i].getTitle() + " ");
            System.out.println(objectBook[i].getAuthor());
        }
    }

    void returnBook(int count) {
        System.out.println(this.fio + " returned " + count + " books");
    }

    void returnBook(String... arrBook) {
        System.out.println(this.fio + " returned books: ");
        for (int i = 0; i < arrBook.length; i++) {
            System.out.println(arrBook[i]);
        }
    }

    void returnBook(Book... objectBook) {
        System.out.println(this.fio + " returned books: ");
        for (int i = 0; i < objectBook.length; i++) {
            System.out.print(objectBook[i].getTitle() + " ");
            System.out.println(objectBook[i].getAuthor());
        }
    }
}
