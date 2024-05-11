package co.develhope.bookExampleWithDTO.services;

import co.develhope.bookExampleWithDTO.DAO.BookDAO;
import co.develhope.bookExampleWithDTO.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    public Book getBookById(long id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public Book createBook(Book book) {
        return bookDAO.createBook(book);
    }

    @Override
    public Book updateBook(long id, Book book) {
        return bookDAO.updateBook(id, book);
    }

    @Override
    public Book updateBook(Long id, Map<String, String> updates) {

        Book book = bookDAO.getBookById(id);

        if (book == null){
            return null;
        } else {
            // Effettua l'aggiornamento solo se sono presenti campi validi nell'oggetto di aggiornamento
            if (updates.containsKey("title")) {
                book.setTitle(updates.get("title"));
            }
            if (updates.containsKey("author")) {
                book.setAuthor(updates.get("author"));
            }

            if (updates.containsKey("isbn")) {
                book.setAuthor(updates.get("isbn"));
            }

            if (updates.containsKey("isAMasterpiece")) {
                book.setAuthor(updates.get("isAMasterpiece"));
            }
        }

        return bookDAO.updateBook(id, book);


    }

    @Override
    public Book deleteBook(long id) {
        return bookDAO.deleteBook(id);
    }

    @Override
    public void deleteAllBooks() {

        bookDAO.deleteAllBooks();
    }

    @Override
    public List<Book> searchBooks(String title, String author, String isbn) {
        // Effettua la ricerca dei libri utilizzando i parametri specificati
        return bookDAO.searchBooks(title, author, isbn);
    }

}