package co.develhope.bookExampleWithDTO.services;

import co.develhope.bookExampleWithDTO.entities.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(long id);
    Book createBook(Book book);
    Book updateBook(long id, Book book);

    Book updateBook(Long id, Map<String, String> updates);

    Book deleteBook(long id);
    void deleteAllBooks();

    List<Book> searchBooks(String title, String author, String isbn);

}