package co.develhope.bookExampleWithDTO.DAO;

import co.develhope.bookExampleWithDTO.entities.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book createBook(Book book);
    Book updateBook(Book book);
    Book deleteBook(Long id);
    void deleteAllBooks();
    List<Book> searchBooks(String title, String author, String isbn);

}
