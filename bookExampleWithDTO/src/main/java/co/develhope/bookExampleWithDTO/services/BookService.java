package co.develhope.bookExampleWithDTO.services;

import co.develhope.bookExampleWithDTO.DTO.BookCreationDTO;
import co.develhope.bookExampleWithDTO.DTO.BookUpdatePatchDTO;
import co.develhope.bookExampleWithDTO.entities.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(long id);
    Book createBook(BookCreationDTO book);
    Book checkAndUpdateBook(Long id, BookUpdatePatchDTO book);
    Book updateBook(Book book);
    Book deleteBook(long id);
    void deleteAllBooks();
    List<Book> searchBooks(String title, String author, String isbn);

}