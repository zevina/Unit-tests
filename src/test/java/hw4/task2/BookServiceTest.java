package hw4.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    private InMemoryBookRepository bookRepository;
    private BookService bookService;


    @Test
    void findBookById() {
// Создаем мок InMemoryBookRepository
        InMemoryBookRepository bookRepository = mock(InMemoryBookRepository.class);

// Создаем объект BookService, передавая мок InMemoryBookRepository
        BookService bookService = new BookService(bookRepository);

// Задаем ожидаемый результат
        String bookId = "1";
        String expectedTitle = "More"; // Предположим, что у книги с bookId 1 такой титул
        String expectedAuthor = "Tolstoy"; // Предположим, что у книги с bookId 1 такой автор

// Устанавливаем ожидание вызова метода findById с bookId и возвращаем ожидаемый объект Book
        when(bookRepository.findById(bookId)).thenReturn(new Book(bookId, expectedTitle, expectedAuthor));

// Вызываем метод findBookById и проверяем, что результат соответствует ожиданиям
        String title = bookService.findBookById(bookId).getTitle();
        assertEquals(expectedTitle, title);
        String author = bookService.findBookById(bookId).getAuthor();
        assertEquals(expectedAuthor, author);

// Проверяем, что метод findById был вызван два раза с правильными аргументами
        verify(bookRepository, times(2)).findById(bookId);
    }

    @Test
    void testFindAllBooks() {
// Создаем мок InMemoryBookRepository
        InMemoryBookRepository bookRepository = mock(InMemoryBookRepository.class);

// Создаем объект BookService, передавая мок InMemoryBookRepository
        BookService bookService = new BookService(bookRepository);

// Задаем ожидаемый результат
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Book1", "Author1"));
        expectedBooks.add(new Book("2", "Book2", "Author2"));

// Устанавливаем ожидание вызова метода findAll и возвращаем ожидаемый список List<Book>
        when(bookRepository.findAll()).thenReturn(expectedBooks);

// Вызываем метод findAllBooks и проверяем, что результат соответствует ожиданиям
        List<Book> books = bookService.findAllBooks();
        assertEquals(expectedBooks, books);

// Проверяем, что метод findAll был вызван два раза с правильными аргументами
        verify(bookRepository, times(1)).findAll();
    }

}
