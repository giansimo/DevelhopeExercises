package co.develhope.bookExampleWithDTO.DAO;

import co.develhope.bookExampleWithDTO.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class InMemoryBookDAO implements BookDAO {
    private final Map<Long, Book> books = new HashMap<>();
    private Long idCounter = 0L;

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book getBookById(Long id) {
        return books.get(id);
    }

    @Override
    public Book createBook(Book book) {
        book.setId(++idCounter);
        books.put(book.getId(), book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        if (!books.containsKey(book.getId())) {
            return null;
        }
        books.put(book.getId(), book);
        return book;
    }

    @Override
    public Book deleteBook(Long id) {
        if (!books.containsKey(id)) {
            return null;
        } else {
            Book book = books.get(id);
            books.remove(id);
            return book;
        }
    }


    @Override
    public void deleteAllBooks() {
        books.clear();
        idCounter = 0L;
    }

    @Override
    public List<Book> searchBooks(String title, String author, String isbn) {
        return books.values().stream()
                .filter(book ->
                        (title == null || book.getTitle().toLowerCase().contains(title.toLowerCase())) &&
                                (author == null || book.getAuthor().toLowerCase().contains(author.toLowerCase())) &&
                                (isbn == null || book.getIsbn().toLowerCase().contains(isbn.toLowerCase())))
                .collect(Collectors.toList());
    }

}