package homeProject7;

public class ExReaderBook {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Petrov O.I.", 666, "BF", "12.12.1982", "2345678");
        Book book1 = new Book("The Old Man and the Sea", "Ernest Hemingway");
        Book book2 = new Book("War and Peace", "Leo Tolstoy");
        Book book3 = new Book("The Count of Monte Cristo", "Alexandre Dumas");

        reader1.takeBook(3);
        reader1.takeBook("The Old Man and the Sea", "War and Peace", "The Count of Monte Cristo");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook("The Old Man and the Sea", "War and Peace", "The Count of Monte Cristo");
        reader1.returnBook(book1, book2, book3);
    }
}
