package seminar3.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addBook() {
        Library library = new Library();
        Book book = new Book("More", "Tolstoy");
        library.addBook(book);
        assertTrue(library.searchAvailableBooks().contains(book));
    }

    @Test
    void removeBook() {
        Library library = new Library();
        Book book = new Book("More", "Tolstoy");
        library.addBook(book);
        library.removeBook(book);
        assertFalse(library.searchAvailableBooks().contains(book));
    }

    @Test
    void searchBooksByAuthor() {
        Library library = new Library();
        Book book1 = new Book("More", "Tolstoy");
        Book book2 = new Book("Volna", "Tolstoy");
        Book book3 = new Book("Karmen", "Lenin");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals(2, library.searchBooksByAuthor("Tolstoy").size());
        assertTrue(library.searchAvailableBooks().contains(book1));
        assertTrue(library.searchAvailableBooks().contains(book2));

        assertEquals(1, library.searchBooksByAuthor("Lenin").size());
        assertTrue(library.searchAvailableBooks().contains(book3));
    }

    @Test
    void searchAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("More", "Tolstoy");
        Book book2 = new Book("Volna", "Tolstoy");
        Book book3 = new Book("Karmen", "Lenin");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals(3, library.searchAvailableBooks().size());
    }

    @Test
    void borrowBook() {
        Library library = new Library();
        Book book1 = new Book("More", "Tolstoy");
        Book book2 = new Book("Volna", "Tolstoy");
        Book book3 = new Book("Karmen", "Lenin");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook(book2);

        assertEquals(2, library.searchAvailableBooks().size());
    }

    @Test
    void returnBook() {
        Library library = new Library();
        Book book1 = new Book("More", "Tolstoy");
        Book book2 = new Book("Volna", "Tolstoy");
        Book book3 = new Book("Karmen", "Lenin");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.borrowBook(book1);
        library.borrowBook(book2);
        library.returnBook(book2);

        assertEquals(2, library.searchAvailableBooks().size());
    }
}